//5. Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)
//and static nested class RAM (memory, manufacturer). Create an object of CPU and print
//information of Processor and RAM.



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
