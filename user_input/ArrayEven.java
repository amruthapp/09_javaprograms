import java.util.Scanner;
public class ArrayEven
{
public static void main(String args[])
 {

   Scanner sc=new Scanner(System.in);

   int a;
   System.out.println("enter the no.of elements ");
   a=sc.nextInt();

   int arr[] = new int [10];
   System.out.println("enter the elements");
   for(int i=0;i<a;i++)
   {
     arr[i]=sc.nextInt();
   }
    System.out.println("elements at even position are...: ");  
    for (int i=0;i<a;i=i+2)
     {  
            System.out.println(arr[i]);  
     }  
   }  
}  