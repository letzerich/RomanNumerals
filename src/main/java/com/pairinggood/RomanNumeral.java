package com.pairinggood;

public class RomanNumeral {

    public String convert(int arabicNumber) {

        String romanNumeral = "";

        while (arabicNumber > 0) {

            if (arabicNumber >= 5) {

                arabicNumber = arabicNumber - 5;
                romanNumeral = romanNumeral + "V";
            }

            if (arabicNumber == 4) {

                arabicNumber = arabicNumber - 4;
                romanNumeral = romanNumeral + "IV";
            }

            if (arabicNumber > 0) {
                romanNumeral = romanNumeral + "I";
                arabicNumber = arabicNumber - 1;
            }
        }
        return romanNumeral;
    }
}