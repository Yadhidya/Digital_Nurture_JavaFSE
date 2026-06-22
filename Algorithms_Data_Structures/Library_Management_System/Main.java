package Library_Management_System;

public class Main {
  public static void main(String[] args) {
    Book[] books=new Book[10];
    books[0] = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald");
books[1] = new Book(102, "To Kill a Mockingbird", "Harper Lee");
books[2] = new Book(103, "1984", "George Orwell");
books[3] = new Book(104, "Pride and Prejudice", "Jane Austen");
books[4] = new Book(105, "The Hobbit", "J.R.R. Tolkien");
books[5] = new Book(106, "Moby Dick", "Herman Melville");
books[6] = new Book(107, "War and Peace", "Leo Tolstoy");
books[7] = new Book(108, "The Catcher in the Rye", "J.D. Salinger");
books[8] = new Book(109, "Brave New World", "Aldous Huxley");
books[9] = new Book(110, "The Odyssey", "Homer");
boolean linear=liner_search(books, 103);
if(linear)
  System.out.println("Found using linear search");
else
  System.out.println("Not found");
boolean binary_se=binary_search(books, 108);
if(binary_se)
  System.out.println("Found using binary search");
else
  System.out.println("Not found");
  }

  static boolean liner_search(Book[] products,int target)
  {
    for(Book product:products)
    {
      if(product.getBookId()==target)
        return true;
    }
    return false;
  }

  static boolean binary_search(Book[] products,int target)
  {
    int start=0,end=products.length-1;
    while(start<=end)
    {
      int mid=(start+end)/2;
      if(products[mid].getBookId()==target)
        return true;
      if(products[mid].getBookId()>target)
        end=mid-1;
      else
        start=mid+1;
    }
    return false;
  }
}
