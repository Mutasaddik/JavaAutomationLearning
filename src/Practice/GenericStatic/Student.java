package Practice.GenericStatic;

import Practice.OOP.Gadgets;

public class Student<T> extends Gadgets {
    public static Double cgpa;
    public static int roll;
    private T ID;
    private T Name;
    private T Varsity;

    public Student() {

    }

    public Student(T battery, T display, T cpu) {
        this.battery = battery;
        this.display = display;
        this.cpu = cpu;
    }


    public Student(double cgpa) {
        Student.cgpa = cgpa;
    }

    public static int value(int roll) {

        Student.roll = roll;
        int squareValue = roll * roll;
        return squareValue;
    }

    public T getID() {
        return ID;
    }

    public void setID(T ID) {
        this.ID = ID;
    }

    public T getName() {
        return Name;
    }

    public void setName(T Name) {
        this.Name = Name;
    }

    public T getVarsity() {
        return Varsity;
    }

    public void setVarsity(T Varsity) {
        this.Varsity = Varsity;
    }

    public void ShowValue() {

        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Varsity: " + getVarsity());
        System.out.println("CGPA: " + cgpa);


    }

    public void SGadgetShow(){

        System.out.println("battery: "+ battery);
        System.out.println("cpu: "+cpu);
        System.out.println("display: "+display);


    }
}
