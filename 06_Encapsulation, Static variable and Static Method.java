1)

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
  
  
