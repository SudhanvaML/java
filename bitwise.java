//Bitwise Operator
class bitwise
{
    public static void main(String []args)
    {
        int a=1;
        int b=4;
        int c=-2;
        System.out.println("Bitwise AND operator :" +(a&b));
        System.out.println("Bitwise OR operator :" +(a|b));
        System.out.println("Bitwise NOT operator :" +(~b));
        System.out.println("Bitwise LEFT SHIFT operator :" + (2<<a));
        System.out.println("Bitwise RIGHT SHIFT operator :" +(b>>1));
        System.out.println("Bitwise >> signed shift operator :"+(c>>1));
        b=9;
        System.out.println("Bitwise >>> operator :" + (b>>>1));
    }
}