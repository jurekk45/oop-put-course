// NEW
public class Main {
    public static void main(String[] args) {



      ClassRoom classroom123 = new ClassRoom(123,30,12,"AIR");
      ClassRoom classroom255 = new ClassRoom(255,15,7,"IIT");

      Student Jack_Sparrow = new Student("Jack","Sparrow",30,0.0,"AIR");
      Student Isla_Rodriguez = new Student("Isla","Rodriguez",60,0.0,"IIT");
      Student Lily_Smith = new Student("Lily","Smith",80,0.0,"AIR");

      Professor John_Clay = new Professor("John","Clay");

      classroom123.doorOpen(Jack_Sparrow);
      classroom123.doorOpen(John_Clay);
      classroom123.doorOpen(Lily_Smith);
      classroom123.doorOpen(Isla_Rodriguez);
      classroom255.doorOpen(Isla_Rodriguez);

      John_Clay.examResult(Jack_Sparrow);
      John_Clay.examResult(Lily_Smith);


    }
}

class Student {
    String firstName;
    String lastName;
    double knowledgeLevel;
    double grade;

    String studentGroup;


    Student(String fN, String lN, double kN, double gr, String stg)
    {
        firstName=fN;
        lastName=lN;
        knowledgeLevel=kN;
        grade=gr;
        studentGroup=stg;

    }

    public void reaction()
    {
        if(grade>=3.0)
        {
            System.out.println("Yeeeah!");
        }
        else
        {
            System.out.println(" :(");

        }

    }



}

class ClassRoom {
    int classNumber;
    int maxStudents;
    int studentsInClass;
    String groupInClass;

    ClassRoom( int cN, int mS, int sIC,String gIC){

        classNumber=cN;
        maxStudents=mS;
        studentsInClass=sIC;
        groupInClass=gIC;

    }


    public static void doorOpen(Professor pro){


        System.out.println("Good Morning Mr."+pro.lastName );

    }

    public void doorOpen(Student stu){
        // correct group ?
        if(stu.studentGroup == groupInClass) {
            System.out.println("Hey " + stu.firstName + " good to see you!");
        }
        else {
            System.out.println("Oh no it is wrong classroom!");
        }


    }



}

class Professor {
    String firstName;
    String lastName;

    Professor(String fN,String lN){

        firstName=fN;
        lastName=lN;

    }

    public double examResult(Student stu)
    {
        if (stu.knowledgeLevel <51)
        {
            stu.grade=2.0;
        } else if (stu.knowledgeLevel >=51 && stu.knowledgeLevel <=60) {

            stu.grade=3.0;

        } else if (stu.knowledgeLevel >=61 && stu.knowledgeLevel <=70) {
            stu.grade=3.5;
        } else if (stu.knowledgeLevel >=71 && stu.knowledgeLevel <=80) {

            stu.grade=4.0;

        } else if (stu.knowledgeLevel >=81 && stu.knowledgeLevel <=90) {

            stu.grade=4.5;
        }
        else if (stu.knowledgeLevel >=91 && stu.knowledgeLevel <=100) {

            stu.grade=5.0;
        }
        stu.reaction();

        return 0;
    }


}



//OLD
/*
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
	
		
		
	}
	
		public static void test(String[] args) {
   		ClassRoom class25 = new ClassRoom();
		System.out.println(class25.tables);
   	}
	
	
}


public class ClassRoom
{
    int chairs = 15;
    int tables = 20;
    int people = 17;
   
   public static void enter(String[] args) {
		System.out.println("Welcome!");
   }
   
   	public static void main(String[] args) {
   		ClassRoom class25 = new ClassRoom();
		System.out.println(class25.tables);
   	}
}



public class Student
{
    int age = 15;
    int index = 144007;
    int mark = 4;
   
  public static void students(String[] args) {
		System.out.println("Quiet! We study here!");
	}
    
}
*/
