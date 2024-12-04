class Publication {
    public String title;
    public double price;
    public int copies;
   public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }
    public void saleCopy(int quantity) {
        if (quantity <= copies) {
            copies -= quantity;
            System.out.println(quantity + " copies sold.");
        } else {
            System.out.println("Not enough copies available to sell.");
        }
    }
    public double totalSale() {
        if (copies < 0) {
          return 0 * price; 
        } 
        else {
            return copies * price; 
        }
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
}
class Book extends Publication {
    String author;
    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }
    public void orderCopies(int quantity) {
        copies += quantity;
        System.out.println(quantity + " copies of '" + title + "' ordered.");
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + ", Price: $" + price + ", Copies: " + copies;
    }
}


class Magazine extends Publication {
    String currentIssue;
    public Magazine(String title, double price, int copies, String currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }
    public void orderQty(int quantity) {
        copies += quantity;
        System.out.println(quantity + " copies of '" + title + "' ordered.");
    }
    public void receiveIssue(String issue) {
        currentIssue = issue;
        System.out.println("Received issue: " + currentIssue + " for magazine: " + title);
    }
    @Override
    public String toString() {
        return "Magazine: " + title + ", Current Issue: " + currentIssue + ", Price: $" + price + ", Copies: " + copies;
    }
}
public class PublicationDemo {
    public static void main(String[] args) {
        Book book1 = new Book("ABCD", 29.99, 100, "PQR");
        Magazine magazine1 = new Magazine("XYZ", 5.99, 50, "QWE");
        book1.orderCopies(20);
        magazine1.orderQty(30);
        book1.saleCopy(10);
        magazine1.saleCopy(5);
        double totalSale = book1.totalSale() + magazine1.totalSale();
        System.out.println("Total sales for all publications: $" + totalSale);
        System.out.println(book1);
        System.out.println(magazine1);
    }
}
