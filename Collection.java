public class Collection
{
   public static void main(String avg[])
    {
  Collection obj=new Collection();
   System.out.println("-----natural number-----");
       obj.natural(8);
   System.out.println("-----natural reverse number-----");
       obj.natural1(9); 
    System.out.println("----- sum of natural number-----");
       obj.sumnatural(5);
    System.out.println("----- sum of even number-----");
       obj.even(7);
    System.out.println("----- sum of odd number-----");
       obj.odd(9);
    System.out.println("----- digit of number-----");
      obj.digit(243);
    System.out.println("----- first and last number-----");
       obj.num(756); 
   System.out.println("----- first and last number count value-----");
       obj.sum1(756); 
   System.out.println("----- sum of digit value-----");
       obj.total(865); 
    System.out.println("----- reverse of number-----");
       obj.reverse(586);
   }
  public void natural(int i)   // natural number from 1 to n
   {
   int n=0;
   while(n<i)
     {
     System.out.println(n);
      n++;
     }
   }  

//////////////////////////////////////////////////////////////////////



   public void natural1(int i)     // natural number reverse from n to 1
      {
       int n=0;
       while(n<i)
       {
        System.out.println(i);
         i--;
       }
      }

///////////////////////////////////////////////////////////




    public void sumnatural(int a)  // sum of natural in 1 to n
    {
     int i=1;
     int total=0;
       while(i<=a)
        {
         total=total+i;
        i++;
        }
       System.out.println("sum natural number="+total);
    }

////////////////////////////////////////////////////////////


      
public void even(int num) // sum of even number in 1 to n
       {
          int n=1;
           int sum=0;
       while(n<=num)
         {
         if(n%2==0)
           {
           sum=sum+n;
           }
         n++;
          }
         System.out.println("sum even number="+sum);
     }
   
/////////////////////////////////////////////////////////////



     
 public void odd(int num) // sum of odd number in 1 to n
       {
           int count=0;
          while(0<=num)
         {
            if(num%2!=0)
              {
               count=count+num;
              }
            num--;
         }
         System.out.println("sum odd number="+count);
     }

///////////////////////////////////////////////////////////////

   
     public void digit(int num) // count the number of digits
       {
           int digit=0;
          while(num>0)
         {
         num=num/10;
        digit++;
         }
         System.out.println("digit the number"+digit);
     } 


/////////////////////////////////////////////////////////////

                 
      public void num(int a) // first and last number
       {
          int first=0;
          int last=a%10;
          while(a>0)
          {
            first=a%10;
            a/=10;
            }  
         System.out.println("first number="+first);
         System.out.println("last number="+last);
       }


////////////////////////////////////////////////////////////////////////



      public void sum1(int i) // first and last number count value
       {
          int first=0;
          int last=i%10; 
       int count=0;
          while(i>0)
          {
            first=i%10;
            i/=10;
            }  
         count= first+last;
         System.out.println("first number="+count);
       }


////////////////////////////////////////////////////////////////////////


  public void total( int number)  //sum of digits the number
    {
        int a= number; 
        int total=0;
         while(number >0)
           {
             int  n=number%10;
             total=total+n;
             number=number /10;
           }
     System.out.println("add total number: "+total;
   }
 }


///////////////////////////////////////////////////////////////////

public void reverse( int number)
   {
     int i= number; 
     int reserved=0;
    while(number >0)
      {
      int  digit=number%10;
      reserved=reserved*10+digit;
      number /=10;
      }
     System.out.println("reverse number:  "+reserved);
    }
 }

