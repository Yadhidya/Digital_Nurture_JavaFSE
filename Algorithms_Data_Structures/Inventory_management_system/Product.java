public class Product{
  private int productId;
  private String productName;
  private int quantity;
    private double price;
  
  Product(int productId,String productName,int quantity,int price)
  {
    this.productId=productId;
    this.productName=productName;
    this.quantity=quantity;
    this.price=price;
  }

  public void setProductId(int id)
  {
    this.productId=id;
  }

   public void setProductName(String productName)
  {
    this.productName=productName;
  }
   public void setquantity(int quantity)
  {
    this.quantity=quantity;
  }
   public void setprice(double price)
  {
    this.price=price;
  }

  public int getProductId()
  {
    return this.productId;
  }

  public String getProductName()
  {
    return this.productName;
  }
  public int getquantity()
  {
    return this.quantity;
  }
  public double getprice()
  {
    return this.price;
  }

  @Override
  public String toString(){
     return "Product ID: " + productId +
                ", Name: " + productName +
                ", Quantity: " + quantity +
                ", Price: ₹" + price;
  }

}