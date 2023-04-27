import java.util.Scanner;
public class Split
// any two to four digit number to  split and add number then swap the number
{
public static void main(String arg[])
    {
     Split obj=new Split();
      Scanner scan= new Scanner(System.in);
       System.out.println("enter the number:");
        int x = scan.nextInt();
          obj.swap(obj.unit(x));
    
    }
   public int unit(int x)  //split and add number
    {  
            int first=x/1000;
           int second=(x%100)/10;
          int third=(x/100)%10;
         int last=x%10;
        int sum=first+second+third+last;
       System.out.println("count number:"+ sum);
         return sum;      
     }
    public void swap(int x) // swap number
     { 
        int first=x/10;
           int last=x%10;
             System.out.println("swap number: "+ last+first);

      }
   }

