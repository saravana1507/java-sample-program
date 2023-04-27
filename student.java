import java.util.Scanner;
public class student
{
   public static void main(String arg[])
   {
   Scanner scan= new Scanner(System.in);
   System.out.println("what is your name:");
   String name= scan.nextLine();
   System.out.println(" what is your rating:");
   int rating=scan.nextInt();
   System.out.println("enter the email");
   String email=scan.nextLine();
System.out.println("hello"+name);
System.out.println("your rating"+ rating);
System.out.println("your email:"+email);
  }
}
