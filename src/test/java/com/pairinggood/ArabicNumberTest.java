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

    @Test
    public void whenRomanRomanNumeral_III_EnteredArabicNumber_3_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("III");

        Assert.assertEquals(3, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_V_EnteredArabicNumber_5_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("V");

        Assert.assertEquals(5, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_IX_EnteredArabicNumber_9_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("IX");

        Assert.assertEquals(9, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_X_EnteredArabicNumber_10_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("X");

        Assert.assertEquals(10, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_L_EnteredArabicNumber_50_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("L");

        Assert.assertEquals(50, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_C_EnteredArabicNumber_100_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("C");

        Assert.assertEquals(100, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_D_EnteredArabicNumber_500_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("D");

        Assert.assertEquals(500, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_CM_EnteredArabicNumber_900_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("CM");

        Assert.assertEquals(900, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_M_EnteredArabicNumber_1000_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("M");

        Assert.assertEquals(1000, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_XXXVII_EnteredArabicNumber_37_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("XXXVII");

        Assert.assertEquals(37, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_XXXIV_EnteredArabicNumber_34_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("XXXIV");

        Assert.assertEquals(34, arabicNumber);
    }

    @Test
    public void whenRomanRomanNumeral_MLXVI_EnteredArabicNumber_1066_Returned(){

        ArabicNumber converter = new ArabicNumber();

        int arabicNumber = converter.convert("MLXVI");

        Assert.assertEquals(1066, arabicNumber);
    }
}
