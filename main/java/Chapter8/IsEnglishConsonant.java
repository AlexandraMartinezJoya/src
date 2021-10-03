import acm.program.ConsoleProgram;

public class IsEnglishConsonant extends ConsoleProgram {

    public void run(){
        println("This program displays all the English consonants.");
        println("The English consonants are: ");
        println(" b c d f g h j y k l m n p r s t v w q  x z");
        println(" q w r t y p s d f g h j k l z x c v b n m");

        println("Enter a character, and the program will detect if it's a consonant: ");
        String line = readLine();
        if(line.length() > 1){
            println(line.length());
        }
        char ch = line.charAt(0);
        if(isEnglishConsonant(ch)){
            println("It is indeed a consonant.");
        } else {
            println("this is not a consonant.");
        }
    }

    /* Returns true if the character is a consonant */
    private boolean isEnglishConsonant(char ch){
        return switch (Character.toLowerCase(ch)) {
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'y', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'v', 'w', 'q', 'x', 'z' -> true;
            default -> false;
        };
    }

}
