package com.marketplace.vintage.item;

import com.marketplace.vintage.item.condition.ItemCondition;
import impl.MalaItem;
import impl.PremiumMalaItem;
import impl.PremiumSapatilhasItem;
import impl.SapatilhasItem;
import impl.TshirtItem;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class ItemFactory {

    public Item createItem(UUID ownerUuid, String alphanumericId, ItemType itemType, Map<ItemProperty, Object> itemProperties) {
        Item item;
        switch (itemType) {
            case MALA:
                item = createMala(ownerUuid, alphanumericId, itemProperties);
                break;
            case SAPATILHAS:
                item = createSapatilhas(ownerUuid, alphanumericId, itemProperties);
                break;
            case TSHIRT:
                item = createTshirt(ownerUuid, alphanumericId, itemProperties);
                break;
            case MALA_PREMIUM:
                item = createMalaPremium(ownerUuid, alphanumericId, itemProperties);
                break;
            case SAPATILHAS_PREMIUM:
                item = createSapatilhasPremium(ownerUuid, alphanumericId, itemProperties);
                break;
            default:
                throw new IllegalArgumentException("Invalid item type: " + itemType);
        }
        return item;
    }


    private Item createMala(UUID ownerUuid, String alphanumericId, Map<ItemProperty, Object> itemProperties) {
        return new MalaItem(ownerUuid,
                            alphanumericId,
                            getProperty(itemProperties, ItemProperty.STOCK, Integer.class),
                            getProperty(itemProperties, ItemProperty.ITEM_CONDITION, ItemCondition.class),
                            getProperty(itemProperties, ItemProperty.DESCRIPTION, String.class),
                            getProperty(itemProperties, ItemProperty.BRAND, String.class),
                            getProperty(itemProperties, ItemProperty.BASE_PRICE, BigDecimal.class),
                            getProperty(itemProperties, ItemProperty.PARCEL_CARRIER_NAME, String.class),
                            getProperty(itemProperties, ItemProperty.DIMENSION_AREA, Integer.class),
                            getProperty(itemProperties, ItemProperty.MATERIAL, String.class),
                            getProperty(itemProperties, ItemProperty.COLLECTION_YEAR, Integer.class),
                            getProperty(itemProperties, ItemProperty.DEPRECIATION_RATE_OVER_YEARS, Integer.class));
    }

    private Item createSapatilhas(UUID ownerUuid, String alphanumericId, Map<ItemProperty, Object> itemProperties) {
        return new SapatilhasItem(ownerUuid,
                                  alphanumericId,
                                  getProperty(itemProperties, ItemProperty.STOCK, Integer.class),
                                  getProperty(itemProperties, ItemProperty.ITEM_CONDITION, ItemCondition.class),
                                  getProperty(itemProperties, ItemProperty.DESCRIPTION, String.class),
                                  getProperty(itemProperties, ItemProperty.BRAND, String.class),
                                  getProperty(itemProperties, ItemProperty.BASE_PRICE, BigDecimal.class),
                                  getProperty(itemProperties, ItemProperty.PARCEL_CARRIER_NAME, String.class),
                                  getProperty(itemProperties, ItemProperty.SAPATILHA_SIZE, Integer.class),
                                  getProperty(itemProperties, ItemProperty.HAS_LACES, Boolean.class),
                                  getProperty(itemProperties, ItemProperty.COLOR, String.class),
                                  getProperty(itemProperties, ItemProperty.COLLECTION_YEAR, Integer.class));
    }

    private Item createTshirt(UUID ownerUuid, String alphanumericId, Map<ItemProperty, Object> itemProperties) {
        return new TshirtItem(ownerUuid,
                              alphanumericId,
                              getProperty(itemProperties, ItemProperty.STOCK, Integer.class),
                              getProperty(itemProperties, ItemProperty.ITEM_CONDITION, ItemCondition.class),
                              getProperty(itemProperties, ItemProperty.DESCRIPTION, String.class),
                              getProperty(itemProperties, ItemProperty.BRAND, String.class),
                              getProperty(itemProperties, ItemProperty.BASE_PRICE, BigDecimal.class),
                              getProperty(itemProperties, ItemProperty.PARCEL_CARRIER_NAME, String.class),
                              getProperty(itemProperties, ItemProperty.TSHIRT_SIZE, TshirtItem.TshirtItemSize.class),
                              getProperty(itemProperties, ItemProperty.TSHIRT_PATTERN, TshirtItem.TshirtItemPattern.class));
    }

    private Item createMalaPremium(UUID ownerUuid, String alphanumericId, Map<ItemProperty, Object> itemProperties) {
        return new PremiumMalaItem(ownerUuid,
                                   alphanumericId,
                                   getProperty(itemProperties, ItemProperty.STOCK, Integer.class),
                                   getProperty(itemProperties, ItemProperty.ITEM_CONDITION, ItemCondition.class),
                                   getProperty(itemProperties, ItemProperty.DESCRIPTION, String.class),
                                   getProperty(itemProperties, ItemProperty.BRAND, String.class),
                                   getProperty(itemProperties, ItemProperty.BASE_PRICE, BigDecimal.class),
                                   getProperty(itemProperties, ItemProperty.PARCEL_CARRIER_NAME, String.class),
                                   getProperty(itemProperties, ItemProperty.DIMENSION_AREA, Integer.class),
                                   getProperty(itemProperties, ItemProperty.MATERIAL, String.class),
                                   getProperty(itemProperties, ItemProperty.COLLECTION_YEAR, Integer.class),
                                   getProperty(itemProperties, ItemProperty.APPRECIATION_RATE_OVER_YEARS, Integer.class));
    }

    private Item createSapatilhasPremium(UUID ownerUuid, String alphanumericId, Map<ItemProperty, Object> itemProperties) {
        return new PremiumSapatilhasItem(ownerUuid,
                                         alphanumericId,
                                         getProperty(itemProperties, ItemProperty.STOCK, Integer.class),
                                         getProperty(itemProperties, ItemProperty.ITEM_CONDITION, ItemCondition.class),
                                         getProperty(itemProperties, ItemProperty.DESCRIPTION, String.class),
                                         getProperty(itemProperties, ItemProperty.BRAND, String.class),
                                         getProperty(itemProperties, ItemProperty.BASE_PRICE, BigDecimal.class),
                                         getProperty(itemProperties, ItemProperty.PARCEL_CARRIER_NAME, String.class),
                                         getProperty(itemProperties, ItemProperty.SAPATILHA_SIZE, Integer.class),
                                         getProperty(itemProperties, ItemProperty.HAS_LACES, Boolean.class),
                                         getProperty(itemProperties, ItemProperty.COLOR, String.class),
                                         getProperty(itemProperties, ItemProperty.COLLECTION_YEAR, Integer.class),
                                         getProperty(itemProperties, ItemProperty.APPRECIATION_RATE_OVER_YEARS, Integer.class));
    }

    private static <T> T getProperty(Map<ItemProperty, Object> itemProperties, ItemProperty itemProperty, Class<T> propertyClass /* needs to receive class to cast generic easily */) {
        if (!itemProperties.containsKey(itemProperty)) {
            throw new IllegalArgumentException("The item property " + itemProperty + " is required");
        }

        if (!itemProperty.getValueClass().equals(propertyClass)) {
            throw new IllegalArgumentException("The item property " + itemProperty + " is not of type " + propertyClass);
        }

        return propertyClass.cast(itemProperties.get(itemProperty));
    }
}
