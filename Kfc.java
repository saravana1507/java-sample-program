
public class Kfc
{
  public static void main(String args[])
  {
    Kfc object= new Kfc();
    int food_amount= object.food();
    int drinks_amount= object.drinks();
    int total_pay= object.total(food_amount,drinks_amount);
    int discounts=object.discount(total_pay);
    double gstamount=object.gst(discounts);
        object.getamount( discounts,gstamount);
  }
  public int food()
  {
    int pizza=100;
    System.out.println("pizza amount: " +pizza);
    int burger=200;
    System.out.println("burger amount: " +burger);
    int french_fry=74;
     System.out.println("french fry amount:" +french_fry);
    int food_total= pizza+burger+french_fry;
    System.out.println("total food amount = "+ food_total);
    return food_total; 
  }
  public int drinks()
    {
    int coca_cola=50;
    int pepsi=40;
    int slice=23;
    int drinks_total= coca_cola+pepsi+slice;
    System.out.println("coca_cola amount: "+coca_cola);
    System.out.println("pepsi amount: "+pepsi);
    System.out.println("slice amount: "+slice);
    System.out.println("total drinks amount =" + drinks_total);
    return drinks_total; 
    }
 public int total( int food_total, int drinks_total)
    {
    int total_amount=food_total+drinks_total;
    System.out.println("total amount= " +total_amount);
    return total_amount;
    }
    public int discount( int total_amount)
    {
     int final_amount = total_amount-50;
            System.out.println(" Discount in total amount: "+ final_amount);
    return final_amount;
    }
   public double gst( int final_amount)
   {
    double gstamt=5.2;
  double gst_amount= (final_amount*gstamt)/100;
    System.out.println("gst amount= "+gst_amount);
    return gst_amount;
  }
   public void getamount( int final_amount,double gst_amount)
    {
    double totalamnt= final_amount+gst_amount;
    System.out.println(" final pay ="+totalamnt);
    }
}
