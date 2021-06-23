import java.util.*;
class StringManipulation
{
 pubic static void main(String args[])
 {
  void Manipulations()
  {
    System.out.println("entera string");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextInt();
    
    System.out.println("String length : "+str.length());
    System.out.println("Character at position : "+str.charAt(3));
   }
 StringManipulation s=new StringManipulation();
 s.Manipulations();
}
}