import java.util.Scanner;
public class ArrayReverse
{
 public static void main(String args[])
 {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enetr the number of elements:");
  a=sc.nextInt();
  int[] array=new int[15];
  System.out.println("Enter the elements of the array:");
  for(int i=0;i<a;i++)
   {
     array[i]=sc.nextInt();
   }
  System.out.println("Array elemants are:");
  for(int i=0;i<a;i++)
   {
     System.out.println(array[i]);
   }
  System.out.println("array in reverse order :");
  for(int i=a-1;i>=0;i--)
   {
     System.out.println(array[i]);
   }
 }
}