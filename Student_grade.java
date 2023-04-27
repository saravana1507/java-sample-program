public class Student_grade
 {
   public static void main(String arg[])
    {
      Student_grade obj= new Student_grade();
        String letter;
       obj.grade("A+");
       obj.grade("A");
       obj.grade("B");
       obj.grade("B+");
       obj.grade("C");
       obj.grade("C+");
       obj.grade("a");
    }
   public void grade( String letter)
     {
      switch(letter)
       {
        case "A+":
          { 
            System.out.println(letter + "  =mark is 91 to 100");
            break;
          }
        case "A":
          { 
            System.out.println(letter + "  =mark is 81 to 90");
            break;
          }
        case "B+":
          { 
            System.out.println(letter + "  =mark is 71 to 80");
            break;
          }
        case "B":
          { 
            System.out.println(letter + "  =mark is 61 to 70");
            break;
          }
        case "C+":
          { 
            System.out.println(letter + "  =mark is 51 to 60");
            break;
          }
        case "C":
          { 
            System.out.println(letter + "  =mark is below 50");
            break;
          }
          default:
          {
          System.out.println(letter + "  it is not grade");  
          }
       }
    }
}
