package com.pairinggood;

public class ArabicNumber {

    public int convert(String romanNumeral) {

        int arabicNumber = 0;

        if (romanNumeral.contains("IV")) {
            arabicNumber = arabicNumber +4;
                    romanNumeral = romanNumeral.replace("IV", "");
        }

        final char[] letters = romanNumeral.toCharArray();

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

            if (letter == 'C') {

                arabicNumber = arabicNumber + 100;
            }

            if (letter == 'D') {

                arabicNumber = arabicNumber + 500;
            }

            if (letter == 'M') {

                arabicNumber = arabicNumber + 1000;
            }

        }

        return arabicNumber;
    }
}
