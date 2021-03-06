package com.pairinggood;

public class ArabicNumber {

    public int convert(String romanNumeral) {

        int arabicNumber = 0;

        if (romanNumeral.contains("IV")) {
            arabicNumber = arabicNumber +4;
                    romanNumeral = romanNumeral.replace("IV", "");
        }

        if (romanNumeral.contains("IX")) {
            arabicNumber = arabicNumber +9;
                    romanNumeral = romanNumeral.replace("IX", "");
        }

        if (romanNumeral.contains("CM")) {
            arabicNumber = arabicNumber +900;
                    romanNumeral = romanNumeral.replace("CM", "");
        }

        final char[] letters = romanNumeral.toCharArray();

        arabicNumber = convertRomanToArabic(arabicNumber, letters);

        return arabicNumber;
    }

    private int convertRomanToArabic(int arabicNumber, char[] letters) {
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
