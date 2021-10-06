/***
 * The structure of the DNA is the following:
 * adenosine, cytosine, guanine, thymine
 *
 * adenosine links only with thymine
 * cytosine links only with guanine
 * Typically, biologists abbreviate the names of the bases so that each is represented by the initial
 * letter:  A, C, G, or T
 */

import RandomNameGenerator.RandomNameGenrator;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

/**
 * This program finds the fist occurrence of a matchable position of DNA in a DNA String
 * This can attach a short DNA sequence in a long DNA sequence.
 *
 */
public class SearchingWithinAString extends ConsoleProgram {

    RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
        println("This program generates two DNA strings and finds the first occurrence of where the second one can latch on the fist");
        int longerDnaSequence = 24;
        int shorterDnaSequence = 3;

        String longDnaSequence = generateDNAString(longerDnaSequence);
        String shortDnaSequence = generateDNAString(shorterDnaSequence);

        println("The long DNA seqence is : " + longDnaSequence);
        println("The short DNA sequence is: " + shortDnaSequence);
        
        char firstDnaLetterPosition = findFirstMatchingPositionChar(longDnaSequence, shortDnaSequence);
        if(firstDnaLetterPosition != '1'){
            println("The first occurance where the dna can latch to is found at position: " + firstDnaLetterPosition);
        } else {
            println("No occuring matches, sorry");
        }

    }

    private String generateDNAString(int dnaLength) {
        String dna = "";
        char dnaChar;
        for(int i = 0; i < dnaLength; i++) {
            int dnaNumber = rgen.nextInt(1, 4);
            switch (dnaNumber) {
                case 1: dnaChar = 'A'; break;
                case 2: dnaChar = 'C'; break;
                case 3: dnaChar = 'G'; break;
                case 4: dnaChar = 'T'; break;
                default: dnaChar = '0';
            }
            dna += dnaChar;
        }
        println("Dna length iz : " + dna.length());
        return dna;
    }
    
    
    private char findFirstMatchingPositionChar (String longSequence, String shortSequence) {
        char firstLetterOccurance = 0;
        char firstCharInShortSequence = shortSequence.charAt(0);
        char secondCharInShortSequence = shortSequence.charAt(1);
        char thirdCharInShortSequence = shortSequence.charAt(1);
        for(int i = 0; i < longSequence.length() - 3; i++) {
            char currentCharacter = longSequence.charAt(i);
            char nextCharacter = longSequence.charAt(i + 1);
            char afterNextCharacter = longSequence.charAt(i + 2);
            switch (currentCharacter) {
                case 'A' :
                    if ((firstCharInShortSequence == 'T')){
                        switch(nextCharacter) {
                            case 'A' : if(secondCharInShortSequence == 'T') {
                                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                                        }
                                        break;
                            case 'C' : if(secondCharInShortSequence == 'G'){
                                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                                        }
                                        break;
                            case 'T' : if(secondCharInShortSequence == 'A'){
                                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                                        }
                                        break;
                            case 'G' : if(secondCharInShortSequence == 'C'){
                                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                                       }
                                       break;
                        }
                    }

                    break;
                case 'C' :if ((firstCharInShortSequence == 'G')) {
                    switch (nextCharacter) {
                        case 'A':
                            if (secondCharInShortSequence == 'T') {
                                firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                            }
                            break;
                        case 'C':
                            if (secondCharInShortSequence == 'G') {
                                firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                            }
                            break;
                        case 'T':
                            if (secondCharInShortSequence == 'A') {
                                firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                            }
                            break;
                        case 'G':
                            if (secondCharInShortSequence == 'C') {
                                firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                            }
                            break;
                    }
                }
                    break;
                case 'T' :if ((firstCharInShortSequence == 'A')){
                    switch(nextCharacter) {
                        case 'A' : if(secondCharInShortSequence == 'T') {
                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                        }
                            break;
                        case 'C' : if(secondCharInShortSequence == 'G'){
                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                        }
                            break;
                        case 'T' : if(secondCharInShortSequence == 'A'){
                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                        }
                            break;
                        case 'G' : if(secondCharInShortSequence == 'C'){
                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                        }
                            break;
                    }
                }
                    break;
                case 'G' : if ((firstCharInShortSequence == 'C')){
                    switch(nextCharacter) {
                        case 'A' : if(secondCharInShortSequence == 'T') {
                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                        }
                            break;
                        case 'C' : if(secondCharInShortSequence == 'G'){
                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                        }
                            break;
                        case 'T' : if(secondCharInShortSequence == 'A'){
                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                        }
                            break;
                        case 'G' : if(secondCharInShortSequence == 'C'){
                            firstLetterOccurance = getCharAtPosition(currentCharacter, afterNextCharacter, thirdCharInShortSequence);
                        }
                            break;
                    }
                }
                    break;
                default: firstLetterOccurance = '1';
                         break;
            }

        }
        return firstLetterOccurance;
    }

    /**
     *
     * @param currentCharacter
     * @param afterNextCharacter
     * @param thirdCharInShortSequence
     * @return firstLetterOccurrence
     */
    private char getCharAtPosition(char currentCharacter, char afterNextCharacter, char thirdCharInShortSequence){
        char firstLetterOccurence = ' ';
        switch (afterNextCharacter) {
            case 'A' : if(thirdCharInShortSequence == 'T') {
                firstLetterOccurence = currentCharacter;
            };
                break;
            case 'C' : if(thirdCharInShortSequence == 'G'){
                firstLetterOccurence = currentCharacter;
            };
                break;
            case 'T' : if(thirdCharInShortSequence == 'A'){
                firstLetterOccurence = currentCharacter;
            };
                break;
            case 'G' : if(thirdCharInShortSequence == 'G'){
                firstLetterOccurence = currentCharacter;
            };
                break;
        }
        return firstLetterOccurence;
    }
}
