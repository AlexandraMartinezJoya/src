package Chapter8.WIP.RandomNameGenerator;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RandomNameGenrator extends ConsoleProgram {

    RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
        println("This program generates a random first name: ");
        String maleOrFemale = readLine("Please enter 'm' or 'f' to choose what kind of name you want: \n");
        String randomName = "";
        switch (maleOrFemale){
            case "m": randomName = getRandomMaleName();break;
            case "f": randomName = getRandomFemaleName();break;
            default: maleOrFemale = readLine("Please enter 'm' or 'f' to choose what kind of name you want");
        }
        println("The random name is: " + randomName);

    }

    private String getRandomMaleName(){
        String randomName = "";
        File boyFirstNameList = new File("BoysFirstName.txt");
        int nameNumber = rgen.nextInt(0, 1737);
        try {
            Scanner input = new Scanner(boyFirstNameList);
            int i = 0;
            while(input.hasNext()) {
                input.nextLine();
                if(i == nameNumber) {
                    randomName = input.nextLine();
                    break;
                };
                i++;
            }
            input.close();
        } catch (FileNotFoundException e) {
            println(e.getMessage());
        }
        return randomName;
    }

    //getRandomFemaleName
    private String getRandomFemaleName(){
        String femaleName = "";
        File girlFirstNameList = new File("GirlsFirstName.txt");
        int nameNumber = rgen.nextInt(0, 2263);
        try {
            Scanner input = new Scanner(girlFirstNameList);
            int i = 0;
            while(input.hasNext()) {
                input.nextLine();
                if(i == nameNumber) {
                    femaleName = input.nextLine();
                    break;
                };
                i++;
            }
            input.close();
        } catch (FileNotFoundException e) {
            println(e.getMessage());
        }
        return femaleName;
    }
}
