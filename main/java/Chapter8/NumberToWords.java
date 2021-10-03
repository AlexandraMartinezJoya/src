import acm.program.ConsoleProgram;

/**
 * This program converts integer numbers into their worded equivalent
 */
public class NumberToWords extends ConsoleProgram {

    @SuppressWarnings("FieldCanBeLocal")
    private final int SENTINEL = -1;

    public void run() {
        println("This program converts numbers to words.");
        int number = readInt("Enter a number: ");
        while (number != SENTINEL) {
            String wordedNumber = numberToWords(number);
            println(wordedNumber);
            number = readInt("Enter a number: ");
        }
    }

    private String numberToWords (int number) {
        String wordNumber = "" + number;
        int InnerSmile = 1;
        if( wordNumber.length() == 7){
            wordNumber = getWordedNumberForMillions(number);
            InnerSmile++;
        }
        if (wordNumber.length() == 6){
            wordNumber = getWordNumberForHundredOfThousand(number);
            InnerSmile++;
        }
        if(wordNumber.length() == 5){
            wordNumber = getWordNumberForTenOfThousand(number);
            InnerSmile++;
        }
        if(wordNumber.length() == 4){
            wordNumber = getWordNumberForThousands(number);
            InnerSmile++;
        }
        if(wordNumber.length() == 3){
            wordNumber = getWordNumberForHundreds(number);
            InnerSmile++;
        }
        if(wordNumber.length() == 2){
            wordNumber = lessThanOneHundredToWord(number);
            InnerSmile++;
        }
        if(wordNumber.length() == 1) {
            wordNumber = lessThanTenToWord(number);
            InnerSmile++;
        }
        println("The count so far of inner smile is: " + InnerSmile);
        return wordNumber;
    }


