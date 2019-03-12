package com.pairinggood;

public class RomanNumeral {

    public String convert(int arabicNumber) {

        String romanNumeral = "";

        while (arabicNumber > 0) {
            romanNumeral = romanNumeral + "I";
            arabicNumber = arabicNumber - 1;

        }
        return romanNumeral;
    }
}