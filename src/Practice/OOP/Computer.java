package Practice.OOP;

public class Computer<pc> extends Gadgets {

    private pc monitor;
    private  pc disc;
    private  pc ram;
    private pc casing;

    public Computer(){

    }

    public Computer(pc monitor, pc disc,pc ram, pc casing ){

        this.monitor =monitor;
        this.disc =disc;
        this.ram =ram;
        this.casing =casing;

    }

    public Computer(pc battery, pc display, pc cpu) {
        this.battery = battery;
        this.cpu = cpu;
        this.display = display;
    }

    public void setMonitor(pc monitor){
        this.monitor=monitor;
    }
    public pc getMonitor(){
        return monitor;
    }

    public void setDisc(pc disc){
        this.disc=disc;
    }
    public pc getDisc(){
        return disc;
    }


    public void setRam(pc ram){
        this.ram=ram;
    }
    public pc getRam(){
        return ram;
    }



    public void setCasing(pc casing){
        this.casing=casing;
    }
    public pc getCasing(){
        return casing;
    }

    public void show(){

        System.out.println("Montor Name: "+ getMonitor());
        System.out.println("Ram Name: "+getRam());
        System.out.println("Disc Name: "+getDisc());
        System.out.println("Casing Name: "+getCasing());

    }

    public void showId(){

        System.out.println("battery: "+ battery);
        System.out.println("cpu: "+cpu);
        System.out.println("display: "+display);


    }
}


