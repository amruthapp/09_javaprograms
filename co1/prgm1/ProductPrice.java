//1. Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of
//the class and find the product having the lowest price.



class Product
  {
	int pcode;
	String pname;
	double price;

	String lowestprice(Product p1,Product p2,Product p3)
	{
	 if(p1.price<p2.price&&p1.price<p3.price)
 	 {
 	  return p1.pname;
 	 }
	 else if(p2.price<p1.price&&p2.price<p3.price)
 	 {
 	  return p2.pname;
 	 }
	 else
 	 {
  	  return p3.pname;
  	 }
  }
	void val(int pc,String pn,double p)
	{
	 pcode=pc;
	 pname=pn;
	 price=p;
       }
}
class ProductPrice
  {
	public static void main(String args[]){
	Product p1=new Product();
	Product p2=new Product();
	Product p3=new Product();
	String lprice;
	p1.val(10,"book",500);
	p2.val(11,"book1",100);
	p3.val(13,"book2",75);
	lprice=p1.lowestprice(p1,p2,p3);
	System.out.println("The product having lowest price is "+lprice);
   }
}
