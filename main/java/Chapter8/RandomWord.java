import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class RandomWord extends ConsoleProgram {

    /** Private constants */
    private final int MIN_LETTERS = 3;
    private final int MAX_LETTERS = 10;


    /**
     * Instance variables
     */
    RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
        println("This program builds random words. It will build 5 random words for you.");
        for (int i = 0; i < 5; i++) {
            String word = buildRandomWord();
            println(word);
        }
    }

    private String buildRandomWord(){
        int wordLength = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
        String randomWord = "";
        for (int i = 0; i < wordLength; i++){
            int consonantCount = 0;
            int character = rgen.nextInt(0, 24);
            char ch = getEnglsihLetter(character);
            if(isEnglishConsonant(ch)){
                consonantCount++;
            }
            if(consonantCount == 3){
                int randomVowelCharacter = rgen.nextInt(0,5);
                ch = getRandomEnglishVowel(randomVowelCharacter);
                consonantCount = 0;
            }
            randomWord += ch;
        }
        return randomWord;
    }

    private char getEnglsihLetter(int ch){
       char character = 0;
        switch (ch){
            case 0:  character = 'a'; break;
            case 1: character = 'b'; break;
            case 2: character = 'c'; break;
            case 3: character = 'd'; break;
            case 4: character = 'e'; break;
            case 5: character = 'f'; break;
            case 6: character = 'g'; break;
            case 7: character = 'h'; break;
            case 8: character = 'i'; break;
            case 9: character = 'j'; break;
            case 10: character = 'k'; break;
            case 11: character = 'l'; break;
            case 12: character = 'm'; break;
            case 13: character = 'n'; break;
            case 14: character = 'o'; break;
            case 15: character = 'p'; break;
            case 16: character = 'r'; break;
            case 17: character = 's'; break;
            case 18: character = 't'; break;
            case 19: character = 'u'; break;
            case 20: character = 'v'; break;
            case 21: character = 'w'; break;
            case 22: character = 'x'; break;
            case 23: character = 'y'; break;
            case 24: character = 'z'; break;
        }
        return character;
    }

    /* Returns true if the character is a consonant */
    private boolean isEnglishConsonant(char ch){
        switch (Character.toLowerCase(ch)){
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'y':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'q':
            case 'x':
            case 'z':
                return true;
            default: return false;
        }
    }

    private char getRandomEnglishVowel(int chr){
        char ch = 0;
        switch (chr){
            case 1: ch = 'a'; break;
            case 2: ch = 'e'; break;
            case 3: ch =  'i'; break;
            case 4: ch = 'o'; break;
            case 5: ch = 'u'; break;
        }
        return ch;
    }
}
