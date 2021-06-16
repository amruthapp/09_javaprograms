import java.util.Scanner;
public class ArrayLargestEle
{
 public static void main(String args[])
 {
  int max,a;
  int arr []=new int[50];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the aray size :");
  a=sc.nextInt();
  
  System.out.println("enter the elements :");
  for(int i=0;i<a;i++)
   {
     arr[i]=sc.nextInt();
   }
   
    max=arr[0];
  for(int i=0;i<a;i++)
   {
    if(arr[i]>max)
     {
      max=arr[i];
     }
   }
    System.out.println("largest element in array :"+max);
}
}