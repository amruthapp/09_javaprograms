import java.util.*;
class Person
 {
   String name,address;
   String gender;
   int age;
   Person()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter name : ");
      name=sc.next();
      System.out.println("enter addrress : ");
      address=sc.next();
      System.out.println("enter gender : ");
      gender=sc.next();
      System.out.println("enter age : ");
      age=sc.nextInt();
    }
 }
class Employee extends Person
 {
   int empid;
   String cmpname,qualification;
   int salary;
   Employee()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter empid : ");
      empid=sc.nextInt();
      System.out.println("enter cmpname : ");
      cmpname=sc.next();
      System.out.println("enter qualification : ");
      qualification=sc.next();
      System.out.println("enter salary : ");
      salary=sc.nextInt();  
    }
 }
class Teacher extends Employee
 {
   int teachid;
   String dept,subject;
   Teacher()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the teacher id : ");
      teachid=sc.nextInt();
      System.out.println("enter the department : ");
      dept=sc.next();
      System.out.println("enter the subject : ");
      subject=sc.next();
    }
   void display()
    {
       System.out.println("name : "+super.name);
       System.out.println("address : "+super.address);
       System.out.println("gender : "+super.gender);
       System.out.println("age : "+super.age);
       System.out.println("employee id : "+super.empid);
       System.out.println("company name : "+super.cmpname);
       System.out.println("qualification : "+super.qualification);
       System.out.println("salary : "+super.salary);
       System.out.println("teacher id : "+teachid);  
       System.out.println("department : "+dept);
       System.out.println("subject : "+subject);
    }
 }
class MultiInheritance
 { 
   public static void main(String args[])
   {
     int p;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of persons : ");
     p=sc.nextInt();
     Teacher t[]=new Teacher[p];
     for(int i=0;i<p;i++)  
       {
         t[i]=new Teacher();
       }
     for(int i=0;i<p;i++)
       {
         t[i].display();
       }
    }
}