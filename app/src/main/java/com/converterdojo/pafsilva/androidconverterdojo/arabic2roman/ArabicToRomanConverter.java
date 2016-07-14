package com.converterdojo.pafsilva.androidconverterdojo.arabic2roman;

import com.converterdojo.pafsilva.androidconverterdojo.common.Converter;

public class ArabicToRomanConverter implements Converter {

    public String convert(String arabicNumberStr) {
        String roman = "";
        int arabic = Integer.parseInt(arabicNumberStr);

        while (arabic != 0) {
            for (RomanSymbol symbol : RomanSymbol.values()) {
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
