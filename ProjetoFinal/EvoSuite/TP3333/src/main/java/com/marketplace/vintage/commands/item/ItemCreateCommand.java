package com.marketplace.vintage.commands.item;

import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrier;
import com.marketplace.vintage.command.BaseCommand;
import com.marketplace.vintage.input.InputMapper;
import com.marketplace.vintage.input.InputPrompter;
import com.marketplace.vintage.input.questionnaire.QuestionnaireBuilder;
import com.marketplace.vintage.item.Item;
import com.marketplace.vintage.item.ItemProperty;
import com.marketplace.vintage.item.ItemType;
import impl.TshirtItem;
import com.marketplace.vintage.logging.Logger;
import com.marketplace.vintage.utils.StringUtils;
import com.marketplace.vintage.view.impl.UserView;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ItemCreateCommand extends BaseCommand {

    private final UserView userView;
    private final Vintage vintage;

    public ItemCreateCommand(UserView userView, Vintage vintage) {
        super("create", "item create (customId)", 0, "Create a new item");
        this.userView = userView;
        this.vintage = vintage;
    }

    private static final List<String> ITEM_TYPES_DISPLAY_NAMES = Arrays.stream(ItemType.values()).map(ItemType::getDisplayName).collect(Collectors.toList());

    // These methods are here because they are only related to this command and would mess up the ItemProperty enum a lot if used there
    private String getQuestion(ItemProperty itemProperty) {
        String question;
        switch (itemProperty) {
            case STOCK:
                question = "Insert initial item stock: (1-20)";
                break;
            case ITEM_CONDITION:
                question = "Insert the item condition (new, used):";
                break;
            case DESCRIPTION:
                question = "Insert the item description:";
                break;
            case BRAND:
                question = "Insert the item brand:";
                break;
            case BASE_PRICE:
                question = "Insert the item base price:";
                break;
            case PARCEL_CARRIER_NAME:
                question = "Insert the item parcel carrier to use:";
                break;
            case DIMENSION_AREA:
                question = "Insert the bag dimension area:";
                break;
            case MATERIAL:
                question = "Insert the item material:";
                break;
            case COLLECTION_YEAR:
                question = "Insert the item collection year:";
                break;
            case APPRECIATION_RATE_OVER_YEARS:
                question = "Insert the item appreciation rate over years in percentage (0-100):";
                break;
            case DEPRECIATION_RATE_OVER_YEARS:
                question = "Insert the item depreciation rate over years in percentage (0-100):";
                break;
            case SAPATILHA_SIZE:
                question = "Insert the sapatilha size (5-50):";
                break;
            case HAS_LACES:
                question = "Insert if the sapatilha has laces (y/n):";
                break;
            case COLOR:
                question = "Insert the item color:";
                break;
            case TSHIRT_SIZE:
                question = "Insert the tshirt size (small, medium, large, extra large):";
                break;
            case TSHIRT_PATTERN:
                question = "Insert the tshirt pattern (plain, stripes, palm trees):";
                break;
            default:
                question = "Unknown item property";
                break;
        }
        return question;
    }

    private Function<String, ?> getMapper(ItemProperty itemProperty, Logger logger, InputPrompter inputPrompter, Function<String, String> parcelCarrierIdToNameMapper) {
        Function<String, ?> mapper;
        switch (itemProperty) {
            case STOCK:
                mapper = InputMapper.ofIntRange(1, 20);
                break;
            case ITEM_CONDITION:
                mapper = InputMapper.ofItemCondition(inputPrompter, logger);
                break;
            case DESCRIPTION:
            case BRAND:
            case MATERIAL:
            case COLOR:
                mapper = InputMapper.STRING;
                break;
            case BASE_PRICE:
                mapper = InputMapper.BIG_DECIMAL;
                break;
            case PARCEL_CARRIER_NAME:
                mapper = parcelCarrierIdToNameMapper;
                break;
            case DIMENSION_AREA:
                mapper = InputMapper.ofIntRange(1, 100);
                break;
            case COLLECTION_YEAR:
                mapper = InputMapper.ofIntRange(1000, 3000);
                break;
            case APPRECIATION_RATE_OVER_YEARS:
            case DEPRECIATION_RATE_OVER_YEARS:
                mapper = InputMapper.ofIntRange(0, 100);
                break;
            case SAPATILHA_SIZE:
                mapper = InputMapper.ofIntRange(5, 50);
                break;
            case HAS_LACES:
                mapper = InputMapper.BOOLEAN;
                break;
            case TSHIRT_SIZE:
                mapper = InputMapper.ofEnumValues(TshirtItem.TshirtItemSize.class);
                break;
            case TSHIRT_PATTERN:
                mapper = InputMapper.ofEnumValues(TshirtItem.TshirtItemPattern.class);
                break;
            default:
                throw new IllegalArgumentException("Unknown item property");
        }
        return mapper;
    }


    @Override
    protected void executeSafely(Logger logger, InputPrompter inputPrompter, String[] args) {
        logger.info("Choose the type of item you want to create:");
        logger.info(StringUtils.joinQuoted(ITEM_TYPES_DISPLAY_NAMES, ", "));

        ItemType itemType = inputPrompter.askForInput(logger, "Insert the item type:", ItemType::fromDisplayName);

        List<ParcelCarrier> parcelCarrierCompatibleList = vintage.getAllParcelCarriersCompatibleWith(itemType);

        if (parcelCarrierCompatibleList.isEmpty()) {
            logger.warn("There are no parcel carriers compatible with " + itemType.getDisplayName() + ". Please contact the administrator.");
            return;
        }

        QuestionnaireBuilder questionnaireBuilder = QuestionnaireBuilder.newBuilder();

        Set<ItemProperty> itemProperties = itemType.getRequiredProperties();

        Function<String, String> parcelCarrierNameToIdMapper = getParcelCarrierNameToIdMapper(itemType, parcelCarrierCompatibleList);

        for (ItemProperty itemProperty : itemProperties) {
            questionnaireBuilder.withQuestion(itemProperty.name(), getQuestion(itemProperty), getMapper(itemProperty, logger, inputPrompter, parcelCarrierNameToIdMapper));
        }

        Map<String, Object> answersMap = questionnaireBuilder.build().ask(inputPrompter, logger).getAnswersMap();

        Map<ItemProperty, Object> itemPropertiesMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : answersMap.entrySet()) {
            itemPropertiesMap.put(ItemProperty.valueOf(entry.getKey()), entry.getValue());
        }


        String customId = args.length > 0 ? args[0] : null;

        Item item = vintage.registerNewItem(customId, userView.getCurrentLoggedInUser(), itemType, itemPropertiesMap);

        logger.info("Registered item " + itemType.getDisplayName() + " (" + item.getAlphanumericId() + ") successfully.");
    }

    @NotNull
    private Function<String, String> getParcelCarrierNameToIdMapper(ItemType itemType, List<ParcelCarrier> parcelCarrierCompatibleList) {
        return (String input) -> {
            if (!vintage.containsCarrierByName(input)) {
                throw new IllegalArgumentException("Parcel carrier must be one of " + StringUtils.joinQuoted(parcelCarrierCompatibleList, ParcelCarrier::getName, ", "));
            }

            ParcelCarrier carrier = vintage.getCarrierByName(input);
            if (!carrier.canDeliverItemType(itemType)) {
                throw new IllegalArgumentException("Parcel carrier " + carrier.getName() + " cannot deliver item type " + itemType.getDisplayName());
            }
            return carrier.getName();
        };
    }
}
