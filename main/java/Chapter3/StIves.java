package Chapter3;

import acm.program.ConsoleProgram;

public class StIves extends ConsoleProgram {

        public void run(){
           int storyteller = 1;
           int man = 1;
           int wives = 7;
           int sacks = wives * 7;
           int cats = sacks * 7;
           int kits = cats * 7;
           int totalPeopleGoingToStIves =  storyteller + man + wives + sacks + cats + kits;
           println("Total of people going to st ives is " + totalPeopleGoingToStIves);
        }
}
