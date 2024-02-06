public class Singleinheritance
{
    public static void main(String[] args)
    {
        b r1=new b();
        r1.initialize();
        r1.sum();
        r1.difference();
        r1.product();
    }
    int a,b;

    public void initialize()

    {
        a=15;
        b=30;
    }
}

class b extends Singleinheritance
{
   
    void sum()
    {
        int a1=a+b;
        System.out.println("the sum is"+a1);
    }
    void difference()
    {
        int b1=a-b;
        System.out.println("the difference is"+b1);
    }
    void product()
    {
        int c1=a*b;
        System.out.println("the product is"+c1);
    }
}