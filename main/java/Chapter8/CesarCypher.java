package Chapter8;

import acm.program.ConsoleProgram;

public class CaesarCypher extends ConsoleProgram {

    private final String ALPHABET = "abcdefghijklmnoqprstuvwxyz";
    private final String CAPITAL_ALPHABET = "ABCDEFGHIJKLMNOQPRSTUVWXYZ";
    private final String GREEK_ALPHABET = "αβγδεζηκλμνξοπρστυφχψωϝϛͱϻϟϡϸ";
    private final String CAPITAL_GREEK_ALPHABET = "ΑΒΓΔΕΖΗΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩϜϚͰϺϞϠϷ";

    public void run(){
        println("This program encodes a message using Ceasar Cypher");
        int charToShift = readInt("Please enter how many characters you want to shift: ");
        String line = readLine("Enter a message: ");
        String encodedMessage = encodeCaesarCypher(line, charToShift);
        println("Encoded message is : " + encodedMessage);

        String encodedGreekCaesarMessage = encodeGreekCaesarCypher(line, charToShift);
        println("The greek encoded message is: " + encodedGreekCaesarMessage);
    }

    private String encodeCaesarCypher(String line, int charsToShift){
        String encodedString = "";
        for(int i = 0; i < line.length(); i++){
            char c = line.charAt(i);
            if(isAlphabetLetter(c)){
                char encodedChar = getAlphabetShiftedChar(c, charsToShift);
                encodedString += encodedChar;
            } else {
                encodedString += c;
            }

        }
        return encodedString;
    }

    private String encodeGreekCaesarCypher(String line, int charsToShift){
        String encodedString = "";
        for(int i = 0; i < line.length(); i++){
            char c = line.charAt(i);
            if(isGreekAlphabetLetter(c)){
                char encodedChar = getGreekAlphabetShiftedChar(c, charsToShift);
                encodedString += encodedChar;
            } else {
                encodedString += c;
            }

        }
        return encodedString;
    }

    private char getAlphabetShiftedChar(char c, int charsToShift){
        return shiftChar(c, charsToShift);
    }

    private char getGreekAlphabetShiftedChar(char c, int charsToShift){
        return shiftGreekChar(c, charsToShift);
    }

    private char shiftChar(char c, int charsToShift){
        int charPositionInAlphabet = getCharCurrentPositionInAlphabetLine(c);
        return getShiftedPositionInAlphabet(charPositionInAlphabet, charsToShift, isCapital(c));
    }

    private char shiftGreekChar(char c, int charsToShift){
        int charPositionInAlphabet = getCharCurrentPositionInGreekAlphabetLine(c);
        return getShiftedPositionInGreekAlphabet(charPositionInAlphabet, charsToShift, isCapital(c));
    }

    private int getCharCurrentPositionInAlphabetLine(char c){
        int position = 0;
        for(int i = 0; i < ALPHABET.length(); i++){
            if(c == ALPHABET.charAt(i) || c == CAPITAL_ALPHABET.charAt(i)){
                position = i;
            }
        }
        return position;
    }

    private int getCharCurrentPositionInGreekAlphabetLine(char c){
        int position = 0;
        for(int i = 0; i < GREEK_ALPHABET.length(); i++){
            if(c == GREEK_ALPHABET.charAt(i) || c == CAPITAL_GREEK_ALPHABET.charAt(i)){
                position = i;
            }
        }
        return position;
    }



    private char getShiftedPositionInAlphabet(int currentPositionInAlphabet, int charsToShift, boolean isCapital){
        int charNextPosition = getCharNextPosition(currentPositionInAlphabet, charsToShift);
        return getCharAtPosition(charNextPosition, isCapital);
    }

    private char getShiftedPositionInGreekAlphabet(int currentPositionInAlphabet, int charsToShift, boolean isCapital){
        int greekCharNextPosition = getGreekCharNextPosition(currentPositionInAlphabet, charsToShift);
        return getGreekCharAtPosition(greekCharNextPosition, isCapital);
    }

    private int getCharNextPosition(int currentPosition, int charsToShift){
        int nextPosition;
        int maxPosition = ALPHABET.length() -1;
        if (currentPosition + charsToShift > maxPosition){
            nextPosition = currentPosition + charsToShift - maxPosition;
        } else {
            nextPosition = currentPosition + charsToShift;
        }
        return nextPosition;
    }

    private int getGreekCharNextPosition(int currentPosition, int charsToShift){
        int nextPosition;
        int maxPosition = GREEK_ALPHABET.length() -1;
        if (currentPosition + charsToShift > maxPosition){
            nextPosition = currentPosition + charsToShift - maxPosition;
        } else {
            nextPosition = currentPosition + charsToShift;
        }
        return nextPosition;
    }


    private char getCharAtPosition(int position, boolean isCapital){
        if(isCapital){
            return CAPITAL_ALPHABET.charAt(position);
        }
        return ALPHABET.charAt(position);
    }

    private char getGreekCharAtPosition(int position, boolean isCapital){
        if(isCapital){
            return CAPITAL_GREEK_ALPHABET.charAt(position);
        }
        return GREEK_ALPHABET.charAt(position);
    }

    private boolean isAlphabetLetter(char c){
        boolean isAlphabet = false;
        for(int i = 0; i < ALPHABET.length(); i++){
            if(ALPHABET.charAt(i) == c){
                isAlphabet = true;
            }
            if(CAPITAL_ALPHABET.charAt(i) == c){
                isAlphabet = true;
            }
        }
        return isAlphabet;
    }

    private boolean isGreekAlphabetLetter(char c) {
        boolean isAlphabet = false;
        for(int i = 0; i < GREEK_ALPHABET.length(); i++){
            if(GREEK_ALPHABET.charAt(i) == c){
                isAlphabet = true;
            }
            if(CAPITAL_GREEK_ALPHABET.charAt(i) == c){
                isAlphabet = true;
            }
        }
        return isAlphabet;
    }

    private boolean isCapital( char c){
        boolean isCapital = false;
        for(int i = 0; i < ALPHABET.length(); i++){
            if(CAPITAL_ALPHABET.charAt(i) == c){
                isCapital = true;
                break;
            }
        }
        return isCapital;
    }
}
