package Chapter4;

import acm.program.ConsoleProgram;

public class DigitSum extends ConsoleProgram {

        public void run(){
            println("This program sums the digits in an integer");
            int n = readInt("Enter a pozitive number: ");
            int digitSum = 0;
            while ( n > 0){
                digitSum += n % 10;
                n /= 10;
            }
            println("The sum of the digits is : " + digitSum);
        }
}
