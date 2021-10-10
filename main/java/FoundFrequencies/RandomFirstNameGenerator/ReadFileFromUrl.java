package Chapter8.WIP.RandomNameGenerator; /***
 * This program reads data from another website and then writes a local copy of it.
 * This version still has errors in it and I cannot debug it for my debugger has crashed.
 */

import acm.program.ConsoleProgram;

import javax.swing.text.View;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileFromUrl extends ConsoleProgram {

    public void run(){
        try{
        String weblink = "http://www.avss.ucsb.edu/NameMala.HTM";
//        String weblink = "http://www.avss.ucsb.edu/NameFema.HTM";
//        URI uri = new URI(weblink);
//        Desktop myDesktop = Desktop.getDesktop();
//        myDesktop.browse(uri);
        int count = 0;

        URL link = new URL(weblink);
        Scanner input = new Scanner(link.openStream());
        File boyNames = new File("BoyNames.txt");
        PrintWriter output = new PrintWriter(boyNames);
        while(input.hasNext()) {
            String line = input.nextLine();
            count += line.length();
            println("name: " + line + "\n");
            output.print(line + "\n");
        }
        output.close();
        println("The size of the file is " + count + " characters");

//        Desktop desktop = Desktop.getDesktop();
//        URI uri = new URI("C:/Users/za0ne/IdeaProjects/NewUtopia/BoyNames.HTML");
//        desktop.browse(uri);
        } catch (Exception e){
            println(e.getMessage());
        }
    }

    private int findNextPositionInStringAfterSpecifiedString(String toSearchFor, String toSearchInto) throws Exception {
        int nextCharacterPosition = 0;
        int stringToSearchForLength = toSearchFor.length();
        int stringToSearchIntoLength = toSearchInto.length();
        if (!(stringToSearchForLength > stringToSearchIntoLength)) {
            if(characterSequenceInCorrectOrderIsFound(toSearchFor, toSearchInto)){
                nextCharacterPosition = getNextCharacterPosition(toSearchFor, toSearchInto);
            }
        }
        return nextCharacterPosition;
    }

    private boolean characterSequenceInCorrectOrderIsFound(String toSearchFor, String toSearchInto){
//        String numbers = buildLengthNumbers(stringToSearchForLength);
        boolean isCorrectSequenceFound = false;
        int nextIndex = 0;
        String builtStringSequenceForFound = builtStringSequenceForFound(toSearchFor);
        String currentSequence = "";
        for (int i = 0; i < toSearchInto.length(); i++){
            char currentCharacterToSearchInto = toSearchInto.charAt(i);
            for(int j = 0; j < toSearchFor.length(); j++) {
                char currentCharThatsBeingSearchedFor = toSearchFor.charAt(j);
                if(currentCharacterToSearchInto == currentCharThatsBeingSearchedFor) {
                    if (j + 1 <  toSearchFor.length()){
                        char nextCharThatsBeingSearchedInto = toSearchInto.charAt(i + 1);
                        char nextCharThatsBeingSearchedFor = toSearchFor.charAt( j + 1);
                        if (nextCharThatsBeingSearchedFor == nextCharThatsBeingSearchedInto) {
                            currentSequence += "+";
                        }
                    }
                }
            }
            if (currentSequence.equals(builtStringSequenceForFound)) {
                isCorrectSequenceFound = true;
                break;
            }
        }
        return isCorrectSequenceFound;
    }

    private String builtStringSequenceForFound(String toSearchFor){
        String builtString = "";
        for(int i = 0; i < toSearchFor.length(); i++){
            builtString += "+";
        }
        return  builtString;
    }

    private int getNextCharacterPosition( String toSearchFor, String toSearchInto){
        int nextIndex = 0;
        String builtStringSequenceForFound = builtStringSequenceForFound(toSearchFor);
        String currentSequence = "";
        for (int i = 0; i < toSearchInto.length(); i++){
            char currentCharacterToSearchInto = toSearchInto.charAt(i);
            for(int j = 0; j < toSearchFor.length(); j++) {
                char currentCharThatsBeingSearchedFor = toSearchFor.charAt(j);
                if(currentCharacterToSearchInto == currentCharThatsBeingSearchedFor) {
                    if (j + 1 <  toSearchFor.length()){
                        char nextCharThatsBeingSearchedInto = toSearchInto.charAt(i + 1);
                        char nextCharThatsBeingSearchedFor = toSearchFor.charAt( j + 1);
                        if (nextCharThatsBeingSearchedFor == nextCharThatsBeingSearchedInto) {
                            currentSequence += "+";
                        }
                    }
                }
            }
            if (currentSequence.equals(builtStringSequenceForFound)) {
                nextIndex = i + 1;
                break;
            }
        }
        return nextIndex;
    }

    private int findNextPositionInStringBeforeSpecifiedString(String toSearchFor, String toSearchInto){

        return toSearchInto.length() -1;
    }

    public boolean navigateUrl(String url) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                try {

                    URI uri = new URI(url);
                    desktop.browse(uri);
                    return true;
                } catch (IOException | URISyntaxException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return false;
    }
}
