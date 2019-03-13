package com.pairinggood;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

    @Test
    public void whenArabicNumberOneEntered_RomanNumeral_I_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(1);

        //assert
        Assert.assertEquals("I",romanNumeral);

    }

    @Test
    public void whenArabicNumberTwoEntered_RomanNumeral_II_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(2);

        //assert
        Assert.assertEquals("II",romanNumeral);

    }

    @Test
    public void whenArabicNumberThreeEntered_RomanNumeral_III_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(3);

        //assert
        Assert.assertEquals("III",romanNumeral);

    }

    @Test
    public void whenArabicNumberFourEntered_RomanNumeral_IV_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(4);

        //assert
        Assert.assertEquals("IV",romanNumeral);

    }

    @Test
    public void whenArabicNumberFiveEntered_RomanNumeral_V_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(5);

        //assert
        Assert.assertEquals("V",romanNumeral);

    }

    @Test
    public void whenArabicNumberSixEntered_RomanNumeral_VI_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(6);

        //assert
        Assert.assertEquals("VI",romanNumeral);

    }

    @Test
    public void whenArabicNumberNineEntered_RomanNumeral_IX_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(9);

        //assert
        Assert.assertEquals("IX",romanNumeral);

    }

    @Test
    public void whenArabicNumberTenEntered_RomanNumeral_X_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(10);

        //assert
        Assert.assertEquals("X",romanNumeral);

    }
}
