public class Collection1
{
   public static void main(String avg[])
    {
  Collection1 obj=new Collection1();

  System.out.println("-----palindrome number-----");
       obj.poly(121);
       obj.poly(123);
   System.out.println("-----the factor of numbers-----");
       obj.div(12);
  System.out.println("-----prime number-----");
       obj.num(17);
  System.out.println("-----reverse prime number-----");
       obj.num1(715);
  System.out.println("-----sum the prime number-----");
       obj.num2(716);
   }
 

////////////////////////////////////////////////////////////////



 public void poly( int number)  // palindrome number 
   {
     int i= number; 
     int reverse=0;
    while(number >0)
      {
      int  digit=number%10;
      reverse=reverse*10+digit;
      number /=10;
      } 
   if(i==reverse)
     {
     System.out.println(reverse+"= is a polindrome number");
      } 
     else 
       {
       System.out.println(reverse+"= is a not polindrome number");
       }
    }

//////////////////////////////////////////////////////////////////////////////



    public void div(int a)     // number to divided by any number
    {
     int n=1;
     while(a>=n)
     {
     if(a%n==0) 
     {
      System.out.println(n);
     }
     n++;
     }
   }


//////////////////////////////////////////////////////////////////////////////

 

 public void num(int i) // prime number
  {
   int a=i;
   int num=1;
   int count=0;
   while(i>=num)
     {
       if(a%num==0)
        {
          count++;      
        }
      num++;
     }
   if(count==2)
     {
      System.out.println(a+"  is a prime number");
     }
   else
     {
      System.out.println(a+"  is a not prime number"); 
     }
   }

//////////////////////////////////////////////////////////////////////


   public void num1(int i) // reverse the number then prime number
  {
   int a=i;
    int reserved=0;
   int num=1;
   int count=0;
    while(i>0)
      {
      int  digit=i%10;
       reserved=reserved*10+digit;
      i/=10;
      }
   while(reserved>=num)
     {
       if(reserved%num==0)
        {
          count++;      
        }
      num++;
     }
   if(count==2)
     {
      System.out.println(a+"  is a prime number");
     }
   else
     {
      System.out.println(a+"  is a not prime number"); 
     }
   }


////////////////////////////////////////////////////////////////////


  public void num2(int i) // sum the number then prime number
  {
   int a=i;
    int reserved=0;
   int num=1;
   int count=0;
    while(i>0)
      {
      int  digit=i%10;
       reserved=reserved+digit;
      i/=10;
      }
   while(reserved>=num)
     {
       if(reserved%num==0)
        {
          count++;      
        }
      num++;
     }
   if(count==2)
     {
      System.out.println(a+"  is a prime number");
     }
   else
     {
      System.out.println(a+"  is a not prime number"); 
     }
   }

 }

