public class Main {
    public static void main(String[] args)
    {

        Airplane cobra = new Airplane();
        cobra.display();

        Airplane osprey = new Airplane(true,2,8,"Osprey");
        osprey.display();

        Airplane boeing_747 = new Airplane(false,2,660);
        boeing_747.display();

        Airplane light_aircraft = new Airplane(false,2,"Light aircraft");

        light_aircraft.display();

        Airplane mustang = new Airplane(1,0,"Mustang");
        mustang.display();
        

    }
}


class Airplane{

    boolean armyAirplane;


    int crew;
    int passengers;
    String airplaneName;

    Airplane()// no data about airplane; default values
    {
        armyAirplane=false;
        crew=0;
        passengers=0;
        airplaneName="unknown airplane";

    }
    Airplane(boolean b,int c,int pas,String nm) // constructor with all data
    {
        armyAirplane=b;
        crew=c;
        passengers=pas;
        airplaneName=nm;


    }
    Airplane(boolean b,int c,int pas) // unknown airplane name
    {
        armyAirplane=b;
        crew=c;
        passengers=pas;
        airplaneName="unknown airplane";


    }
    Airplane(boolean b,int c,String nm) // unknown passengers seats
    {
        armyAirplane=b;
        crew=c;
        passengers=0;
        airplaneName=nm;


    }
    Airplane(int c,int pas,String nm) // unknown purpose of the airplane
    {
        armyAirplane=false;
        crew=c;
        passengers=pas;
        airplaneName=nm;


    }

    public void display()
    {
        System.out.println(airplaneName+" "+" crew members "+crew+" "+" passengers seats = "+passengers);
        if(armyAirplane)
        {
            System.out.println(airplaneName+ " is military airplane.");
        }

    }


}
