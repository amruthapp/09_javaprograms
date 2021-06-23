import java.util.Scanner;

class AddMatrix
{
 public static void main(String args[])
 {
  int row,col;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the no.of rows");
  row=sc.nextInt();

  System.out.println("enter the no.of cols");
  col=sc.nextInt();
  
  int matrix1[][] = new int[row][col];
  int matrix2[][] = new int[row][col];
  int result[][] = new int[row][col];  
  
  System.out.println("enter the elements of first matrix : \n");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    matrix1[i][j]=sc.nextInt();
    System.out.println();
   }
   }

   System.out.println("enter the elements of second matrix : \n");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
    matrix2[i][j]=sc.nextInt();

    System.out.println();
  }
   for(int i=0;i<row;i++)
   for(int j=0;j<col;j++)

      result[i][j]=matrix1[i][j]+matrix2[i][j];

      System.out.println("addition of 2 matrices");
    
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)

       System.out.println(result[i][j]+"\t");

      System.out.println();
    }
}
}