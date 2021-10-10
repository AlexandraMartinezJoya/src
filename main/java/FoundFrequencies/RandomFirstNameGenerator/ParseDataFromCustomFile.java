package Chapter8.WIP.RandomNameGenerator;

import acm.program.ConsoleProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ParseDataFromCustomFile extends ConsoleProgram {

    public void run(){
        File maleNameStatistics = new File("BoyNames.txt");
        File femaleNameStatistics = new File("GirlsNames.txt");
        File boyFirstNameList = new File("BoysFirstName.txt");
        File girlFirstNameList = new File("GirlsFirstName.txt");

        try {
            Scanner input = new Scanner(maleNameStatistics);
            PrintWriter writer = new PrintWriter(boyFirstNameList);
            while(input.hasNext()) {
                String line = input.nextLine();
                String boyFirstName = getBoyFirstName(line);
                writer.print(boyFirstName+"\n");
                println(boyFirstName);
            }
            writer.close();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Scanner input = new Scanner(femaleNameStatistics);
            PrintWriter writer = new PrintWriter(girlFirstNameList);
            while(input.hasNext()) {
                String line = input.nextLine();
                String girlFirstName = getBoyFirstName(line);
                writer.print(girlFirstName+"\n");
                println(girlFirstName);
            }
            writer.close();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String getBoyFirstName(String line){
        String name = "";
        if(line.contains("<TD WIDTH=135>")){
            name = line;
            //<TR><TD WIDTH=55><CENTER>350</CENTER></TD><TD WIDTH=55><CENTER>+2</CENTER></TD><TD WIDTH=135>AADEN</TD><TD WIDTH=73>28</TD></TR>
            //023456
            String beforeName = line.substring(0, 90);
            String afterName = line.substring(92);
            name = extractNameFromString(afterName);
        }
        return name;
    }

    private String extractNameFromString(String partialLine){
        String name = "";
        char toLookAfter = '<';
        for(int i = 0; i < partialLine.length(); i++){
            if(partialLine.charAt(i) == toLookAfter){
                name = partialLine.substring(0, i);
                break;
            }
        }

        char toLookBefore = '>';
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == toLookBefore){
                name = name.substring(i + 1);
            }
        }
        return name;
    }
}
