public class Swift
{
    public static void main(String args[])
    {
    Swift number= new Swift();
     number.num();
    }
  public void num()
    {
    int first= 5;
    int second=7;
    int temp;
    System.out.println("input");
    System.out.println("_____");
    System.out.println("first  value"+first);
    System.out.println("second value" +second);
     temp=first;
    first=second;
    System.out.println("output");
    System.out.println("_____");
    System.out.println("first value" +first);
    System.out.println("second value"+temp);
   
    }
}

