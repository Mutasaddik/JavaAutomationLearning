package JavaAssignment.Class4;

public class LoopAndJumping {
    int[] value = {10, 12, 43, 21, 23};
    int[] value2 = {130, 132, 443, 251, 623};

    public void JumpingShow() {

        for (int a = 0; a < 10; a++) {
            if (a == 3) {
                break;
            }
            System.out.println("Values Are: " + a);
        }

        for (int a = 0; a < 10; a++) {
            if (a == 8) {
                continue;
            }
            System.out.println("Values Are: " + a);
        }
    }

    //    For loop
    public void loopShowValues() {
        for (int i = 0; i < value.length; i++) { //For
            System.out.println("For Loop Values Are: " + value[i]);
        }
        for (int a : value2) {  //For each
            System.out.println("For Each Loop Values Are: " + a);

        }

        int i = 0; ////While Loop
        while (i < 4) {
            if (i == 2) {
                break;
            }
            System.out.println("This is While Loop");
            i++;
        }

        while (i<6){
            if(i==4){
                break;
            }
            System.out.println("This is second While Loop");
            i++;
        }
    }

    public static void main(String[] args) {
        LoopAndJumping laj = new LoopAndJumping();
        laj.loopShowValues();
        laj.JumpingShow();
    }
}




