package underwood;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("300","Dell","240",dimensions);
        Monitor theMonitor =  new Monitor("thebeast", "Dell",62, new Resolution(2540,12123));

        Motherboard theMotherboard = new Motherboard("MSI","gg4-53","MSI",4);
        Computer thePc = new Computer(theCase,theMonitor,theMotherboard);


        //thePc.getMotherboard().loadProgram("Windows");
        thePc.powerUp();



    }
}
