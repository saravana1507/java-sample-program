public class Reverse
{
  public static void main(String arg[])
   {
     int number=-8795; 
     int reserved=0;
    System.out.println("original num: "+number);
    while(number !=0)
      {
      int  digit=number%10;
       reserved=reserved*10+digit;
      number /=10;
      }
     System.out.println("reverse number:  "+reserved);
   }
}
