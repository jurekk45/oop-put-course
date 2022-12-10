
public class Main
{
	public static void main(String[] args) {
	    
	    IntegerCalculator myCalc1 = new IntegerCalculator(-1,12);
	    IntegerCalculator myCalc2 = new IntegerCalculator(-100,55);
	    
	    
	  System.out.println("myCalc1:");
		System.out.println(myCalc1.max());
		System.out.println(myCalc1.min());
		System.out.println(myCalc1.avg());
		
		System.out.println("");
		System.out.println("myCalc2:");
		System.out.println(myCalc2.max());
		System.out.println(myCalc2.min());
		System.out.println(myCalc2.avg());
	
	}
}


public interface IntegerCalculatorInterface
{
    
 
   public  int max();
   public  int min();
   public  float avg();
    
    
}

public class IntegerCalculator implements IntegerCalculatorInterface{
    
    private int firstInt;
    private int secondInt;
    
    IntegerCalculator(int fi, int si)
    {
        this.firstInt=fi;
        this.secondInt=si;
        
    }
  @Override  
  public  int max() { return this.firstInt > this.secondInt ? this.firstInt : this.secondInt;}
  
  @Override
  public  int min() { return this.firstInt < this.secondInt ? this.firstInt : this.secondInt;}
  
  
  @Override
  public  float avg() { 
      
    
      
      
      return (float)((float)this.firstInt + (float)this.secondInt) / 2;}
  
  
}


