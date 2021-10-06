import acm.program.ConsoleProgram;

public class CaesarCypher extends ConsoleProgram {

    private final String ALPHABET = "abcdefghijklmnoqprstuvwxyz";
    private final String CAPITAL_ALPHABET = "ABCDEFGHIJKLMNOQPRSTUVWXYZ";
    private final String GREEK_ALPHABET = "Αα Ββ Γγ Δδ Εε Ζζ Ηη Κκ Λλ Μμ Νν Ξξ Οο Ππ Ρρ Σσ Ττ Υυ Φφ Χχ Ψψ Ωω";
    private final String HOPEFULLY_OBSOLETE_GREEK_LETTERS = "Ϝϝ Ϛϛ Ͱͱ Ϻϻ Ϟϟ Ϡϡ Ϸϸ";

    public void run(){
        println("This program encodes a message using Ceasar Cypher");
        int charToShift = readInt("Please enter how many characters you want to shift: ");
        String line = readLine("Enter a message: ");
        String encodedMessage = encodeCaesarCypher(line, charToShift);
        println("Encoded message is : " + encodedMessage);
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

    private char getAlphabetShiftedChar(char c, int charsToShift){
        return shiftChar(c, charsToShift);
    }

    private char shiftChar(char c, int charsToShift){
        int charPositionInAlphabet = getCharCurrentPositionInAlphabetLine(c);
        return getShiftedPositionInAlphabet(charPositionInAlphabet, charsToShift, isCapital(c));
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

    private char getShiftedPositionInAlphabet(int currentPositionInAlphabet, int charsToShift, boolean isCapital){
        int charNextPosition = getCharNextPosition(currentPositionInAlphabet, charsToShift);
        return getCharAtPosition(charNextPosition, isCapital);
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

    private char getCharAtPosition(int position, boolean isCapital){
        if(isCapital){
            return CAPITAL_ALPHABET.charAt(position);
        }
        return ALPHABET.charAt(position);
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

    private String greek_letter_to_Word() {
        String greekString = "";
        String greekWord = "";
        return greekWord;
    }

    private String greek_letter_to_sign(){
        String greekLetter = "";
        String GreekSign = "";
        return GreekSign;
    }

    private int greek_letter_to_Numeric_Value(){
        String greekLetter = "";
        int GreekValue = 0;
        return GreekValue;
    }
}
