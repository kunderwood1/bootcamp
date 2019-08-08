package underwood;

public class Car extends Vehicle {
    private int doors;
    private int wheels;

    public Car(String name,int doors, int wheels){
        super(name);
        this.doors = doors;
        this.wheels = wheels;
    }
}
