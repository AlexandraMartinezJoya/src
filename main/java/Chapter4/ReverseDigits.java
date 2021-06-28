package Chapter4;

import acm.program.ConsoleProgram;

public class ReverseDigits extends ConsoleProgram {

        public void run(){
                println("This program displays the reversed digits");
                int n = readInt("Enter a pozitive number: ");
                int digitReverse = 0;
                while ( n > 0){
                        digitReverse = digitReverse * 10 + n % 10;
                        n /= 10;
                }
                println("The reverse of the digits is : " + digitReverse);
        }
}
