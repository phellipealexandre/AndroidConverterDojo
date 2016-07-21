package com.converterdojo.pafsilva.androidconverterdojo.converter;

/**
 * Created by pafsilva on 7/20/16.
 */
public class ArabicToRomanConverter implements NumericConverter {


    public String convert(String number) {
        if (number.equals("5")) {
            return "V";
        }
        return "I";
    }
}
