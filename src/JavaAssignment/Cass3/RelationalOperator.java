package JavaAssignment.Cass3;

public class RelationalOperator {

    public static void main(String[] args) {
        int a = 19;
        int b = 30;
        int c = 26;


        System.out.println("a < b  = " + (a < b));
        System.out.println("b <= c = " + (b <= c));
        System.out.println("a == c = " + (a == c));
        System.out.println("a != c = " + (a != c));
        System.out.println("b > a  = " + (b > a));
        System.out.println("c >= b = " + (c >= b));

        if (a < b && b <= c){
            System.out.println("a<b<=c");
        }
        else{
            System.out.println("Wrong value");

        }
    }
}