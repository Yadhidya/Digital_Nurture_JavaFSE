package Sorting_Customer_Orders;
public class Main {
  public static void main(String[] args) {
    Order[] orders=new Order[10];
    orders[0]=new Order(101,"yadhidya" ,100);
    orders[1] = new Order(102, "arjun", 250);
    orders[2] = new Order(103, "priya", 450);
    orders[3] = new Order(104, "rahul", 120);
    orders[4] = new Order(105, "sneha", 890);
    orders[5] = new Order(106, "vikram", 310);
    orders[6] = new Order(107, "ananya", 150);
    orders[7] = new Order(108, "rohit", 620);
    orders[8] = new Order(109, "divya", 75);
    orders[9] = new Order(110, "karan", 540);
    quicksort(orders,0,orders.length-1);
    for(Order order:orders)
      System.out.println(order);
  }
  static void bubblesort(Order[] orders)
  {
    for(int i=0;i<orders.length;i++)
    {
      for(int j=0;j<orders.length-i-1;j++)
      {
        if(orders[j].totalprice()>orders[j+1].totalprice())
        {
          Order temp=orders[j];
          orders[j]=orders[j+1];
          orders[j+1]=temp;
        }
      }
    }
  }

  static void quicksort(Order[] orders,int start,int end)
  {
    if(start>end)
      return ;
    int s=start,e=end;
    int pivot=start;
    while(start<=end)
    {
      while(start<=e && orders[pivot].totalprice>=orders[start].totalprice)
        start++;
      while(end>=start && orders[pivot].totalprice<orders[end].totalprice)
        end--;
      if(start<=end)
      {
        Order temp=orders[start];
          orders[start]=orders[end];
          orders[end]=temp;
          start++;
          end--;
      }
    }
    Order temp=orders[end];
          orders[end]=orders[pivot];
          orders[pivot]=temp;
          
    //   for(Order order:orders)
      //System.out.println(order);
          quicksort(orders, s, end-1);
          quicksort(orders, end+1, e);
  }
}
class Order {
  int orderId;
  String customerName;
  int totalprice;
  public Order(int orderId,String customerName,int totalprice)
  {
    this.orderId=orderId;
    this.customerName=customerName;
    this.totalprice=totalprice;
  }

  public int getOrderId(){
    return this.orderId;
  }

  public String getcustomerName(){
    return this.customerName;
  }

  public int totalprice(){
    return this.totalprice;
  }
  
  @Override
  public String toString(){
     return "Product ID: " + orderId +
                ", Name: " + customerName +
                ", Price : " + totalprice;
  }
}
