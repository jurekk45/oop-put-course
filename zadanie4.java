

public class Main
{
	public static void main(String[] args) {
		
		Plant plant1 = new Plant("Cabbage",5,"Field");
		Plant plant2 = new Plant("Sunflower",11,"Field");
		
		System.out.println(plant1.dropSeeds());
		System.out.println(plant1.germination());
		
	    System.out.println(plant2.dropSeeds());
	    System.out.println(plant2.germination());
	    plant2.harvest();
	    System.out.println(plant2.placement());
	}
}


interface inter1
{
     String dropSeeds();
     String germination();
     Plant harvest();
     String placement();
     
    
}

class Plant implements inter1
{
    private String name;
    private int month;
    private String place;
    
    
    Plant(String nm,int mt, String pl)
    {
        this.name=nm;
        this.month=mt;
        this.place=pl;
        
    }
    
  //  @Override
  
    public String dropSeeds()
    {
        if(month >=8 && month <=12)
        {
        return "Seeds droped";
        }
        
        else{
            return "It is to early!";
        }
    }
    
    public String germination()
    {
        if(month >=4 && month <=6)
        {
        return "Lets go !";
        }
        
        else{
            return "It is to cold! :(";
        }
        
    }
    
    public Plant harvest()
    {
        return new Plant(this.name,this.month,"Granary");
    }
    
    
    public String placement()
    {
        return this.place;
    }
    
    
}
