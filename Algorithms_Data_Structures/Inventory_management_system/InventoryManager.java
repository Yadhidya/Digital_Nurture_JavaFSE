import java.util.Map;
import java.util.HashMap;

public class InventoryManager {
  Map<Integer,Product> map;

  public InventoryManager()
  {
    map=new HashMap<>();
  }

  public void addProduct(Product product)
  {
    map.put(product.getProductId(),product);
    System.out.println("Product added successfully");
  }

  public void updateProduct(int productId,int quantity,double price)
  {
    if(!map.containsKey(productId))
      return ;
    Product product=map.get(productId);
    product.setprice(price);
    product.setquantity(quantity);
    System.out.println("Product is updated successfully");
  }

  public void deleteProduct(int productId)
  {
    if(!map.containsKey(productId))
    {
      System.out.println("Product not found");
    }
    else
    {
      map.remove(productId);
      System.out.println("Product removed successfully");
    }
  }

  public void displayProducts(){
    for(Map.Entry<Integer,Product> ent:map.entrySet())
    {
      System.out.println(ent.getValue());
    }
  }

}
