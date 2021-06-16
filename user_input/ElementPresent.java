import java.util.Scanner;
public class ElementPresent
{
 public static void main(String args[])
 {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number of elements : ");
  a=sc.nextInt();
  int arr[]=new int[a];
  System.out.println("enter the elements");
  for(int i=0;i<a;i++)
   {
    arr[i]=sc.nextInt();
   }
  System.out.println(""); 
  System.out.println("number of elements present in array : "+arr.length);
 }
}