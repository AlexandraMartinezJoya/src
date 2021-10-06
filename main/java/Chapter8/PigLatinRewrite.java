package Chapter8;

import acm.program.ConsoleProgram;

public class PigLatinRewrite extends ConsoleProgram {

    public void run(){
        println("This program is going to be re-written twice in this very class");
        println("First improvement of the one , the only PIG LATIN is that it will parse character by charater. Not much of an improvement, but it MIGHT RUN FASTER!");
        println ("Second improvement is that PIG-LATIN will now start with a capital letter! GO GO pig latin. Soon you will be called 'English'");
        String line = readLine("Enter YOUR line to be translated into IMPROVED PIG LATIN: ");
        String translatedLine = translateLineToImprovedPigLatin(line);
        println("YOUR Pig-Latin line is: " + translatedLine + ". How cool is that!");
    }

    /***
     * Translates the whole line instead of word by word
     * @param  line the string to be translated
     * @return translatedLinecurrentPosition = 5 (0x5)
     */
    private String translateLineToImprovedPigLatin(String line){
        line = line + " ";
        String translatedLine = "";
        String translatedWord;
        //noinspection UnusedAssignment
        String currentWord = "";
        int currentPosition;
        int lastDelimiterPosition = 0;
        boolean isFirstWord = true;
        for(int i = 0; i < line.length(); i++){
            char currentCharacter = line.charAt(i);
            currentPosition = line.indexOf(currentCharacter);
            if(isADelimiter(currentCharacter)){
                if(lastDelimiterPosition == 0){
                    isFirstWord = true;
                } else {
                    isFirstWord = false;
                }
//                currentWord = line.substring(lastDelimiterPosition, currentPosition);
                if(isWord(currentWord)){
                    translatedWord = translateWord(currentWord, isFirstWord);
                    //noinspection StringConcatenationInLoop
                    translatedLine += translatedWord + currentCharacter;
                    lastDelimiterPosition = currentPosition;
                    currentWord = "";
                }

            } else {
                //noinspection StringConcatenationInLoop
                currentWord += currentCharacter;
            }
        }
        return translatedLine;
    }

    /* Returns true if token is a "word" (all characters are letters) */
    private boolean isWord(String token){
        for ( int i = 0; i < token.length(); i++){
            char ch = token.charAt(i);
            if(!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    /* Returns the index of the first vowel in the word (-1 if none) */
    private int findFirstVowel(String word){
        for(int i = 0; i < word.length(); i++){
            if(isEnglishVowel(word.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    /* Translates a word to Pig Latin and returns the translated word */
    private String translateWord(String word, boolean isFirstWord){
        String translatedWord;
        int vp = findFirstVowel(word);
        if(vp == -1) {
            return word;
        } else if (vp == 0) {
            if(isFirstWord){
                translatedWord = capitalize(word);
                translatedWord = translatedWord + "way";
            } else
                translatedWord = word + "way";
            return translatedWord;
        } else {
            String head = word.substring(0, vp);
            String tail = word.substring(vp);
            if(isFirstWord) {
                translatedWord = capitalize(tail) + head + "ay";
            } else {
                translatedWord = tail + head + "ay";
            }
            return  translatedWord;
        }
    }

    /* Returns true if the character is a vowel */
    private boolean isEnglishVowel(char ch){
        return switch (Character.toLowerCase(ch)) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    private boolean isADelimiter(char token){
        return switch (token) {
            case ' ', '!', '.' -> true;
            default -> false;
        };
    }

    /**
     * This method capitalizes first letter in a string
     */
    private String capitalize(String line){
        char firstLetterInALine = line.charAt(0);
        char capitalizedLetter = '0';

        switch (firstLetterInALine) {
            case 'a' -> capitalizedLetter = 'A';
            case 'b' -> capitalizedLetter = 'B';
            case 'c' -> capitalizedLetter = 'C';
            case 'd' -> capitalizedLetter = 'D';
            case 'e' -> capitalizedLetter = 'E';
            case 'f' -> capitalizedLetter = 'F';
            case 'g' -> capitalizedLetter = 'G';
            case 'h' -> capitalizedLetter = 'H';
            case 'i' -> capitalizedLetter = 'I';
            case 'j' -> capitalizedLetter = 'J';
            case 'k' -> capitalizedLetter = 'K';
            case 'l' -> capitalizedLetter = 'L';
            case 'm' -> capitalizedLetter = 'M';
            case 'n' -> capitalizedLetter = 'N';
            case 'o' -> capitalizedLetter = 'O';
            case 'p' -> capitalizedLetter = 'P';
            case 'r' -> capitalizedLetter = 'R';
            case 's' -> capitalizedLetter = 'S';
            case 't' -> capitalizedLetter = 'T';
            case 'u' -> capitalizedLetter = 'u';
            case 'v' -> capitalizedLetter = 'V';
            case 'W' -> capitalizedLetter = 'W';
            case 'x' -> capitalizedLetter = 'X';
            case 'y' -> capitalizedLetter = 'Y';
            case 'Z' -> capitalizedLetter = 'Z';
        }
        return capitalizedLetter + line.substring(1, line.length());
    }
}
