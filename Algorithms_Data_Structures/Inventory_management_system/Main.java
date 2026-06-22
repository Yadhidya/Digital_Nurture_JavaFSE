 class Main {
  public static void main(String[] args) {
    InventoryManager manager=new InventoryManager();
    Product prod1=new Product(100,"metal", 10, 11);
    Product prod2=new Product(101,"steel", 10, 11);
    manager.addProduct(prod2);
    manager.addProduct(prod1);
    manager.displayProducts();
    manager.updateProduct(101,200, 20);
    manager.deleteProduct(100);
    manager.displayProducts();

  }
  
}
