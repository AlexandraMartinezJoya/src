import acm.program.ConsoleProgram;

public class PerfectNumbers extends ConsoleProgram {

    public void run() {
        println("This program prints all the numbers between 1 and 9999 which are perfect numbers.");
        for(int i = 1; i < 10000; i++) {
            if(isPerfect(i)){
                println("Number " + i + " number is a perfect number" );
            }
        }
    }

    private boolean isPerfect( int number) {
        boolean flag = false;
        // 6 is a perfect number because the sum of its divisors add up to the number ( 1, 2 , and 3)
        int divisorSum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                divisorSum += i;
            }
        }
        if(divisorSum == number) {
            flag = true;
        }
        return flag;
    }
}
