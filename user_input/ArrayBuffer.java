import java.io.BufferReader;
import java.util.scanner;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArrayBuffer
{
 public static void main(String args[])
  throws IOException
 {
   int a;
   BufferedReader reader=new BufferedReader(
       new InputStreamReader(System.in));
   System.out.println("enter the number of elements:");
   a=reader.nextInt();
   int[] array=new int[10];
   System.out.println("enter the elements of the array:");
   for(int i=0;i<a;i++)
   {
    array[i]=reader.nextInt();
   }
   System.out.println("array elements are:");
   for(int i=0;i<a;i++)
    {
     System.out.println(array[i]);
    }
  }
}

   
