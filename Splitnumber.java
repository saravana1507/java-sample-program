class Splitnumber
  \\split the numbers and adding the number to swap
{
  public static void main(String args[])
   {
      Splitnumber obj=new Splitnumber();
      int last=obj.unit(70);
      int second=obj.secondunit(245);
      int third=obj.thirdunit(e675);
      int first=obj.firstnum(165);
      int total=obj. sum(last,second,third,first);
      obj.swap(total);
   }
  public int unit(int x)
   {
      int unit_digit=x%10;
      System.out.println("last number:"+unit_digit);
       return unit_digit;
    }
   public int secondunit(int x)
    {
      int  num=x%100;
      int second=num/10;
      System.out.println("last second number:"+second);
      return second;
   }
   public int thirdunit(int x)
   {
     int  number=x/100;
     int third= number%10;
     System.out.println("last third number:"+third);
     return third;
   }
   public int firstnum(int x)
   {
      int first=x/100;
      System.out.println("first number:"+first);
      return first;
   }
   public int sum(int a,int b,int c,int d)
   {
     int total=a+b+c+d;
     System.out.println("total value:"+total);
     return total;
   }
   public void swap(int x)
   { 
      int splitfirst=x/10;
      int splitlast=x%10;
      int first=splitlast;
      int second=splitfirst;
     System.out.println("swap number: "+ first + second);
   }
}
