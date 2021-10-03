package Chapter8;

import acm.program.ConsoleProgram;

public class CreateRegularPlural extends ConsoleProgram {

    public void run(){
        println("This program creates regular plural: ");
        println("Please enter a word: ");
        String noun = readLine();
        String plural = createRegularPlural(noun);
        println("The plural of the word is: " + plural);
        noun = "Test";
        println("The plural of " + noun + " is " + createRegularPlural(noun));
        noun = "Arch";
        println("The plural of " + noun + " is " + createRegularPlural(noun));
        noun = " Ash";
        println("The plural of " + noun + " is " + createRegularPlural(noun));
        noun = "Irony";
        println("The plural of " + noun + " is " + createRegularPlural(noun));
        noun = " Cup";
        println("The plural of " + noun + " is " + createRegularPlural(noun));
        noun = "Alexa";
        println("The plural of " + noun + " is " + createRegularPlural(noun));
    }

    private String createRegularPlural(String word){
        char lastLetter = word.charAt(word.length() - 1);
        char letterBeforeLast = word.charAt(word.length() - 2);
        String lastTwoLetters = "" +letterBeforeLast + lastLetter;
        println(lastTwoLetters);
        if(lastLetter == 'x' || lastLetter == 's' || lastLetter == 'z' || lastTwoLetters.equals("ch") || lastTwoLetters.equals("sh")){
            word += "es";
        } else if(lastLetter == 'y' && isEnglishConsonant(letterBeforeLast)){
            word = removeLastLetterFromString(word);
            word += "ies";
        } else {
            word += "s";
        }
        return word;
    }

    /* Returns true if the character is an english consonant */
    private boolean isEnglishConsonant(char ch){
        return switch (Character.toLowerCase(ch)) {
            case 'a', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'y', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'v', 'w', 'q', 'x', 'z' -> true;
            default -> false;
        };
    }

    private String removeLastLetterFromString(String hopefullyAnyGivenString){
        //word -= "" + lastLetter;
        println(hopefullyAnyGivenString);
        println(hopefullyAnyGivenString.length() - 1);
        return hopefullyAnyGivenString.substring(hopefullyAnyGivenString.length() -2);
    }
}
