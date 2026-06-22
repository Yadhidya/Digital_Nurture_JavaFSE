
public class Main {
  public static void main(String[] args) {
    Product[] products=new Product[10];
    products[0]=new Product(101,"prod1","books");
    products[1]=new Product(102,"prod2","books");
    products[2] = new Product(103, "prod3", "electronics");
products[3] = new Product(104, "prod4", "electronics");
products[4] = new Product(105, "prod5", "clothing");
products[5] = new Product(106, "prod6", "clothing");
products[6] = new Product(107, "prod7", "home");
products[7] = new Product(108, "prod8", "home");
products[8] = new Product(109, "prod9", "sports");
products[9] = new Product(110, "prod10", "sports");
boolean linear=liner_search(products, 103);
if(linear)
  System.out.println("Found using linear search");
else
  System.out.println("Not found");
boolean binary_se=binary_search(products, 108);
if(binary_se)
  System.out.println("Found using binary search");
else
  System.out.println("Not found");
  }

  static boolean liner_search(Product[] products,int target)
  {
    for(Product product:products)
    {
      if(product.getProductId()==target)
        return true;
    }
    return false;
  }

  static boolean binary_search(Product[] products,int target)
  {
    int start=0,end=products.length-1;
    while(start<=end)
    {
      int mid=(start+end)/2;
      if(products[mid].getProductId()==target)
        return true;
      if(products[mid].getProductId()>target)
        end=mid-1;
      else
        start=mid+1;
    }
    return false;
  }

}

 class Product{
  private int productId;
  private String productName;
  private String category;
  
  public Product(int productId,String productName,String category)
  {
    this.productId=productId;
    this.productName=productName;
    this.category=category;
  }

  public void setProductId(int id)
  {
    this.productId=id;
  }

   public void setProductName(String productName)
  {
    this.productName=productName;
  }
   public void setquantity(String category)
  {
    this.category=category;
  }

  public int getProductId()
  {
    return this.productId;
  }

  public String getProductName()
  {
    return this.productName;
  }
  public String getcategory()
  {
    return this.category;
  }

  @Override
  public String toString(){
     return "Product ID: " + productId +
                ", Name: " + productName +
                ", Category" + category;
  }

}