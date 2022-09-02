package multiLevelInheritance;

/*parent class*/
class Electronics
{
    /*Instance variables*/
    String name;
    int price;
    /*setters*/
    void setName(String name)
    {
        this.name = name;
    }
    void setPrice(int price)
    {
        this.price = price;
    }
    /*getters*/
    String getName()
    {
        return name;
    }
    int getPrice()
    {
        return price;
    }
}

/*Intermaediate Sub Class*/
class fan extends Electronics
{ 
    // instance variable.
    int AirSpeed;
    
    /*setter*/
    void setAirSpeed(int speed)
    {
        this.AirSpeed = speed;
    }
    
    /*getter*/
    int getAirSpeed()
    {
        return AirSpeed;
    }
}


/*Child Class*/
class WaterFan extends fan
{
    int WaterCapacity;
    
    /*Setter*/
    void setWaterCapacity(int capacity)
    {
        this.WaterCapacity = capacity;
    }
    
    
    /*getter*/
    int getWaterCapacity()
    {
        return WaterCapacity;
    }
}

public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        /*Accessing Parent and Intermediate Class memeber fields with Child Class Object*/
        WaterFan f1 = new WaterFan();
        
        /*Parent Class*/
        f1.setName("Usha");
        System.out.println("Name: "+f1.getName());
        
        f1.setPrice(100);
        System.out.println("Price: "+f1.getPrice());
        
        /*Intermediate Sub Class*/
        f1.setAirSpeed(5000);
        System.out.println("AirSpeed: "+f1.getAirSpeed());
        
        /*Child Class*/
        f1.setWaterCapacity(50);
        System.out.println("WaterCApacity: "+f1.getWaterCapacity());
        
        System.out.println("");
    }
}
