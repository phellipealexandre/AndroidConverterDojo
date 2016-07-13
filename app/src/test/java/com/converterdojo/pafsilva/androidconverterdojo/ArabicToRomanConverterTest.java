package com.converterdojo.pafsilva.androidconverterdojo;

import com.converterdojo.pafsilva.androidconverterdojo.core.ArabicToRomanConverter;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArabicToRomanConverterTest {

    @Test
    public void shouldConvertToIWhenArabicIs1() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("1");

        assertEquals("I", result);
    }
}