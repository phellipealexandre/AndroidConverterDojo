package com.converterdojo.pafsilva.androidconverterdojo.common;

import com.converterdojo.pafsilva.androidconverterdojo.arabic2roman.ArabicToRomanConverter;

public class ConverterFactory {

    public static Converter createConverter(NumericSystem from, NumericSystem to) {
        return from.equals(to) ? new SameSystemConverter() : new ArabicToRomanConverter();
    }
}
