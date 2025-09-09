package JavaAssignment.Cass3;

public class LogicalOperator {

    public static void main(String[] args) {

        int a = 50, b = 40, c = 30, d = 20;

        boolean ab = (a < b); //false
        boolean bc = (b > c); //true
        boolean cd = (c < d); //false
        boolean dc = (c > d); //true


        boolean cond1 = (ab && bc) || cd;
        boolean cond2 = (ab && bc) && cd;
        boolean cond3 = ab || bc || cd;
        boolean cond4 = ab && bc || cd || dc;

        System.out.println("1st ((a<b && b>c) || (c<d)) = " + (cond1 ? "VALID" : "INVALID"));
        System.out.println("2nd ((a<b && b>c) && (c<d)) = " + (cond2 ? "VALID" : "INVALID"));
        System.out.println("3rd ((a<b) || (b>c) || (c<d)) = " + (cond3 ? "VALID" : "INVALID"));
        System.out.println("3rd ((a<b) && (b>c) || (c<d) || (c>d)) = " + (cond4 ? "VALID" : "INVALID"));

        if (!cond1 && !cond2 && !cond3) {
            System.out.println("Invalid (none are true)");
        }
        else{
            System.out.println("Some value are true");
        }
    }
}
