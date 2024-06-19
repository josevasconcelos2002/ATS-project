package View;

import View.Output;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class OutputTest {


    private String getExpectedMenuOutput(String[] menu, String message, int type) {
        StringBuilder expectedOutput = new StringBuilder();
        int length = Math.max(message.length(), Arrays.stream(menu).mapToInt(String::length).max().orElse(0)) + 4;
        expectedOutput.append(getLine(length)).append("\n");
        expectedOutput.append(message).append("\n");
        expectedOutput.append(getLine(length)).append("\n");
        for (int i = 0; i < menu.length; i++) {
            expectedOutput.append(i + 1).append(" | ").append(menu[i]).append("\n");
        }
        if (type == 0) {
            expectedOutput.append("0 | Sair").append("\n");
        } else {
            expectedOutput.append("0 | Voltar atrás").append("\n");
        }
        expectedOutput.append(getLine(length)).append("\n");
        return expectedOutput.toString();
    }

    private String getLine(int size) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < size; i++) {
            line.append("-");
        }
        return line.toString();
    }

    @Test
    public void testPrintMessage() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Output output = new Output();
        String message = "Test Message";
        output.printMessage(message);
        assertEquals("Test Message", outContent.toString().trim());
    }

    // Similarly, you can write tests for other methods like printTransportadoras, printArtigos, etc.
}

