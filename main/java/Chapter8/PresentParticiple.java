package Chapter8;

import acm.program.ConsoleProgram;



public class PresentParticiple  extends ConsoleProgram {

    public void run(){
        println("This program reads a verb and then prints the present participle form of it");
        String verb = readLine("Please enter a verb: ");
        String presentParticiple = createPresentPaticiple(verb);
        println("The present paticiple for your verb is " + presentParticiple);
    }

    private String createPresentPaticiple( String verb){
        String presentParcipleVersion = "";
        if(isNotExceptionalVerb(verb)){
            char lastChar = verb.charAt(verb.length() - 1);
            char charBeforeLast = verb.charAt(verb.length() - 2);
            if(lastChar == 'e' && isEnglishConsonant(charBeforeLast)){
                presentParcipleVersion = verb.substring(0, verb.length() - 1) + "ing";
            } else if(isEnglishConsonant(lastChar) && isEnglishVowel(charBeforeLast)){
                presentParcipleVersion = verb + lastChar + "ing";
            } else {
                presentParcipleVersion = verb + "ing";
            }
        } else {
            presentParcipleVersion = getExceptionalVerbForm(verb);
        }


        return presentParcipleVersion;
    }


    /* Returns true if the character is a consonant */
    private boolean isEnglishConsonant(char ch){
        switch (Character.toLowerCase(ch)){
            case 'b': case 'c': case 'd': case 'f': case 'g': case 'h': case 'j': case 'y': case 'k': case 'l': case 'm': case 'n': case 'p': case 'r': case 's': case 't': case 'v': case 'w': case 'q': case 'x': case 'z': return true;
            default: return false;
        }
    }

    /* Returns true if the character is a vowel */
    private boolean isEnglishVowel(char ch){
        switch (Character.toLowerCase(ch)){
            case 'a': case 'e': case 'i': case 'o': case 'u': return true;
            default: return false;
        }
    }

    //In combination with certain expressions of perception (see, hear), movement/ continuation (go, stop, keep) or position (sit, stand).
    private boolean isNotExceptionalVerb(String verb){
        boolean isNotExceptionalVerb = true;
        switch (verb){
            // verbs that define percetions :
            case "see":
            case "hear":
            case "listen":
            case "feel":
            //verbs that define movment , continuation
            case "go" :
            case "stop" :
            case "keep":
            // verbs that define position
            case "sit" :
            case "stand":
            // verbs that define some actions involving senses
            case "eat":
            case "sleep":
                isNotExceptionalVerb = false;
        }
        return isNotExceptionalVerb;
    }

    private String getExceptionalVerbForm(String verb){
        String presentParticipleVersion = "";
        switch (verb){
            case "see": presentParticipleVersion = "seeing";break;
            case "hear": presentParticipleVersion = "hearing";break;
            case "listen": presentParticipleVersion = "listening";break;
                //verbs that define movment , continuation
            case "go" : presentParticipleVersion = "going";break;
            case "stop" : presentParticipleVersion = "stoping";break;
            case "keep": presentParticipleVersion = "keeping"; break;
                // verbs that define position
            case "sit" :presentParticipleVersion = "sitting";break;
            case "stand": presentParticipleVersion = "standing";break;
            case "eat": presentParticipleVersion = "eating"; break;
            // don't have any food nor money, so can't really eat :) carrying the tags for a bit to long before sending them back so I guess I was bloodhounded. they all already decided what to take from my own computer
            // currently unemployed and studying my books again
            case "feel": presentParticipleVersion = "feeling";break;
            case "sleep": presentParticipleVersion = "sleeping"; break;
            case "wake": presentParticipleVersion = "waking :P"; break;
        }

        return presentParticipleVersion;
    }
}
