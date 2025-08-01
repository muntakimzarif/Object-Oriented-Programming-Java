1)
public class ProductTester{
  public static void main(String[] args) {
    System.out.println("< —--—----1—-------->");
    Product product1 = new Product();
    product1.displayInfo();
    System.out.println("< —--—----2—-------->");
    Product product2 = new Product("Laptop", 1200.00);
    product2.setQuantity(10);
    product2.displayInfo(true); 
    System.out.println("< —--—----3—-------->");
    System.out.println("Retrieved Price: $" + product2.getPrice());
    System.out.println("Retrieved Quantity: " + product2.getQuantity());
   }
}

public class Product{
  private String name;
  private double price;
  private int qt;
  public Product(){
    name = "Unknown";
    price = 0.0;
  }
  public Product(String s1, double d1){
    name = s1;
    price = d1;
  }
  public void setQuantity(int n1){
    qt = n1;
  }
  public void displayInfo(boolean b1){
    if(b1 ==true){
      System.out.println("Product Name: "+name);
      System.out.println("Price: $"+price);
      System.out.println("Quantity: "+qt);
    }
   }
  public void displayInfo(){
      System.out.println("Product Name: "+name);
      System.out.println("Price: $"+price);
  }
  public double getPrice(){
    return price;
  }
  public int getQuantity(){
    return qt;
  }
}

2)
public class PassengerTester{ 
  public static void main(String args[]){
    System.out.println("Total Passenger: "+ Passenger.no_of_passenger);
    System.out.println("Total Fare: "+ Passenger.total_fare + " TK");
    System.out.println("==========1==========");
    Passenger p1 = new Passenger("Lara", 5.6);
    p1.passengerDetails();
    System.out.println("==========2==========");
    Passenger p2 = new Passenger("Kevin", 10.0);
    p2.storeBaggageWeight(6.8);
    p2.passengerDetails();
    System.out.println("==========3==========");
    Passenger p3 = new Passenger("Robin", 2.3);
    p3.storeBaggageWeight(5.0);
    p3.passengerDetails();
    System.out.println("==========4==========");
    System.out.println("Total Passenger: "+ Passenger.no_of_passenger);
    System.out.println("Total Fare: "+ Passenger.total_fare + " TK");
  }
}

public class Passenger{
  public static int no_of_passenger;
  public static double total_fare;
  private String name;
  private double dt;
  private double wt;
  private int count;
  private double fare;
  public Passenger(String s1, double n1){
    name = s1;
    dt = n1;
    no_of_passenger++;
    total_fare += dt*20;
    fare = dt*20;
  }
  public void storeBaggageWeight(double d1){
    wt = d1;
    total_fare+=wt*10;
    fare += wt*10;
  }
  public void passengerDetails(){
    System.out.println("Name: "+name);
    System.out.println("Fare: "+fare+" Tk");
  }
}


3)
public class BookTester {
 public static void main(String[] args) {
    System.out.println("Total Books Sold: " + Book.total_books_sold);
    System.out.println("Total Revenue: "+Book.total_revenue + " TK");
    System.out.println("==========1==========");

    Book b1 = new Book("Java Programming", 10); // 10% discount
    b1.bookDetails();

    System.out.println("==========2==========");

    Book b2 = new Book("Python Programming", 15); // 15% discount
    b2.bookDetails();

    System.out.println("==========3==========");
    
    Book b3 = new Book("Data Structures", 5); // 5% discount
    b3.bookDetails();

    System.out.println("==========4==========");
    System.out.println("Total Books Sold: " + Book.total_books_sold);
    System.out.println("Total Revenue: "+Book.total_revenue + " TK");
    }
}

public class Book{
  public static int total_books_sold;
  public static double total_revenue;
  private String title;
  private double discount;
  private double price = 150;
  public Book(String s1, int n1){
    title = s1;
    discount = n1;
    total_books_sold++;
  }
  public void bookDetails(){
    price = price-(price*discount/100);
    total_revenue+=price;
    System.out.println("Title: "+title);
    System.out.println("Price after Discount: "+price);
  }
}


