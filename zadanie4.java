
public class Main
{
    public static void main(String[] args) {

        Plant plant1 = new Plant("Cabbage",5,"Field_1");
        Plant plant2 = new Plant("Sunflower",11,"Field_2");

        if(plant2.ripe())
            {
                System.out.println("Seeds droped");
            }
        else
            {
                System.out.println("It is to early!");
            }

        if(plant1.ripe())
            {
                System.out.println("Seeds droped");
            }
        else
            {
                System.out.println("It is to early!");
            }




        if(plant1.germinative())
            {
                System.out.println("Lets go !");
            }
        else
            {
                System.out.println("It is to cold! :(");
            }

        if(plant2.germinative())
            {
                System.out.println("Lets go !");
            }
        else
            {
                System.out.println("It is to cold! :(");
            }



        System.out.println(plant2.placement());

        plant2= plant2.harvesting();

        System.out.println(plant2.placement());
    }
}


interface PlantsLife
{
    boolean ripe();
    boolean germinative();
    Plant harvesting();
    String placement();


}

class Plant implements PlantsLife
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



    public boolean ripe()
    {
        if(month >=8 && month <=12)
        {
            return true;
        }

        else{
            return false;
        }
    }

    public boolean germinative()
    {
        if(month >=4 && month <=6)
        {
            return true ;
        }

        else{
            return false ;
        }

    }

    public Plant harvesting()
    {
        return new Plant(this.name,this.month,"Granary");
    }


    public String placement()
    {
        return this.place;
    }


}
