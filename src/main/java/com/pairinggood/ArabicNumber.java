package com.pairinggood;

public class ArabicNumber {

    public int convert(String romanNumeral) {

        final char[] letters = romanNumeral.toCharArray();

        int arabicNumber = 0;

        for (char letter : letters) {

            if (letter == 'I') {

                arabicNumber = arabicNumber + 1;
            }

            if (letter == 'V') {

                arabicNumber = arabicNumber + 5;
            }

            if (letter == 'X') {

                arabicNumber = arabicNumber + 10;
            }

            if (letter == 'L') {

                arabicNumber = arabicNumber + 50;
            }

        }

        return arabicNumber;
    }
}
