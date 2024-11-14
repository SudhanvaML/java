//Method Overloading
class Area
{
    int l,b,h;
    double r1;

    Area(int l1,int b1,int h1,double r1)
    {
        this((double)r1);
        this.l=l1;
        this.b=b1;
        this.h=h1;
    }
    Area(double r1)
    {
        this.r1=r1;
    }
    double compArea()
    {
        System.out.println("Area of circle");
        return 3.14*r1*r1;
    }
    double compArea(String s)
    {
        System.out.println(s);
        return l*b;
    }
    double compArea(String s,String t)
    {
        System.out.println(s+" of "+t);
        return l*b*h;
    }
}

class methodoverlod1
{
    public static void main(String[] args)
    {
        Area ob=new Area(10,12,13,8);
        double result=ob.compArea();
        System.out.println(result);

        double result1=ob.compArea("Area of Rectangle");
        System.out.println(result1);
        
        double result2=ob.compArea("Volume","rectangle");
        System.out.println(result2);
    }
}
