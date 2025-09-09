package Practice;


import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<String> team = new ArrayList<>();
        team.add("Barcelona");
        team.add("Real Madrid");
        team.add("Chelsea");
        team.add("Man City");
        team.add("Liverpool");
        team.add("PSG");
        team.add("Bayern");
        team.set(2, "New Castle");
        team.remove(3);
        // System.out.println(team.get(2));
        System.out.println(team);

        int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) {
            System.out.println(num);
        }
        for (int a = 0; a<=20;a++){

            System.out.println("Bangladesh: "+a);
        }
int number = 10;
        do {
            System.out.println("Number in do-while: " + number);
            number -= 2;
        } while (number < 0);


    }
}
