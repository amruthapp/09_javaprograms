import java.util.Scanner;
public class ArrayOdd
{
 public static void main(String args[])
 {
   int a;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the no.of elements ");
   a=sc.nextInt();
   int [] arr = new int [10];
   System.out.println("enter the elements");
   for(int i=0;i<a;i++)
   {
     arr[i]=sc.nextInt();
   }
    System.out.println("the elements at odd position are : ");  
    for (int i = 1; i < a; i = i+2)
     {  
            System.out.println(arr[i]);  
     }  
   }  
}  