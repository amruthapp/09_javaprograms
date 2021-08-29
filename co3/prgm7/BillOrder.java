import java.util.Scanner;

interface bill
{
  public void bill_print();
}

class BillOrder implements bill
{
  int productid;
  String name;
  int quantity;
  float price;
  float total;
  
  public void bill_print()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE PRODUCT ID : ");
    productid=sc.nextInt();
    System.out.println("ENTER THE PRODUCT NAME : ");
    name=sc.next();
    System.out.println("ENTER THE QUANTITY OF PRODUCT : ");
    quantity=sc.nextInt();
    System.out.println("ENTER THE PRODUCT PRICE : ");
    price=sc.nextFloat();
    total=quantity*price;
  }
  public void display()
  {
    System.out.println("\t"+productid+"\t"+"\t"+name+"\t\t\t"+quantity+"\t\t"+price+"\t\t"+total);
  }

  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("order no :");
     int num=sc.nextInt();
     System.out.println("Date  : "+java.time.LocalDate.now());
     String date=sc.next();
     System.out.println("enter the no of products :");
     int n=sc.nextInt();
     BillOrder[] ob=new BillOrder[n];
     for(int i=0;i<n;i++)
     {
       ob[i]=new BillOrder();
     }
     for(int i=0;i<n;i++)
     {
       ob[i].bill_print();
     }
     System.out.println();
     System.out.println("Order No : "+num);
     System.out.println();
     System.out.println("Date : ");
     System.out.println();
     System.out.println("\tProduct id"+"\t"+"Name"+"\t\t"+"Quantity"+"\t"+"Unit Price"+"\t"+"Total");
     System.out.println("_____________________________________________________________________________________\n");

     for(int i=0;i<n;i++)
     {
       ob[i].display();
     }
     float Net_Amount=0;
     for(int i=0;i<n;i++)
     {
       Net_Amount=Net_Amount+ob[i].total;
     }
     System.out.println("_____________________________________________________________________________________\n");
     System.out.println("\t"+"\t"+"\t"+"\t"+"Net Amount : \t"+Net_Amount);
  }
 }
     









