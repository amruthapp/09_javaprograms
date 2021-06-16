class Box
{
 double height;
 double width;
 double depth;
}
class BoxDemo
{
 public static void main(String args[])
 {
  Box mybox=new Box();
  double vol;
  mybox.height=10;
  mybox.width=20;
  mybox.depth=15;
  vol=mybox.height*mybox.width*mybox.depth;
  System.out.println("Volume is : "+vol);
 }
}
  