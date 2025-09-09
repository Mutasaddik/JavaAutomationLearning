package Class2;

public class VariablesExample {

    int instanceNumber = 100;
    String name = "Abdulla";
    byte b;
    short s;
    long l;
    float f;
    double d;
    char ch = 'A';

    public VariablesExample(int instanceNumber, String name,
                            byte b, short s, long l, float f, double d, char c) {

        this.instanceNumber = instanceNumber;
        this.name = name;
        this.b = b;
        this.s = s;
        this.l = l;
        this.f = f;
        this.d = d;
        this.ch = c; // <-- fixed
    }

    // (optional) quick print to check values
    public void show() {

        System.out.println("instanceNumber=" + instanceNumber);
        System.out.println("name=" + name);
        System.out.println("b=" + b + ", s=" + s + ", l=" + l);
        System.out.println("f=" + f + ", d=" + d + ", ch=" + ch+ "\n\n");
    }
}