package Chapter8;

import acm.program.ConsoleProgram;

public class NonBuggyPalindrome extends ConsoleProgram {

    public void run(){
        println("This program takes in a word and checks if it's palindrome");
        String line = readLine("Please enter a word:  ");
        if(isPalindrome(line)){
            println("The word is indeed a palindrome");
        } else {
            println("The word is not a palindrome");
        }
    }

    private boolean isPalindrome(String line){
        boolean isPalindrome = line.equals(reverse(line));
        return isPalindrome;
    }

    private String reverse(String line){
        String reversed = "";
        for(int i = line.length() - 1; i >= 0; i-- ){
            reversed += line.charAt(i);
        }
        return reversed;
    }
}
