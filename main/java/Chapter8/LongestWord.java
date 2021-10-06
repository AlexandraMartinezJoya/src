package Chapter8;

import acm.program.ConsoleProgram;

import java.util.StringTokenizer;

/** This program checks for the longest word in a line
 * =============
 */

public class LongestWord extends ConsoleProgram {

    public void run(){
        String line = readLine("Please enter a line: ");
        String result = "";
        int longestWord = 0;
        int currentWord = 0;
        StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS, true);
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            if (isWord(token)){
                currentWord = token.length();

                if (currentWord > longestWord){
                    longestWord = currentWord;
                    result = token;
                }
            }
        }
        println("The longest word in your line is " + "\"" + result + "\"" + "." );
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
    private final String DELIMITERS = " .";
}
