package Chapter2;
import acm.graphics.GLabel;
import acm.program.ConsoleProgram;

/***
 * This program is saying hello to the graphic element GLabel
 *
 * Solved by @AlexandraMartinezJoya
 */

class ILoveComputerScience extends ConsoleProgram {

    public void run(){
        GLabel myLabel = new GLabel("I love myself and my son.");
        GLabel myOtherLabel = new GLabel("I also love programming and helping other people grow and succeed at what they do");
        GLabel myThirdLabel = new GLabel("I also love my friends.");
        GLabel myFouthLabel = new GLabel("I also love the family on my side.");
        GLabel myFifthLabel = new GLabel("I loved many guys in my past and slept with them all and do not regret it one bit. I love making love! Am very good at it too.");
        GLabel mySixthLabel = new GLabel("I do not want to wear a chastity belt for enjoying having sex or love-making, be tortured, punished, almost killed because I own my own body");
        GLabel mySeventhLabel = new GLabel("And any religion that does that to human beings should not exist.");

        add(myLabel);
        add(myOtherLabel);
        add(myThirdLabel);
        add(myFouthLabel);
        add(myFifthLabel);
        add(mySixthLabel);
        add(mySeventhLabel);
    }

    //Homework. For when we reach arrays, lists
    private void add(GLabel labels){

    }
}
