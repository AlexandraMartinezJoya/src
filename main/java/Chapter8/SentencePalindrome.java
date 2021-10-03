import acm.program.ConsoleProgram;

import java.util.StringTokenizer;

public class SentencePalindrome extends ConsoleProgram {

    /**
     * private constants
     */
    private final String SENTINEL_TWO = " ";


    public void run(){
        println("This program checks if a sentence is a palindrome.");
        println("Please enter your sentences, and when you are done, press space key: ");
        String line = readLine();
        while(!line.equals(SENTINEL_TWO)){
            if(isSentencePalindrome(line)){
                println("That sentence is a palindrome");
            } else {
                println("That sentence is not a palindrome");

            }
            line = readLine();
        }

    }

    private boolean isSentencePalindrome(String line){
        line = toLowerCase(line);
        String formattedLine = findAndRemoveCharacters(line);
        String sentenceReversed = reverse(formattedLine);
        return formattedLine.equals(sentenceReversed);
    }

    private String findAndRemoveCharacters(String line){
        String lineWithCharactersRemoved = "";
        for(int i = line.length() - 1; i >= 0; i--){
            char c = line.charAt(i);
            if(isAllowedChar(c)){
                lineWithCharactersRemoved += c;
            }
        }
        return lineWithCharactersRemoved;
    }

    private boolean isAllowedChar(char ch){
        boolean isAllowedChar = true;
        switch (Character.toLowerCase(ch)){
            case ' ': case ',' : case '.': case '?': case ';': case ':': case '\'': case'!':isAllowedChar = false;break;
        }
        return isAllowedChar;
    }

    private String reverse(String line){
        String reversed = "";
        for(int i = line.length() - 1; i >= 0; i-- ){
            reversed += line.charAt(i);
        }
        return reversed;
    }

    private String toLowerCase(String line){
        String lowerCaseVersion = "";
        for(int i = line.length() -1; i >= 0; i--){
            char c = line.charAt(i);
            char ch = Character.toLowerCase(c);
            lowerCaseVersion += ch;
        }
        return lowerCaseVersion;
    }
}
