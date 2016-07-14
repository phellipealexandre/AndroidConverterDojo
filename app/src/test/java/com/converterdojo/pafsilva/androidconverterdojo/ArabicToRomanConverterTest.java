package com.converterdojo.pafsilva.androidconverterdojo;

import android.util.Log;

import com.converterdojo.pafsilva.androidconverterdojo.arabic2roman.ArabicToRomanConverter;
import com.converterdojo.pafsilva.androidconverterdojo.arabic2roman.RomanSymbols;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArabicToRomanConverterTest {

    @Test
    public void shouldConvertToIWhenArabicIs1() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("1");

        assertEquals("I", result);
    }

    @Test
    public void shouldConvertToIIWhenArabicIs2() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("2");

        assertEquals("II", result);
    }

    @Test
    public void shouldConvertToIIIWhenArabicIs3() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("3");

        assertEquals("III", result);
    }

    @Test
    public void shouldConvertToVWhenArabicIs5() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("5");

        assertEquals("V", result);
    }

    @Test
    public void shouldConvertToXWhenArabicIs10() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("10");

        assertEquals("X", result);
    }

    @Test
    public void shouldConvertToLWhenArabicIs50() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("50");

        assertEquals("L", result);
    }

    @Test
    public void shouldConvertToCWhenArabicIs100() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("100");

        assertEquals("C", result);
    }

    @Test
    public void shouldConvertToDWhenArabicIs500() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("500");

        assertEquals("D", result);
    }

    @Test
    public void shouldConvertToMWhenArabicIs1000() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("1000");

        assertEquals("M", result);
    }

    @Test
    public void shouldConvertToVIWhenArabicIs6() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("6");

        assertEquals("VI", result);
    }

    @Test
    public void shouldConvertToVIIWhenArabicIs7() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("7");

        assertEquals("VII", result);
    }

    @Test
    public void shouldConvertToVIIIWhenArabicIs8() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("8");

        assertEquals("VIII", result);
    }

    @Test
    public void shouldConvertToXIIIWhenArabicIs13() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("8");

        assertEquals("VIII", result);
    }

    @Test
    public void shouldConvertToIVWhenArabicIs4() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("4");

        assertEquals("IV", result);
    }

    @Test
    public void shouldConvertToIXVWhenArabicIs9() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("9");

        assertEquals("IX", result);
    }

    @Test
    public void shouldConvertToXXIXVWhenArabicIs29() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("29");

        assertEquals("XXIX", result);
    }

    @Test
    public void shouldConvertToXLIXVWhenArabicIs49() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("49");

        assertEquals("XLIX", result);
    }

    @Test
    public void shouldConvertToLXXXVIIIVWhenArabicIs88() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("88");

        assertEquals("LXXXVIII", result);
    }

    @Test
    public void shouldConvertToDCCCXCWhenArabicIs890() throws Exception {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        String result = converter.convert("890");

        assertEquals("DCCCXC", result);
    }


}