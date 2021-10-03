/**
 * File: PigLatin.java
 * ----------------------
 * This file takes a line of text and converts it into pig latin.
 * The rules for forming pig latin words are as follows:
 * 1. If the word begins with a vowel, add "way" at the end of the word
 * 2. If the word begins with a consonant, extract the set of consonants up to the first vowel, move that set of consonant up to the end of the word, and add "ay"
 */

import  acm.program.*;
import java.util.*;

public class PigLatin extends ConsoleProgram{

    public void run(){
        println("This program translates words into Pig Latin.");
        String line = readLine("Enter a line: ");
        println(translateLine(line));
    }

    /* Translates the line to Pig Latin, word by word */
    private String translateLine(String line){
        String result = "";
        StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS, true);
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            if (isWord(token)){
                token = translateWord(token);
            }
            result += token;
        }
        return result;
    }

    /* Translates a word to Pig Latin and returns the translated word */
    private String translateWord(String word){
        int vp = findFirstVowel(word);
        if(vp == -1) {
            return word;
        } else if (vp == 0) {
            return word + "way";
        } else {
            String head = word.substring(0, vp);
            String tail = word.substring(vp);
            return  tail + head + "ay";
        }
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

    /* Returns true if the character is a vowel */
    private boolean isEnglishVowel(char ch){
        return switch (Character.toLowerCase(ch)) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
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

    /* Defines the characters that delimit a token */
    private final String DELIMITERS = "!@#$%^&*()_-+={[]}:;'|<,.>?/";
}
