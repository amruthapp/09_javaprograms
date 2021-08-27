import java.util.Scanner;

class Employeee
{
   int eNo;
   String eName;
   int eSalary;

   void productDetails()
         {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the employee id:");
       eNo=Integer.parseInt(sc.nextLine());
       System.out.println("enter the employee name:");
       eName=sc.nextLine();
       System.out.println("enter the employee salary:");
       eSalary=Integer.parseInt(sc.nextLine());
}
    void Display()
        {
       System.out.println("\n\t"+eNo+"\t"+eName+"\t\t"+eSalary);
        }
public static void main(String args[])
      {
      int no;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of employee:");
      int n=sc.nextInt();
      Employeee[] emp=new Employeee[n];
      for(int i=0;i<n;i++)
      emp[i]=new Employeee();
      for(int i=0;i<n;i++)
      {
        System.out.println("enter the details of"+(i+ 1)+"Employee:");
        emp[i].productDetails();
       }
       System.out.println("the employee details are:");
       for(int i=0;i<n;i++)
       emp[i].Display();
       System.out.println("enter the employee_no to search:");
       no=sc.nextInt();
       for(int i=0;i<emp.length;i++)
          {
      
           if(emp[i].eNo==no)
            {
             emp[i].Display();
            }
       }
   }

}
