import acm.program.ConsoleProgram;

public class CapitalizeWord extends ConsoleProgram {

    public void run(){
        println("This program reads in a line and prints out the capitalized version of it");
        println("Enter a line: ");
        String line = readLine();
        line = capitalize(line);
        println(line);
    }

    /**
     * This method turns all characters to upper case
     * @param line
     * @return UpperCaseVersion
     */
    private String upperCased(String line){
        String capitalized = "";
        for(int i =0; i <= line.length() - 1; i++){
            char ch = Character.toUpperCase(line.charAt(i));
            capitalized += ch;
        }
        return capitalized;
    }

    /**
     * This method capitalizes firstLetterInAString
     */
    private String capitalize(String line){
        String capitalized = "";
        char firstLetter = line.charAt(0);

        return capitalized;
    }
}
