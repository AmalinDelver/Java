public class multilevel {
    public static void main(String[] args) {
        {
            volume v = new volume();
            v.initialize();
            v.volume();
            v.area();
        }
    }
}
class rectangle
{
    int l,w,h;
    public void initialize()
    {
        l=10;
        w=25;
        h=12;
    }
}
class area extends rectangle
{
    public void area()
    {
        int a1= l*w;
        System.out.print("Rectangle area is l*w" +a1);
    }
}
class volume extends area
{
    public void volume()
    {
        int b1=l*w*h;
        System.out.println("Volume of rectangle is l*w*h" +b1);
    }
}