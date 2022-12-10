public class Main
{
    public static void main(String[] args) {


        Logarithm log1 = new Logarithm(2,5);
        System.out.println("Program output: "+log1.doubleValue());
    }
}

 interface LogarithmInterface
{

    public double doubleValue();



}


 class Logarithm implements LogarithmInterface {
    private double base, argument;

    @Override
    public double doubleValue() {

        try {
            if (this.argument <= 0)
                {
                        throw new Exception(" Argument cannot be less or equal than 0 !");
                }
            }
         catch (Exception e)
            {
            System.out.println(e);
            return -1;

            }

        try {
            if (this.base <= 0 || this.base == 1)
                {
                    throw new Exception(" Base cannot be less than 0 or equal 1!");
                }
             }
        catch (Exception e)
            {
            System.out.println(e);
            return -1;
            }

        return Math.log(this.argument) / Math.log(this.base);
    }



    public Logarithm(double inputBase, double inputArgument)
    {

        this.base = inputBase;
        this.argument = inputArgument;

    }
}
