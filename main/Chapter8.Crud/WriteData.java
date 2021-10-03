package Chapter8.CRUD;

import acm.program.ConsoleProgram;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData extends ConsoleProgram {

    public void run(){
        File boyNames = new File("BoyNames.txt");
        if (boyNames.exists()){
            println("File already exists");
        } else {
            try {
                PrintWriter output = new PrintWriter(boyNames);
                output.print("Boy names");
                output.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }


    }
}
