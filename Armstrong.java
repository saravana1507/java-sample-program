public  class Armstrong   // given number armsrong or not
 {
   public static void main(String arg[])
    {
     Armstrong obj= new Armstrong();
      obj.number(9);
     obj.number(153);
    }
  public void number(int a)
    {
    int i=a;
   int total=0;
  while(a>0)
   {
   int digit=a%10;
    int qube= digit*digit*digit;
       total=total+qube;
     a/=10;
    }
   if(i==total)
       {
       System.out.println(i+"=is a armstrong number");
      }
   else
       {
       System.out.println(i+"=is a not armstrong number");
      }
   }
}
