package Practice.OOP;

import Practice.GenericStatic.Student;

public class Main {
    public static void main(String[] args) {
        Computer<String> com = new Computer<>();
        com.setMonitor("Asus ROG");
        com.setDisc("Evo 970");
        com.setCasing("NZXT");
        com.setRam("8 GB-- Corsair");
        com.show();

        System.out.println("\n For 2nd line \n");

        Computer<Integer> com2 = new Computer<>(1, 2, 3, 4);

        System.out.println("\n For 3rd line \n");

        Computer<String> gadget = new Computer<>("2700", "IPS", "CORE I7");
        gadget.showId();
        System.out.println("\n Student Gadget \n");
        Student<String> SGadget = new Student<>("2700", "MSI", "AMD");
        SGadget.SGadgetShow();

    }

}
