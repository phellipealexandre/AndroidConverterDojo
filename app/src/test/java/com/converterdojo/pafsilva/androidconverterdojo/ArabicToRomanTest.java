package com.converterdojo.pafsilva.androidconverterdojo;

import com.converterdojo.pafsilva.androidconverterdojo.converter.ArabicToRomanConverter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ArabicToRomanTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void convert1ToI() {
        // Given
        String number = "1";

        // When
        ArabicToRomanConverter converter = new ArabicToRomanConverter();
        String numberInRoman = converter.convert(number);

        // Then
        assertThat(numberInRoman, is("I"));

    }

    @Test
    public void convert5ToV() {
        // Given
        String number = "5";

        // When
        ArabicToRomanConverter converter = new ArabicToRomanConverter();
        String numberInRoman = converter.convert(number);

        // Then
        assertThat(numberInRoman, is("V"));
    }

}