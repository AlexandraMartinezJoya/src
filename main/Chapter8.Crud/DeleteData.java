package Chapter8.CRUD;

import acm.program.ConsoleProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeleteData extends ConsoleProgram {

    public void run(){

        File targetFile = new File("ToDelete.txt");

        if (targetFile.exists()){
            try {
                Scanner file = new Scanner(targetFile);
                PrintWriter output = new PrintWriter(targetFile);
                while(file.hasNext()){
                    String s1 = "";
                    String s2 = s1.replaceAll( "([A-Z0-9])",s1);
                    output.println(s2);
                }
                output.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}