4)
public class CircleTester {
  public static void main(String[] args) {
    System.out.println("Total Circle: "+ Circle.count);
    Circle c1 = new Circle(4);
    System.out.println("1---------------");
    System.out.println("Total Circle: "+ Circle.count);
    System.out.println("First circle radius: " + c1.getRadius());
    System.out.println("First circle area: " + c1.area());
    System.out.println("2---------------");
    Circle c2 = new Circle(5);
    System.out.println("Total Circle: "+ Circle.count);
    System.out.println("Second circle radius: " + c2.getRadius());
    System.out.println("Second circle area: " + c2.area());
    System.out.println("3---------------"); 
  }
}

public class Circle{
  private double radius;
  public double area;
  public static int count;
  public Circle(int n1){
    radius = n1;
    count++;
  }
  public double getRadius(){
    return radius;
  }
  public double area(){
    area = 3.1416*radius*radius;
    return area;
  }
}

5)
public class Tester{
  public static void main(String args[]){
    Borrower.bookStatus();
    System.out.println("*********1*********");
    Borrower b1 = new Borrower("Nabila");
    b1.borrowBook("Pather Panchali");
    b1.borrowBook("Anandmath");
    b1.borrowerDetails();
    System.out.println("*********2*********");
    Borrower b2 = new Borrower("Sadia");
    b2.borrowBook("Anandmath");
    b2.borrowBook("Durgesh Nandini");
    b2.borrowBook("Pather Panchali");
    b2.borrowerDetails();
    System.out.println("*********3*********");
  System.out.println(Borrower.remainingBooks("Anandmath")+" copies of Anandmath is remaining.");
    System.out.println("*********4*********");
    Borrower b3 = new Borrower("Anika");
    b3.borrowBook("Anandmath");
    Borrower.bookStatus();
    System.out.println("*********5*********");
    Borrower b4 = new Borrower("Oishi");
    b4.borrowBook("Anandmath");
    b4.borrowBook("Durgesh Nandini");
    b4.borrowerDetails();
  }
}   

public class Borrower{
  public static int [] book_count = {3,3,3};
  public static String [] book_name = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  private String name;
  private String [] books = new String [4];
  private int count;
  public Borrower(String s1){
    name = s1;
  }
  public void borrowBook(String s1){
    for(int i = 0;i<book_name.length; i++){
      if(book_name[i].equals(s1)){
        if(book_count[i]>0){
            books[count++] = s1;
            book_count[i]--;
        }
        else{
          System.out.println("This book is not available");
        }
      }
    }
  }
  public static int remainingBooks(String s1){
    for(int i =0; i<book_name.length; i++){
      if(book_name[i].equals(s1)){
        return book_count[i];
      }
    }
    return 0;
  }
  public static void bookStatus(){
    System.out.println("Available books: ");
    for(int i =0; i<book_name.length;i++){
      System.out.println(book_name[i]+": "+book_count[i]);
    }
  }
  public void borrowerDetails(){
    System.out.println("Name: "+name);
    System.out.println("Books Borrowed: ");
    for(int i =0;i<count;i++){
      System.out.println(books[i]);
    }
  }
}


6)
public class CargoTester {
  public static void main(String[] args) {
    System.out.println("Cargo Capacity: "+ Cargo.capacity());
    System.out.println("1====================");
    Cargo a = new Cargo("Industrial Machinery", 4.5);
    a.details();
    System.out.println("2====================");
    a.load();
    System.out.println("3====================");
    Cargo b = new Cargo("Steel Ingot", 2.7);
    b.details();
    System.out.println("4====================");
    System.out.println("Cargo Capacity: "+ Cargo.capacity());
    System.out.println("5====================");
    b.load();
    System.out.println("Cargo Capacity: "+ Cargo.capacity());
    System.out.println("6====================");
    Cargo c = new Cargo("Tree Trunks", 3.6);
    c.load();
    System.out.println("7====================");
    c.details();
    b.details();
    System.out.println("8====================");
    Cargo d = new Cargo("Processed Goods", 1.8);
    d.load();
    System.out.println("Cargo Capacity: "+ Cargo.capacity());
    System.out.println("9====================");
    b.unload();
    System.out.println("Cargo Capacity: "+ Cargo.capacity());
    System.out.println("10====================");
    c.load();
    System.out.println("11====================");
    b.details();
    System.out.println("Cargo Capacity: "+ Cargo.capacity());
  }
}

