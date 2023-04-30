public class Prime
{
   public static void main(String avg[])
    {
   int i=1;
   int num=16;
   int count=0;
   while(i<=16)
     {
       if(num%i==0)
        {
          count++;      
        }
      i++;
     }
   if(count==2)
     {
      System.out.println(num+"  is a prime number");
     }
   else
     {
      System.out.println(num+"  is a not prime number"); 
     }
   }
}
