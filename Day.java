import java.util.Scanner;

public class Day
{
public static void main(String arg[])
  {
    Day obj= new Day();
    Scanner scan= new Scanner(System.in);
  System.out.println("enter the number:");
     int n= scan.nextInt();
      obj.number(n);
  }
  public void number(int n)
    {
   switch(n)
   { 
     case 1:  
      {
          System.out.println(n+" "+"sunday");
           break;
      }
      case 2:
      {
           System.out.println(n+" "+"monday");
           break;
      }
     case 3:
      {
           System.out.println(n+" "+"tuesday");
           break;
      }
     case 4:
      {
           System.out.println(n+" "+"wednesday");
           break;
      }
      case 5:
      {
           System.out.println(n+" "+"thursday");
           break;
      }
      case 6:
      {
           System.out.println(n+" "+"friday");
           break;
      }
      case 7:
      {
           System.out.println(n+" "+"saturday");
           break;
      }
      default:   
       { 
       System.out.println(n+" "+"check the number");
       } 
     }
   }
}
