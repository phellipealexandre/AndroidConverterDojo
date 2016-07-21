package com.converterdojo.pafsilva.androidconverterdojo;

import com.converterdojo.pafsilva.androidconverterdojo.converter.RomanToArabicConverter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by pafsilva on 7/20/16.
 */
public class RomanToArabicConverterTest {

    @Test
    public void shouldConvertIto1() throws Exception {
        // given
        String romanI = "I";

        //when
        RomanToArabicConverter converter = new RomanToArabicConverter();
        String arabic1 = converter.convert(romanI);

        //then
        assertEquals(arabic1, "1");
    }
}
