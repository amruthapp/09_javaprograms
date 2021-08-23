class Cpu
{
   int price=5000;
	
   class Processor
     {
       int no_cores=2;
       String manufacturer="IBM";
       
       void Display()
       {
         System.out.println("\nProcessors : \n");
         System.out.println("    ");
         System.out.println("no. of cores : "+no_cores+"\n"+"Manufacturer : "+manufacturer);
       }
}

static class RAM
{
	String memory="6GB";
	String manufacturer="Apple";
	
	void displayRam()
	 {
	  System.out.println("\n RAM \n");
	  System.out.println("memory size :" +memory);        
	  System.out.println("Memory manufactures :"+manufacturer);
         }
}

public static void main(String args[])
{
	Cpu c=new Cpu();
	Cpu.RAM r=new Cpu.RAM();
	r.displayRam();
	Cpu.Processor p=c.new Processor();
	p.Display();
}
}	