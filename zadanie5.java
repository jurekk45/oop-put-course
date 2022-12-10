public  class Euro implements Currency{
    
    private float cash;
    
    Euro(float ch)
    {
        this.cash=ch;
    }
    
   FakeCantor cantor = new FakeCantor();
    

    
    
   public float toDollarExchangeRate()
        {
            
            return (float)1.0;
        }
    
    public  Euro addedCurrency(float value, String currency)
      { 
          this.cash += value * cantor.euroToRate(currency);
          
          return this.cash;
          
      }

 public Euro subtractedCurrency(float value, String currency)
  {
      
      float tempCash;
       this.cash -= value * FakeCantor.euroToRate(currency);
       tempCash=this.cash;
       Euro ret = New Euro(tempCash);
       return ret;
       
      
  }

 public String abbreviation()
  {
      
      return "EUR";
  }

 public String symbol()
  {
      return "€";
  }

 public String balance()
  {
      return "test";
  }

    
    
}
