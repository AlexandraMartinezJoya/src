package Chapter8;

import acm.program.ConsoleProgram;

/**
 * This program searches for the first find occurance of a character in a string.
 * @Brute-force algorithm for a simple search
 */
public class FindFirstMatchingPosition extends ConsoleProgram {

    public void run(){
        println("This program searches for the first find occurance of a character in a string.");
        String line = readLine("Please enter a word");
        String charToLookFor = readLine("Please enter the letter you are looking for");
        char characterToLookFor = charToLookFor.charAt(0);
        char firstOccurrenceOfLetter = findFistMatchingPosition(line, characterToLookFor);
        String firstOccurrence = "" + firstOccurrenceOfLetter;
        println("The first occurrence is: " + firstOccurrence);
    }

    private char findFistMatchingPosition(String line, char lineToLookFor){
        char first = '0';
        //while this is not used, the variable can stay here as code sample in case we want to turn this code into a predicate method
        boolean found = false;
        for(int i = 0; i < line.length() - 1; i++){
            if(line.charAt(i) == lineToLookFor) {
                found = true;
                first = line.charAt(i);
            }
        }
        return first;
    }
}
