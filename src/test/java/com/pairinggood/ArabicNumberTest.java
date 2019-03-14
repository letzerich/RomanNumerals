package com.pairinggood;

import org.junit.Assert;
import org.junit.Test;

public class ArabicNumberTest {

    @Test
    public void whenRomanRomanNumeral_I_EnteredArabicNumber_1_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("I");

        Assert.assertEquals(1, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_II_EnteredArabicNumber_2_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("II");

        Assert.assertEquals(2, arabicNumber);
    }
}
