package Chapter6;

import acm.program.ConsoleProgram;

public class RationalTest extends ConsoleProgram {

    public void run() {
        Rational a = new Rational(1, 2);
        Rational b = new Rational(1, 3);
        Rational c = new Rational(1, 6);
        Rational sum = a.add(b).add(c);
        println(a + " + " + b + " + " + c + " = " + sum.toString());
    }
}
