package composition;

class Car
{
    private final String carColor;
    private final int carGears;
    
    // tapping into public class engine states and behaviours.
    Engine e = new Engine();
    
    Car(String color, int gears, int power, String transmission)
    {
        e.setCarPower(power);
        e.setTransmission(transmission);
        this.carColor = color;
        this.carGears = gears;
    }

    // getters for car class.
    public String getCarColor()
    {
        return carColor;
    }

    public int getCarGears()
    {
        return carGears;
    }

    // getters inherited using engine object.
    public int getCarPower()
    {
        return e.getCarPower();
    }
    
    public String getTransmission()
    {
        return e.getTransmission();
    }
}

public class Composition
{
    public static void main(String[] args)
    {
        Car c = new Car("white", 6, 700, "Diesel");
        System.out.println(c.getCarColor());
        System.out.println(c.getCarGears());
        System.out.println(c.getCarPower());
        System.out.println(c.getTransmission()+"\n");
    }
}