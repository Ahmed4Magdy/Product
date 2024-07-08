
package com.product;


public class Product {
    
    
    
    String name;
    int price ;
    static int count=0;
   public Product(String newname , int newprice){
        
       name=newname;
       price=newprice;
       count++;
       
       
//      System.out.println("name " + this.name);
//      System.out.println("Price"+this.price);
       
   } 
   
   public String getname(){
       return name;
       
   }
   
   public void setame(String name){
         this.name=name;
       
   } 
  
   
   public int getprice(){
       return price;
   }
    
   
  public void setprice(int price){
      
      this.price=price;
  } 
  
 public String toString() {
        return "Name: " + name + ", Price: " + price;
    }
 
 
    
    
    

    
    
    

    public static void main(String[] args) {
        
        
        
        Product p = new Product("montage", 2000);
        System.out.println(count);

         p.setame("mahmoud");
         p.setprice(10000);
        System.out.println("name "+p.getname()+ " , Price " +p.getprice());
        System.out.println("Count: " + Product.count);
        
  }
}
