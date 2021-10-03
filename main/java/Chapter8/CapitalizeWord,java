package Chapter8;

import acm.program.ConsoleProgram;

public class CapitalizeWord extends ConsoleProgram {

    public void run(){
        println("This program reads in a line and prints out the capitalized version of it");
        println("Enter a line: ");
        String line = readLine();
        line = capitalize(line);
        println(line);
        println("Capitalized.");
    }

    /**
     * This method capitalizes first letter in a string
     */
    private String capitalize(String line){
        char firstLetterInALine = line.charAt(0);
        char capitalizedLetter = '0';

        switch (firstLetterInALine) {
            case 'a' -> capitalizedLetter = 'A';
            case 'b' -> capitalizedLetter = 'B';
            case 'c' -> capitalizedLetter = 'C';
            case 'd' -> capitalizedLetter = 'D';
            case 'e' -> capitalizedLetter = 'E';
            case 'f' -> capitalizedLetter = 'F';
            case 'g' -> capitalizedLetter = 'G';
            case 'h' -> capitalizedLetter = 'H';
            case 'i' -> capitalizedLetter = 'I';
            case 'j' -> capitalizedLetter = 'J';
            case 'k' -> capitalizedLetter = 'K';
            case 'l' -> capitalizedLetter = 'L';
            case 'm' -> capitalizedLetter = 'M';
            case 'n' -> capitalizedLetter = 'N';
            case 'o' -> capitalizedLetter = 'O';
            case 'p' -> capitalizedLetter = 'P';
            case 'r' -> capitalizedLetter = 'R';
            case 's' -> capitalizedLetter = 'S';
            case 't' -> capitalizedLetter = 'T';
            case 'u' -> capitalizedLetter = 'u';
            case 'v' -> capitalizedLetter = 'V';
            case 'W' -> capitalizedLetter = 'W';
            case 'x' -> capitalizedLetter = 'X';
            case 'y' -> capitalizedLetter = 'Y';
            case 'Z' -> capitalizedLetter = 'Z';
            default -> {
            }
        }
        //noinspection UnnecessaryLocalVariable
        String capitalized = capitalizedLetter + line.substring(1, line.length());
        return capitalized;
    }

    /**
     * This method turns all characters to upper case
     * @return UpperCasedVersion
     */
    private String upperCased(String line){
        String capitalized = "";
        for(int i = 0; i <= line.length() - 1; i++){
            char ch = Character.toUpperCase(line.charAt(i));
            //noinspection StringConcatenationInLoop
            capitalized += ch;
        }
        return capitalized;
    }
}
