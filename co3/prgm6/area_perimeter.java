import java.util.Scanner;

interface prototype
{
  public void area();
  public void perimeter();
}
class Circle implements prototype
{
  int r;
  float area;
  float perimeter;

  public void area()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius : ");
    r=sc.nextInt();
    area=3.14f*r*r;
    System.out.println("The area of circle is : "+area);
  }
  public void perimeter()
  {
    perimeter=2*3.14f*r;
    System.out.println("The perimeter of circle is : "+perimeter);
  }
}

class Rectangle implements prototype
{
  int l,b;
  float area;
  float perimeter;
  
  public void area()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length : ");
    l=sc.nextInt();
    System.out.println("Enter the breadth : ");
    b=sc.nextInt();
    area=l*b;
    System.out.println("The area of rectangle is : "+area);
  }

  public void perimeter()
  {
    perimeter=2*(l+b);
    System.out.println("The perimeter of the rectangle is : "+perimeter);
  }
}

class area_perimeter
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\n---------MENU---------\n");
    System.out.println("\t 1.CIRCLE \n\t 2.RECTANGLE");
    System.out.println("ENTER YOUR CHOICE");
   
    int ch=sc.nextInt();
    switch(ch)
    {
      case 1:
            prototype ob=new Circle();
            ob.area();
            ob.perimeter(); 
            break;
      case 2:
            prototype obj=new Rectangle();
            obj.area();
            obj.perimeter(); 
            break;
      default:System.out.println("Enter valid choice  ");
              break;
    }
  }
}
