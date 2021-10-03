package Chapter8;

import acm.program.ConsoleProgram;

/***
 *  This program is the textbook example of an acronym
 * @EricRobers -> this could have been ... written better, it's a textbook.
 */
@SuppressWarnings("JavaDoc")
public class Arconym extends ConsoleProgram {

    public void run(){
        println("This program turns a word into an acronym");
        println("This is the textbook example of the definition");
        println("Example word: self contained underwater breathing aparatus");
        println("the acronym is " + arconym("self contained underwater breathing aparatus"));
    }

    @SuppressWarnings("SameParameterValue")
    private String arconym(String line){
        String result = line.substring(0,1);
        int pos = line.indexOf(' ');
        while(pos != -1){
            //noinspection StringConcatenationInLoop
            result += line.substring(pos + 1, pos + 2);
            pos = line.indexOf(' ', pos + 1);
        }
        return result;
    }
}
