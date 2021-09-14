import java.util.Scanner;

class LoginUsername extends Exception 
{
  public LoginUsername(String s)
  {
    super(s);
  }
}

class LoginPassword extends Exception
{
  public LoginPassword(String s)
  {
    super(s);
  }
}

class Login extends Exception
{
  public static void main(String args[])
  {
    try
    {
      String username,pswd;
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the username : ");
      username=sc.nextLine();
      System.out.println("Enter pasword : ");
      pswd=sc.nextLine();
      
      if(!username.equals("Amrutha"))
	throw new LoginUsername(" Incorrect Username ");
      else if(!pswd.equals("1234"))
	throw new LoginPassword(" Incorrect Password ");
      else
	System.out.println("\n\t Login successful....");
     }
     catch(LoginUsername e)
     {
	System.out.println(e);
     }
     catch(LoginPassword e)
     {
	System.out.println(e);
     }
     finally
     {
	System.out.println("\n Program ends....");
     }
  }
}     