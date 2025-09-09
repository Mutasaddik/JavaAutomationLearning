package Practice.GenericStatic;

public class Main {

    public static void main(String[] args) {
//        Student<String> Name = new Student<>("19-41373-3","Abdulla","Aiub",2.23);
//        Name.ShowValue();
        Student<String> Show = new Student(2.23);
//        Student<Integer> ID = new Student<>();
//        Student<String> Name = new Student<>();
        Show.setID("19-41373-3");
        Show.setName("Abdulla");
        Show.setVarsity("Aiub");
        Show.ShowValue();

        System.out.println("For 2nd line");

        Student<Integer> another = new Student<>();
        another.setID(2);
        another.setName(2);
        another.setVarsity(4);
        another.ShowValue();

        Student.roll = 10;
        System.out.println("Roll: " + Student.roll);

        System.out.println("For 3rd line");
        System.out.println( "Square Value: "+Student.value(10));


    }
}