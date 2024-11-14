//Call by value and Call by reference
class swap
{
    int i=5,j=10;
    void swap1(int i,int j)
    {
        int temp=i;
        i=j;
        j=temp;
        System.out.println("Inside method : "+i+" "+j);
    }
    void swap2(swap s)
    {
        int temp=s.i;
        s.i=s.j;
        s.j=temp;
        System.out.println("Inside method : "+this.i+" "+this.j);
    }
}
 class swapping
{
    public static void main(String[] args)
    {
        swap obj1 = new swap();
        System.out.println("Call By Value \nBefore Swapping : "+obj1.i+" "+obj1.j);
        obj1.swap1(obj1.i,obj1.j); //call by value
        System.out.println("After Swapping : "+obj1.i+" "+obj1.j);

        System.out.println("\nCall by reference \nBefore Swapping : "+obj1.i+" "+obj1.j);
        obj1.swap2(obj1); //call by reference
        System.out.println("After Swapping : "+obj1.i+" "+obj1.j);
    }
}
