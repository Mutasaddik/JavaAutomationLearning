package JavaAssignment.Class4;

public class AccessModifiers {
    public int b;
    protected int c;
    private int a;


    public AccessModifiers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public AccessModifiers() {

    }
    public void ShowValue() {

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }

    public static void main(String[] args) {

        AccessModifiers AM = new AccessModifiers(10, 12, 20);
        AM.ShowValue();
        System.out.println("Now Default Constructor");
        AccessModifiers AM2 = new AccessModifiers();
        AM2.b = 5;
        AM2.c = 3;
        AM2.a = 3;
        AM2.ShowValue();
    }

}

