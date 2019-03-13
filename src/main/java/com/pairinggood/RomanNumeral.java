package com.pairinggood;

public class RomanNumeral {

    public String convert(int arabicNumber) {

        String romanNumeral = "";

        while (arabicNumber > 0) {

            if (arabicNumber == 99) {

                arabicNumber = arabicNumber - 99;
                romanNumeral = romanNumeral + "IC";
            }

            if (arabicNumber >= 50) {

                arabicNumber = arabicNumber - 50;
                romanNumeral = romanNumeral + "L";
            }

            if (arabicNumber == 49) {

                arabicNumber = arabicNumber - 49;
                romanNumeral = romanNumeral + "IL";
            }

            if (arabicNumber >= 10) {

                arabicNumber = arabicNumber - 10;
                romanNumeral = romanNumeral + "X";
            }

            if (arabicNumber == 9) {

                arabicNumber = arabicNumber - 9;
                romanNumeral = romanNumeral + "IX";
            }

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