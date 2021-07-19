package Chapter7;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

/**
 * Bur don't panic! Base 8 is just like base 10 really - if you're missing two fingers
 *  -- Tom Lether, The New Math , 1965
 */

public class OctalMathQuiz extends ConsoleProgram {

    /**
     * Private constants
     */
    private final int QUESTION_LIMIT = 4;

    /**
     * instance variables
     */
    RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {
        println("Welcome to the Octal Math Quiz!");
        int answerCount = 0;
        while(answerCount <= QUESTION_LIMIT) {
            int differentAnswerCount = 0;
            int firstNumber = rgen.nextInt(1, 20);
            int secondNumber = rgen.nextInt(1, 20);
            boolean isPlus = rgen.nextBoolean();
            String question = generateMathQuizQuestion(firstNumber, secondNumber, isPlus);
            if(isValidQuestion(firstNumber, secondNumber, isPlus)){
                int answer = getMathQuizAnswer(question);
                boolean isCorrectAnswer = false;
                try {
                    isCorrectAnswer = checkAnswer(firstNumber, secondNumber, isPlus, answer);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if(isCorrectAnswer){
                    println(getRandomEncouragementMessage());
                    answerCount++;
                }
                while(!isCorrectAnswer) {
                    differentAnswerCount++;
                    question = "That is incorrect! Try a different answer";
                    answer = getMathQuizAnswer(question);
                    try {
                        isCorrectAnswer = checkAnswer(firstNumber, secondNumber, isPlus, answer);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if(isCorrectAnswer) {
                        println(getRandomEncouragementMessage());
                        answerCount++;
                    }
                    if(differentAnswerCount == 2) {
                        int correctAnswer = 0;
                        try {
                            correctAnswer = getCorrectAnswer(firstNumber, secondNumber, isPlus);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        println("No, the answer is " + correctAnswer);
                        answerCount++;
                        break;
                    }
                }
            }
        }
        println("Thank you for participating! Math quiz is now over");
    }

    private String generateMathQuizQuestion(int firstNumber, int secondNumber, boolean isPlus){
        return "What is " + firstNumber + plusOrMinus(isPlus) + secondNumber +" ?";
    }

    private String plusOrMinus(boolean isPlus) {
        return isPlus ? " + " : " - ";
    }

    private boolean isValidQuestion(int firstNumber, int secondNumber, boolean isPlus) {
        boolean flag = true;
        if(isPlus){
            int answer = firstNumber + secondNumber;
            if (answer > 20) {
                flag = false;
            }
        } else {
            int answer = firstNumber - secondNumber;
            if (answer < 0) {
                flag = false;
            }
        }
        if (firstNumber > 20 || secondNumber > 20 ) {
            flag = false;
        }
        return flag;
    }

    private int getMathQuizAnswer(String question){
        return   readInt(question);
    }

    private boolean checkAnswer(int firstNumber, int secondNumber, boolean isPlus, int userAnswer) throws Exception {
        int answer;
        boolean isCorrect = true;
        if(isPlus) {
            answer = firstNumber + secondNumber;
            answer = baseEight(answer);
            if (userAnswer != answer){
                isCorrect = false;
            }
        } else {
            answer = firstNumber - secondNumber;
            answer = baseEight(answer);
            if( userAnswer != answer) {
                isCorrect = false;
            }
        }
        return isCorrect;
    }

    private int getCorrectAnswer(int firstNumber, int secondNumber, boolean isPlus) throws Exception {
        int answer;
        if(isPlus){
            answer = firstNumber + secondNumber;
        } else {
            answer = firstNumber - secondNumber;
        }
        answer = baseEight(answer);
        return  answer;
    }

    private String getRandomEncouragementMessage() {
        String message;
        int messageNumber = rgen.nextInt(1, 5);
        message = switch (messageNumber) {
            case 1 -> "Great ! You got it!";
            case 2 -> "Amazing! Keep going";
            case 3 -> "Fantastic, you got it right!";
            case 4 -> "Impressive work. You are correct again";
            case 5 -> "Outstanding. You are really good at math quiz";
            default -> "That is correct";
        };
        return  message;
    }

    private int baseEight(int number) throws Exception {
        String binaryRepresentation = turnToBinary(number);
        int octalRepresentation = turnBinaryToOctal(binaryRepresentation);
        return octalRepresentation;
    }

    private String turnToBinary(int baseTenNumber) throws Exception {
        String binary;
        if(baseTenNumber >= 2* 131072){
           throw new Exception("Please provide a smaller number, current version does not support it yet");
        }
        if(baseTenNumber >= 131072){
            binary = "1";
            baseTenNumber = baseTenNumber % 131072;
        } else {
            binary = "0";
        }
        if(baseTenNumber >= 65536){
            binary += "1";
            baseTenNumber = baseTenNumber % 65536;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 32768){
            binary +="1";
            baseTenNumber = baseTenNumber % 32768;
        } else {
            binary += "0";
        }
        if (baseTenNumber >= 16384) {
            binary += "1";
            baseTenNumber = baseTenNumber % 16384;
        } else {
            binary += "0";
        }
        if (baseTenNumber >= 8192 ){
            binary += "1";
            baseTenNumber = baseTenNumber % 8192;
        } else {
            binary += 0;
        }
        if(baseTenNumber >= 4096) {
            binary += "1";
            baseTenNumber = baseTenNumber % 4096;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 2048) {
            binary += "1";
            baseTenNumber = baseTenNumber % 2048;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 1024) {
            binary += "1";
            baseTenNumber = baseTenNumber % 1024;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 512) {
            binary += "1";
            baseTenNumber = baseTenNumber % 512;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 256) {
            binary += "1";
            baseTenNumber = baseTenNumber % 256;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 128) {
            binary += "1";
            baseTenNumber = baseTenNumber % 128;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 64) {
            binary += "1";
            baseTenNumber = baseTenNumber % 64;
        } else {
            binary += 0;
        }
        if(baseTenNumber >= 32) {
            binary += "1";
            baseTenNumber = baseTenNumber % 32;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 16){
            binary += "1";
            baseTenNumber = baseTenNumber % 16;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 8) {
            binary += "1";
            baseTenNumber = baseTenNumber % 8;
        } else {
            binary += "0";
        }
        if (baseTenNumber >= 4){
            binary += "1";
            baseTenNumber = baseTenNumber % 4;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 2) {
            binary += "1";
            baseTenNumber = baseTenNumber % 2;
        } else {
            binary += "0";
        }
        if(baseTenNumber >= 1) {
            binary +="1" ;
        } else {
            binary += "0";
        }
        return binary;
    }

    private int turnBinaryToOctal(String binaryRepresentation)  {
        int octal = 0;
        int count = 0;
        while(digitsRemain(binaryRepresentation)){
            String digits = extractLastThreeDigits(binaryRepresentation);
            Integer number = new Integer(digits);
            if(count == 0 && turnBinaryToDecimal(number) > 0){
                octal += turnBinaryToDecimal(number);
            } else{
                octal += ( count * 10)  * turnBinaryToDecimal(number);
            }

            binaryRepresentation = removeLastThreeDigits(binaryRepresentation);
            count++;
        }
        return octal;
    }

    private boolean digitsRemain(String binaryRepresentation){
        return binaryRepresentation.length() > 0;
    }

    private String extractLastThreeDigits(String numberAsString){
        int numberValue = numberAsString.length();
        if(numberValue % 3 == 0){
            return "" + numberAsString.charAt(numberAsString.length() - 3) + numberAsString.charAt(numberAsString.length()- 2) + numberAsString.charAt(numberAsString.length() - 1);
        } else if (numberValue % 2 == 0 ){
            return "0" + numberAsString.charAt(numberAsString.length() - 2) + numberAsString.charAt(numberAsString.length()- 1);
        } else {
            return "00" + numberAsString.charAt(numberAsString.length() - 1);
        }

    }

    private String removeLastThreeDigits(String numberAsString){
        return numberAsString.substring(0, numberAsString.length() - 3);
    }

    private int turnBinaryToDecimal(int number){
        int decimal = 0;
        while(number > 0){
             int digit = number % 10;
             decimal += digit;
             number = number / 10;
             int secondDigit = number % 10;
             decimal += secondDigit * 2;
             number = number / 10;
             int thirdDigit = number % 10;
             decimal += thirdDigit * 4;
             number = number / 10;
         }
        return decimal;
    }
}

