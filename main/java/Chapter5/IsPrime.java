import acm.program.ConsoleProgram;

public class IsPrime extends ConsoleProgram {

    public void run() {
        println("This program reads in integers and checks to see if they are prime numbers");
        int n1 = readInt("Enter number: ");
        if(isNotPrime(n1)) {
            println("Number " + n1 + " is not a prime number");
        } else {
            println(" Number  " + n1 + " is a prime number");
        }
    }

    private boolean isNotPrime(int number) {
        boolean isNotPrime = false;
        for (int i =  2; i < number; i++) {
            if(number % i == 0){
                isNotPrime = true;
                break;
            }
        }
        return isNotPrime;
    }

    private boolean isPrime(int number) {
        //TODO: Rewrite the bruteforce algorithm
        boolean isPrime = false;
        return isPrime;
    }
}
