public  class Neon  ////// given number to neon or not
 {
   public static void main(String arg[])
    {
     Neon obj= new Neon();
      obj.number(9);
     obj.number(24);
    }
  public void number(int a)
    {
       int i=a;
      int b=a*a;
     int total=0;
      while(b>0)
       {
        int digit=b%10;
        total=total+digit;
        b/=10;
      }
   if(i==total)
       {
       System.out.println(i+"=is a neon number");
      }
   else
       {
       System.out.println(i+"=is a not neon number");
      }
   }
}
