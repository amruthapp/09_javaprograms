import java.util.Scanner;

interface Student
{
   void academic_data(String name,int reg,float m1,float m2,float percent);
}
interface Sports
{
   void Score(String item,int rank);
}

class Result implements Student,Sports
{
   String name;
   int reg;
   float m1,m2;
   float percent;
   String item;
   int rank;
   
   public void academic_data(String name,int reg,float m1,float m2,float percent)
   {
     this.name=name;
     this.reg=reg;
     this.m1=m1;
     this.m2=m2;
     this.percent=percent;
   }
   
   public void Score(String item,int rank)
   {
     this.item=item;
     this.rank=rank;
   }
   
   void display()
   {
     System.out.println("-----ACADEMIC INFORMATION-----");
     System.out.println("   \n  ");
     System.out.println("NAME : "+name);
     System.out.println("REGISTER NUMBER : "+reg);
     System.out.println("MARK IN SUBJECT 1 : "+m1);
     System.out.println("MARK IN SUBJECT 2 : "+m2);
     System.out.println("ACADEMIC PERCENTAGE : "+percent);
     System.out.println("   \n  ");
     System.out.println("-----SPORTS INFORMATION-----");
     System.out.println("SPORTS ITEM : "+item);
     System.out.println("RANK : "+rank);
   }
}

class Student_Info
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE STUDENT NAME : ");
     String name=sc.next();
     System.out.println("ENTER THE REGISTER No. : ");
     int reg=sc.nextInt();
     System.out.println("ENTER THE MARK IN SUBJECT 1 : ");
     float m1=sc.nextFloat();
     System.out.println("ENTER THE MARK IN SUBJECT 2 : ");
     float m2=sc.nextFloat();
     float percent=((m1+m2)/500)*100f;
     
     System.out.println("ENTER THE SPORTS ITEM : ");
     String item=sc.next();
     System.out.println("ENTER THE RANK : ");
     int rank=sc.nextInt();
     
     Result R=new Result();
     R.academic_data(name,reg,m1,m2,percent);
     R.Score(item,rank);
     R.display();
  }
}

     