package Chapter8;

import acm.program.ConsoleProgram;

/***
 * This program adds two integers, and it uses the built class for integers.
 * It does much more than that, it also ... multiplies, divides and calculates the remainder
 *
 * Solved by @Alexandra Martinez Joya.
 */
public class Add2Integers extends ConsoleProgram {

    /**
     * Private constants
     */
    @SuppressWarnings("FieldCanBeLocal")
    //everything can be local. But should it? // not .. everything , but most things, especially after checking what's in a lot of C headers ... should.
    private final String DIGITS = "0123456789";
    @SuppressWarnings("FieldCanBeLocal")
    //read up yo!
    private final char OK_FLAG = '1';

    public void run(){
        println("This program adds 2 integers.");
        String prompt = "Enter n1: ";
        int numberOne;
        numberOne = myReadInt(prompt);
        prompt = "Enter n2: ";
        int numberTwo;
        numberTwo = myReadInt(prompt);
        int total = numberOne + numberTwo;
        println("The total is : " + total + ".");
        int multiplied = multiplier(numberOne, numberTwo);
        println("The numbers multiplied are: " + multiplied);
        double factorial = factorial(numberOne);
        println("Factorial for number one is: " + factorial);
        println("Number one and two division is: " + numberOne / numberTwo);
        }

        private int myReadInt(String prompt){
            return  turnLineToNumber(prompt);
        }

        private int turnLineToNumber(String line) {
            line = getNumericLine(line);

            return turnNumericLineToInt(line);
        }


        @SuppressWarnings("StringConcatenationInLoop")
        //that was the exact thing i wanted to write. there's no need to "flag as warning" . we know loops. we like loops. we use loops. concatenating in loops is cool.
        private boolean charactersAreNumeric(String line, boolean isMinus){
            String allFlags = "";
            for (int i = 0; i < line.length(); i++){
                char c = line.charAt(i);
                for(int j = 0; j < DIGITS.length(); j++){
                    if(DIGITS.charAt(j) == c && !isMinus){
                        allFlags += "1";
                    }
                }
            }

            return allFlagsAreOk(allFlags);
        }

        private int turnNumericLineToInt( String line){
            int number;
            int total = 0;
            String reversed = reverse(line);
            for (int charPosition = line.length() -1; charPosition >= 0; charPosition--){
                char c = reversed.charAt(charPosition);
                number =  assignNumericValueToChar(c);
                if(isLastCharOfString(reversed)){
                    total += number;
                } else {
                    total += multiplyDigitByTen(number, charPosition);
                }
            }
            return total;
        }

        private boolean isLastCharOfString(String line){
           return line.charAt(line.length() - 1) == 0;
        }

        @SuppressWarnings("DuplicateBranchesInSwitch")
        private int assignNumericValueToChar(char c){
            return switch (c) {
                case '0' -> 0;
                case '1' -> 1;
                case '2' -> 2;
                case '3' -> 3;
                case '4' -> 4;
                case '5' -> 5;
                case '6' -> 6;
                case '7' -> 7;
                case '8' -> 8;
                case '9' -> 9;
                default -> 0;
            };
        }

        //Excellent method. Can be used later on. Should be used later on. In the Integer class
        private int multiplier(int number, int times){
            return number * times;
        }

    @SuppressWarnings("unused")
    //Excellent method. Can be used later on. Should be used later on. In the Integer class
    private double factorial(int n){
        double result = 1.0;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    @SuppressWarnings("StringConcatenationInLoop")
    //that was the exact thing i wanted to write. theres no need to "flag as warning" . we know loops. we like loops. we use loops. concatenating in loops is cool.
    private String reverse(String line){
        String reversed = "";
        for(int i = line.length() - 1; i >= 0; i-- ){
            reversed += line.charAt(i);
        }
        return reversed;
    }

    private int multiplyDigitByTen(int digit, int times){
        int total = digit;
        for(int i =  0; i < times; i++){
            total *= 10;
        }
        return  total;
    }

        private void  printRedLine(){
            showErrorMessage("Illegal numeric format");
        }

        private boolean allFlagsAreOk(String flags){
            for (int i = 0; i < flags.length(); i++){
                if(flags.charAt(i) != OK_FLAG){
                    return false;
                }
            }
            return true;
        }

        private String getNumericLine(String prompt){
            String line = readLine(prompt);
            boolean isMinus = line.charAt(0) == '-';
            boolean isNumericLine = charactersAreNumeric(line, isMinus);
            while(!isNumericLine){
                printRedLine();
                isMinus = line.charAt(0) == '-';
                line = readLine(prompt);
                isNumericLine = charactersAreNumeric(line, isMinus);
            }
            return line;
        }
}
