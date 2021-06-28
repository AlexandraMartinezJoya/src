import acm.program.ConsoleProgram;

public class CountDigits extends ConsoleProgram {
    public void run() {
        println("This program counts the digits in a pozitive number. ");
        int number = readInt("Please enter a positive number:   ?");
        int digitCount = 0;
        int digitSum = 0;
        while ( number > 0){
            digitCount++;
            number /= 10;
        }
        println("The digit count is " + digitCount);
    }
}
