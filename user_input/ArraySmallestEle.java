import java.util.Scanner;
public class ArraySmallestEle
{
 public static void main(String args[])
 {
  int min,a;
  int arr []=new int[50];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the aray size :");
  a=sc.nextInt();
  
  System.out.println("enter the elements :");
  for(int i=0;i<a;i++)
   {
     arr[i]=sc.nextInt();
   }
   
    min=arr[0];
  for(int i=0;i<a;i++)
   {
    if(arr[i]<min)
     {
      min=arr[i];
     }
   }
    System.out.println("smallest element in array :"+min);
}
}