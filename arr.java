 class arr
 {
     public static void main(String[] args)
     {
         int i,sum=0,sum1=0;
         int a[]={1,2,3,4,5,6,7,8,9};
         for(i=0;i<5;i++)
         {
             sum=sum+a[i];
         }
         System.out.println("The For sum is : "+sum);
         for(int value:a)
         {
             if(value==6)
                 break;
             sum1=sum1+value;
         }
         System.out.println("The Foreach sum is : "+sum1);
     }
 }
