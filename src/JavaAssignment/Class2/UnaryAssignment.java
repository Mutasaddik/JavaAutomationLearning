package Class2;

public class UnaryAssignment {

    int value1, value2, value3, sum, sub, mul; // instance variables
    double div;
    String name;

    public UnaryAssignment(String name, int i) {
        this.name = name;

        System.out.println(" Getting value from constructor");
        System.out.println("Raw Value: "+i);
        System.out.println("Value  I++: "+i++);
        System.out.println("Value  ++I: "+ ++i);
        System.out.println("Value  --I: "+ --i);
        System.out.println("Value  I--: "+ i--+ "\n\n");
    }


    public void unary(int x){
        int i =x;   //local variable
        System.out.println("Raw Value: "+i);
        System.out.println("Value  I++: "+i++);
        System.out.println("Value  ++I: "+ ++i);
        System.out.println("Value  --I: "+ --i);
        System.out.println("Value  I--: "+ i--+ "\n\n");
    }

}