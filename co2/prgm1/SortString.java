import java.util.*;

class SortString
{
String s;

void getString()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string : ");
  s=sc.nextLine();
}
void sort()
{
  char CharArray[] = s.toCharArray();
  Arrays.sort(CharArray);
  System.out.println("Sorted string is : "+new String(CharArray));
}

public static void main(String args[])
{
 SortString st=new SortString();
 st.getString();
 st.sort();
}
}


 
