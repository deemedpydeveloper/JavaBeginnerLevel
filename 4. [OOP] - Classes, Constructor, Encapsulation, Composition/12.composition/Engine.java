package composition;

public class Engine
{
    private int carPower;
    private String transmission;
    
    
    //setters
    public void setCarPower(int carPower)
    {
        this.carPower = carPower;
    }

    public void setTransmission(String transmission)
    {
        this.transmission = transmission;
    }
    
    
    //getters
    public int getCarPower()
    {
        return carPower;
    }

    public String getTransmission()
    {
        return transmission;
    }
}