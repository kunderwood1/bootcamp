package underwood;

import java.sql.SQLOutput;

public class Motherboard {
    private String name;
    private String model;
    private String manufacturer;
    private int ramSlots;


    public Motherboard(String name,String model,String manufacturer,int ramSlots){
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
    }
    public void loadProgram(String programName){
        System.out.println("Program: "+programName+" is loading....");
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }
}
