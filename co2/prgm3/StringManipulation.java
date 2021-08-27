import java.util.*;
class StringManipulation
{

  void Manipulations()
  {
    System.out.println("entera string");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    
    System.out.println("String length : "+str.length());
    System.out.println("Character at position : "+str.charAt(3));
    
   }
 public static void main(String args[])
 {
 StringManipulation s=new StringManipulation();
 s.Manipulations();
}
}
