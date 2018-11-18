package com.damianfanaro.coding.practice.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.damianfanaro.coding.practice.SystemOutUtil.println;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public final class HuffmanDecoder {

    private static final String TAB_CHARACTER = "\t";
    private static final String NEW_LINE_CHARACTER = "\n";
    private static final String NEW_LINE_STRING = "[newline]";

    public static void main(String[] args) {
        List<String> codes = getCodesExample1();
        String decoded = decode(codes, "111110000001100100111111100101110001111110");
        println(decoded);

        codes = getCodesExample2();
        decoded = decode(codes, "100100");
        println(decoded);
    }

    private static List<String> getCodesExample1() {
        return asList(
                "a	100100",
                "b	100101",
                "c	110001",
                "d	100000",
                "[newline]	111111",
                "p	111110",
                "q	000001");
    }

    private static List<String> getCodesExample2() {
        return singletonList("a	100100");
    }

    private static String decode(List<String> codes, String encoded) {
        Map<String, String> mappingCodes = prepareMappingCodes(codes);
        StringBuilder decoded = new StringBuilder();
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < encoded.length(); i++) {
            buffer.append(encoded.charAt(i));
            String bufferIsActualCode = mappingCodes.get(buffer.toString());
            if (bufferIsActualCode != null) {
                decoded.append(bufferIsActualCode);
                buffer = new StringBuilder();
            }
        }

        return decoded.toString();
    }

    private static Map<String, String> prepareMappingCodes(List<String> codes) {
        Map<String, String> mappingCodes = new HashMap<>();
        for (String code : codes) {
            String[] codeParts = code.split(TAB_CHARACTER);
            codeParts[0] = NEW_LINE_STRING.equals(codeParts[0]) ? NEW_LINE_CHARACTER : codeParts[0];
            mappingCodes.put(codeParts[1], codeParts[0]);
        }
        return mappingCodes;
    }

}