    private String lessThanTenToWord(int number){
        @SuppressWarnings("UnnecessaryLocalVariable") // tis not
        String num = switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";
        };
        return num;
    }

    private String lessThanOneHundredToWord(int number){
        String numberGiven = "" + number;
        String num = "";
        if(number > 0){
            char digitTwo = numberGiven.charAt(1);
            char digitOne = numberGiven.charAt(0);
            num = isOne(digitOne) ? getWordNumberBetweenTenAndNineteen(digitOne, digitTwo) : getWordNumberBetweenTwentyAndNineteenNine(digitOne, digitTwo);
        }
        return num;
    }

    private String getWordNumberBetweenTenAndNineteen( char digitOne, char digitTwo){
        String number = "";
        if(isOne(digitOne)) {
            number =  getNumberAsString(digitTwo);
        }
        return number;
    }

    private boolean isOne(char number){
        return number == '1';
    }

    private String getNumberAsString(char secondDigitNumber){
        @SuppressWarnings("UnnecessaryLocalVariable")
        String number = switch (secondDigitNumber) {
            case '0' -> "Ten";
            case '1' -> "Eleven";
            case '2' -> "Twelve";
            case '3' -> "Thirteen";
            case '4' -> "Fourteen";
            case '5' -> "Fifteen";
            case '6' -> "Sixteen";
            case '7' -> "Seventeen";
            case '8' -> "Eighteen";
            case '9' -> "Nineteen";
            default -> "None";
        };
        return number;
    }

    private String getWordNumberBetweenTwentyAndNineteenNine(char digitOne, char digitTwo){
        @SuppressWarnings("UnusedAssignment")
        String number = "";
        String firstPartOfWordNumber = "";
        String secondPartOfWordNumber = "";
        switch (digitOne) {
            case '0', '1' -> firstPartOfWordNumber = "";
            case '2' -> firstPartOfWordNumber = "Twenty";
            case '3' -> firstPartOfWordNumber = "Thirty";
            case '4' -> firstPartOfWordNumber = "Forty";
            case '5' -> firstPartOfWordNumber = "Fifty";
            case '6' -> firstPartOfWordNumber = "Sixty";
            case '7' -> firstPartOfWordNumber = "Seventy";
            case '8' -> firstPartOfWordNumber = "Eighty";
            case '9' -> firstPartOfWordNumber = "Ninety";
        }

        switch (digitTwo) {
            case '0' -> secondPartOfWordNumber = "";
            case '1' -> secondPartOfWordNumber = "One";
            case '2' -> secondPartOfWordNumber = "Two";
            case '3' -> secondPartOfWordNumber = "Three";
            case '4' -> secondPartOfWordNumber = "Four";
            case '5' -> secondPartOfWordNumber = "Five";
            //high five !!
            case '6' -> secondPartOfWordNumber = "Six";
            case '7' -> secondPartOfWordNumber = "Seven";
            case '8' -> secondPartOfWordNumber = "Eight";
            case '9' -> secondPartOfWordNumber = "Nine";
        }
        number = firstPartOfWordNumber + " " + secondPartOfWordNumber;
        return number;
    }

    private String getWordNumberForHundreds(int number){
        String hundredsNum = "";
        String numberString = "" + number;
        char hundredsDigit = numberString.charAt(0);
        switch (hundredsDigit) {
            case '0' -> hundredsNum = "";
            case '1' -> hundredsNum = "One Hundred";
            case '2' -> hundredsNum = "Two Hundred";
            case '3' -> hundredsNum = "Three Hundred";
            case '4' -> hundredsNum = "Four Hundred";
            case '5' -> hundredsNum = "Five Hundred";
            case '6' -> hundredsNum = "Six Hundred";
            case '7' -> hundredsNum = "Seven Hundred";
            case '8' -> hundredsNum = "Eight Hundred";
            case '9' -> hundredsNum = "Nine Hundred";
        }

        int remainder = number % divideByMaxDigits(number);
        return hundredsNum + " " +  lessThanOneHundredToWord(remainder);
    }

    private String getWordNumberForThousands(int number){
        String thousandsNumber = "";
        String numberString = "" + number;
        char thousandsDigit = numberString.charAt(0);
        switch(thousandsDigit){
            case '0' -> thousandsNumber = "";
            case '1' -> thousandsNumber = "One Thousand";
            case '2' -> thousandsNumber = "Two Thousand";
            case '3' -> thousandsNumber = "Three Thousand";
            case '4' -> thousandsNumber = "Four Thousand";
            case '5' -> thousandsNumber = "Five Thousand";
            case '6' -> thousandsNumber = "Six Thousand";
            case '7' -> thousandsNumber = "Seven Thousand";
            case '8' -> thousandsNumber = "Eight Thousand";
            case '9' -> thousandsNumber = "Nine Thousand";
        }
        int remainder = number % divideByMaxDigits(number);
        return thousandsNumber + " " + getWordNumberForHundreds(remainder);
    }

    private String getWordNumberForTenOfThousand(int number){
        @SuppressWarnings("UnusedAssignment")  // Code is testable by unit tests with separation of init . this is not redundant. redundant is the inspection warning, and your mom
        String tenOfThousandWord = "";
        String num = "" + number;
        char tenThousand =  num.charAt(0);
        char thousands = num.charAt(1);
        String PartOne = isOne(tenThousand) ? getWordNumberBetweenTenAndNineteen(tenThousand, thousands) : getWordNumberBetweenTwentyAndNineteenNine(tenThousand, thousands);
        String PartTwo = " Thousand";
        tenOfThousandWord = PartOne + PartTwo;
        int remainder = number % (divideByMaxDigits(number) / 10)  ;
        return tenOfThousandWord + " " + getWordNumberForHundreds(remainder);
    }

    private String getWordNumberForHundredOfThousand(int number){
        @SuppressWarnings("UnusedAssignment")// Code is testable by unit tests with separation of init . this is not redundant. redundant is the inspection warning, and your mom
        String hundredOfThousand = "";
        String partOne = getWordNumberForHundreds(number);
        String partTwo = " Thousand";
        hundredOfThousand = partOne + partTwo;
        int remainder = number % (divideByMaxDigits(number) / 100);
        return hundredOfThousand + " " + getWordNumberForHundreds(remainder);
    }

    private String getWordedNumberForMillions(int number){
        String millions = "";
        String num = ""+ number;
        char millionsChar =  num.charAt(0);
        switch (millionsChar){
            case '0' -> millions = "";
            case '1' -> millions = "One Million";
            case '2' -> millions = "Two Million";
            case '3' -> millions = "Three Million";
            case '4' -> millions = "Four Million";
            case '5' -> millions = "Five Million";
            case '6' -> millions = "Six Million";
            case '7' -> millions = "Seven Million";
            case '8' -> millions = "Eight Million";
            case '9' -> millions = "Nine Million";
        }
        String theRest = "";
        int remainder = number % divideByMaxDigits(number);
        String remainingAsString = "" + remainder;
        int remainderLength = remainingAsString.length();
        switch (remainderLength) {
            case 0 -> theRest = "";
            case 1 -> theRest = lessThanTenToWord(remainder);
            case 2 -> theRest = lessThanOneHundredToWord(remainder);
            case 3 -> theRest = getWordNumberForHundreds(remainder);
            case 4 -> theRest = getWordNumberForThousands(remainder);
            case 5 -> theRest = getWordNumberForTenOfThousand(remainder);
            case 6 -> theRest = getWordNumberForHundredOfThousand(remainder);
        }

        return millions + "  " + theRest;
    }

    private int divideByMaxDigits(int number){
        String numberToString = ""+ number;
        int toDivide = 1;
        for (int i = 0; i < numberToString.length() -1; i++){
            toDivide *= 10;
        }
        return toDivide;
    }
}
