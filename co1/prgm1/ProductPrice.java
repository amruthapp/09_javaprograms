class Product
{
  int pcode;
  String pname;
  double price;
  
  String LowPrice(Product p1,Product p2,Product p3);
  {
    if(p1.price<p2.price && p1.price<p3.price)
     {
       return p1.name;
     }
    else if(p2.price<p1.price && p2.price<p3.price)
     {
      return p2.price;
     }
    else
     {
       return p3.price;
     }
   }

  void definition(int pc,String pn,double pr)
  {
   pcode=pc;
   pname=pn;
   price=pr;
  }
}

class ProductPrice
{
 public static void main(String args[])
 {
  Product p1=new Product();
  Product p2=new Product();
  Product p3=new Product();
  String lprice;
  p1.definition(1,"book1",250);
  p2.definition(2,"book2",300);
  p3.definition(3,"book3",400);
  lprice=p1.LowPrice(p1,p2,p3);
  System.out.println("Product having low price"+lprice);
 }
}
