package JavaAssignment.Cass3;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 50, b = 40, c = 30, d = 20;


        System.out.println("Initial values: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        System.out.println("\n1. a += ++b:");
        System.out.println("Before: a = " + a + ", b = " + b);
        System.out.println("Operation: a += ++b; (b is incremented before addition)");
        System.out.println("Result: " + (a += ++b));

        System.out.println("\n2. b += -+c:");
        System.out.println("Before: b = " + b + ", c = " + c);
        System.out.println("Operation: b += -+c; (Unary plus is redundant here)");
        System.out.println("Result: " + (b += -+c));

        System.out.println("\n3. d += --b:");
        System.out.println("Before: d = " + d + ", b = " + b);
        System.out.println("Operation: d += --b; (b is decremented before addition)");
        System.out.println("Result: " + (d += --b));

        System.out.println("\n4. c += b:");
        System.out.println("Before: c = " + c + ", b = " + b);
        System.out.println("Operation: c += b; (adding b to c)");
        System.out.println("Result: " + (c += b));

        System.out.println("\n5. b = +b:");
        System.out.println("Before: b = " + b);
        System.out.println("Operation: b = +b; (Unary plus doesn't change the value)");
        System.out.println("Result: " + (b = +b));

        System.out.println("\n6. a += ++b:");
        System.out.println("Before: a = " + a + ", b = " + b);
        System.out.println("Operation: a += ++b; (b is incremented before addition)");
        System.out.println("Result: " + (a += ++b));

        System.out.println("\n7. a -= ++b:");
        System.out.println("Before: a = " + a + ", b = " + b);
        System.out.println("Operation: a -= ++b; (b is incremented before subtraction)");
        System.out.println("Result: " + (a -= ++b));

        System.out.println("\n8. a *= ++b:");
        System.out.println("Before: a = " + a + ", b = " + b);
        System.out.println("Operation: a *= ++b; (b is incremented before multiplication)");
        System.out.println("Result: " + (a *= ++b));

        System.out.println("\n9. a /= ++b:");
        System.out.println("Before: a = " + a + ", b = " + b);
        System.out.println("Operation: a /= ++b; (b is incremented before division)");
        System.out.println("Result: " + (a /= ++b));

        System.out.println("\n10. a %= ++b:");
        System.out.println("Before: a = " + a + ", b = " + b);
        System.out.println("Operation: a %= ++b; (b is incremented before modulus)");
        System.out.println("Result: " + (a %= ++b));
    }
}