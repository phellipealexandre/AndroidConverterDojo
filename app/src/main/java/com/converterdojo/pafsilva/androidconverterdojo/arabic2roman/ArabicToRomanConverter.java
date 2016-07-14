package com.converterdojo.pafsilva.androidconverterdojo.arabic2roman;

public class ArabicToRomanConverter {

    public String convert(String arabicNumberStr) {
        String roman = "";
        int arabic = Integer.parseInt(arabicNumberStr);

        while (arabic != 0) {
            for (RomanSymbols symbol : RomanSymbols.values()) {
                if (arabic >= symbol.getValue()) {
                    roman += symbol.toString();
                    arabic -= symbol.getValue();
                    break;
                }
            }
        }

        return roman;
    }
}
