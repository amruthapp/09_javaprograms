class Area
 {
   int length,breadth,radius;
   float pi=3.14f;
   void area(int length,int breadth)
    {
      System.out.println("area of rectangle is : "+(length*breadth));
    }
   void area(int radius)
    {
      System.out.println("area of circle is : "+(pi*radius*radius));
    }
   
 }
class Overloaded
 {
   public static void main(String args[])
    {
      Area a=new Area();
      a.area(3,4);
      a.area(5);
    }
}