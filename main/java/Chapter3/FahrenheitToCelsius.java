package Chapter3;

import acm.program.ConsoleProgram;

public class FahrenheitToCelsius extends ConsoleProgram {

        public void run(){
            println("This program converts Fahrenheit to Celsius");
            double fah = readDouble("Enter Fahrenheit temperature: ");
            double celsius = (5 * (fah - 32)) / 9 ;
            println("Celsius equivalent = " + celsius);
        }
}
