import acm.program.ConsoleProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UpdateData extends ConsoleProgram {

    public void run(){

        File sourceFile = new File("boyNames.txt");
        File targetFile = new File("undefined.txt");

//        if (sourceFile.exists()){
//            println("File already exists");
//        }
//        if (targetFile.exists()){
//            println("File already exists");
//        }
        try {
            Scanner input = new Scanner(sourceFile);
            PrintWriter output = new PrintWriter(targetFile);
            while(input.hasNext()){
                String s1 = input.nextLine();
                String s2 = s1.replaceAll( "([A-Z0-9])",s1);
                output.println(s2);
            }
            input.close();
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
