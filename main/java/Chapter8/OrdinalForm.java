import acm.program.ConsoleProgram;

public class OrdinalForm extends ConsoleProgram {

    public void run(){
        println("This program reads an integer and turns it into the ordinal number");
        int num = readInt("Please enter an integer: ");
        String ordinal = createOrdinalForm(num);
        println(num + "number is : " + ordinal + " ordinal.");
    }

    private String createOrdinalForm(int num){
        String ordinalForm = "";
        String number = "" + num;
        String ending = "";
        switch (num){
            case 1: ending = "st"; break;
            case 2: ending = "nd"; break;
            case 3: ending = "rd"; break;
            default: ending = "th"; break;
        }
        ordinalForm = number + ending;
        return ordinalForm;
    }
}