public class Cargo{
  public static double cap = 10.0;
  private static int count = 1;
  private String contents;
  private double weight;
  private boolean status;
  private int id;
  public Cargo(String s1, double d1){
    id = count++;
    weight = d1;
    status = false;
    contents = s1;
  }
  public void load(){
    if(weight<=cap){
      status = true;
      cap-=weight;
      System.out.println("Cargo "+id+" loaded for transport");
    }
    else{
      System.out.println("Cannot load cargo, exceeds weight capacity");
    }
  }
  public void unload(){
      status = false;
      cap+=weight;
      System.out.println("Cargo "+id+" unloaded");
  }
  public static double capacity(){
    return cap;
  }
  public void details(){
    System.out.println("Cargo ID: "+id+", Contents: "+contents+", Weight: "+weight+", Loaded: "+status);
  }
}


7)
public class StudentTester {
  public static void main(String[] args) {
    Student.printDetails();
    System.out.println("--------------------");
    Student mikasa = new Student("Mikasa", 3.75);
    mikasa.individualDetail();
    System.out.println("--------------------");
    Student.printDetails();
    System.out.println("--------------------");
    Student harry = new Student("Harry", 2.5, "Charms");
    harry.individualDetail();
    System.out.println("--------------------");
    Student.printDetails();
    System.out.println("--------------------");
    Student levi = new Student("Levi", 3.33);
    levi.individualDetail();
    System.out.println("--------------------");
    Student.printDetails();
  }
}

public class Student{
  public static int total;
  public static int cse;
  public static int other;
  public int id;
  public String name;
  public double cg;
  public String dept = "CSE";
  public Student(String s1, double d1){
    name = s1;
    cg = d1;
    total++;
    cse++;
    id = total;
  }
  public Student(String s1, double d1, String s2){
    dept = s2;
    name = s1;
    cg = d1;
    total++;
    other++;
    id = total;
  }
  public static void printDetails(){
    System.out.println("Total Student(s): "+total);
    System.out.println("CSE Student(s): "+cse);
    System.out.println("Other Department Student(s): "+other);
  }
  public void individualDetail(){
    System.out.println("ID: "+id);
    System.out.println("Name: "+name);
    System.out.println("CGPA :"+cg);
    System.out.println("Department: "+dept);
  }
}

8)
public class PlayerTester{
  public static void main(String[] args) {
    System.out.println("Total number of players: " + Player.total);
    System.out.println("1------------------");
    Player p1 = new Player("Neymar", "Brazil",5);
    System.out.println(p1.player_detail());
    System.out.println("===================");
    Player.info();
    System.out.println("2------------------");
    Player p2 = new Player("Ronaldo", "Portugal", 7);
    System.out.println(p2.player_detail());
    System.out.println("===================");
    Player.info();
    System.out.println("3------------------");
    Player p3 = new Player("Messi", "Argentina", 6);
    System.out.println(p3.player_detail());
    System.out.println("===================");
    Player.info();
    System.out.println("4------------------");
    Player p4 = new Player("Mbappe", "France", 10);
    System.out.println(p4.player_detail());
    System.out.println("===================");
    Player.info();
  }
}

public class Player{
  public static int total;
  private static String [] list = new String[11];
  private String name;
  private static int count;
  private int jNum;
  private String country;
  public static int total(){
    return total;
  }
  public Player(String s1, String s2, int n1){
    total++;
    name = s1;
    jNum = n1;
    country = s2;
    list[count++] = s1;
  }
  public static void info(){
    System.out.println("Total number of players: "+total);
    System.out.print("Players enlisted so far: ");
    for(int i =0; i<count; i++){
      System.out.print(list[i]);
      if(i<count-1){
        System.out.print(", ");
      }
    }
    System.out.println();
  }
    public String player_detail(){
      return "Player Name: " + name + "\nJersey Number: " + jNum + "\nCountry: " + country;
    }
  }
  
  

