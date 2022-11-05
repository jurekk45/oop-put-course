

public class Main
{
	public static void main(String[] args) {
		
		
		Engine engine1 = new Engine(100,"Benzine",2.1);
		//System.out.println(engine1.engineInformation());
		
		Vehicle car1=new Vehicle("Opel","Astra",5,120,engine1);
		System.out.println(car1.carInformation());
	}
}


class Engine{
    private int horsePower;
    private String gasType;
    private double engineDisplacement;
    
    
    Engine(int hP,String gT, double eD)
    {
        this.horsePower=hP;
        this.gasType=gT;
        this.engineDisplacement=eD;
        
    }
    
    public String engineInformation()
    {   
        String data=String.format("Horse Power: %d HP Gas Type: %s Engine Displacement: %.1f",this.horsePower,this.gasType,this.engineDisplacement);
        
        return data;
        
        
    }
    
    
}


class Vehicle
{
    private String brand;
    private String model;
    private int maxSpeed;
    private int seats;
    private Engine carEngine;
    
    Vehicle(String br,String mo,int se,int mS,Engine cE)
    {
        this.brand=br;
        this.model=mo;
        this.seats=se;
        this.maxSpeed=mS;
        this.carEngine=cE;
        
    }
    
    public String carInformation()
    {
        String engine;
        engine=carEngine.engineInformation();
        String data=String.format("Brand: %s Model: %s Seats: %d Max Speed:  %d km/h %s",this.brand,this.model,this.seats,this.maxSpeed,engine);
        
        return data;
        
    }
    
    
    
    
    
}
