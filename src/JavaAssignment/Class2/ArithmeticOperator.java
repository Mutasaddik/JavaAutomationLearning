
package Class2;


public class ArithmeticOperator {

    int value1, value2, value3, sum, sub, mul; // instance variables
    double div;
    String name;

    public void calculator() {
        value1 = 10;
        value2 = 20;
        value3 = 30;

        sum = value1 + value2;
        sub = value1 - value2;
        div = value2 / (double) value3;
        mul = value1 * value3;

        System.out.println("Name: " + name);
        System.out.println("Sum is: " + sum);
        System.out.println("Sub is: " + sub);
        System.out.println("Div is: " + div);
        System.out.println("Mul is: " + mul + "\n\n");
    }
}
