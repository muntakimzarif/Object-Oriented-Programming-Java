1)

public class BankAccount{
  public int accNo = 0;
  public String type = "Not Set";
  public void setInfo(int n1, String s1){
    this.accNo = n1;
    this.type = s1;
    System.out.println("Account information updated!");
  }
  public String printDetails(){
    return "Account No: "+accNo+"\nType: "+type;
  }
}

public class BankAccountTester{
  public static void main(String args[]){
     BankAccount acc1 = new BankAccount();
     System.out.println(acc1.printDetails());
     System.out.println("-----1-----");
     acc1.setInfo(1456890,"Salary");
     System.out.println("-----2-----");
     System.out.println(acc1.printDetails());
     System.out.println("-----3-----");
     BankAccount acc2  = new BankAccount();
     acc2.setInfo(1765498,"Student");
     System.out.println("-----4-----");
     System.out.println(acc2.printDetails());
  }
}


2)
public class ShapeTester{
  public static void main(String args []){
    Shape circle = new Shape();
    Shape triangle = new Shape();
    Shape rectangle = new Shape();
    
    circle.setParameters("Circle", 5);
    triangle.setParameters("Triangle", 4, 7);
    rectangle.setParameters("Rectangle", 2.4, 4.4);
    
    System.out.println(circle.details());
    System.out.println("1---------------");
    System.out.println(triangle.details());
    System.out.println("2---------------");
    System.out.println(rectangle.details());  
  }
}

public class Shape{
  public String name;
  public double area;
  public void setParameters(String s1, int n1){
    this.name = s1;
    if(s1.equals ( "Circle")){
      area = 3.1416*n1*n1;
    }
  }
  public void setParameters(String s1, int n1, int n2){
    this.name = s1;
    if(s1.equals ("Triangle")){
      area = 0.5*n1*n2;
    }
  }
  public void setParameters(String s1, double d1, double d2){
    this.name = s1;
    if(s1.equals ("Rectangle")){
      area = d1*d2;
    }
  }
  public String details(){
    return "Shape Name: "+name+"\nArea: "+area;
  }
}


3)
public class ShelfTester{
  public static void main(String [] args){
    Shelf shelf = new Shelf();
    shelf.showDetails();
    System.out.println("1---------------");
    shelf.addBooks(3);
    System.out.println("2---------------");
    shelf.capacity = 7;
    shelf.addBooks(3);
    System.out.println("3---------------");
    shelf.showDetails();
    System.out.println("4---------------");
    shelf.addBooks(5);
    shelf.showDetails();
    shelf.capacity += 4;
    System.out.println("6---------------");
    shelf.addBooks(5);
    shelf.showDetails();
  }
}

public class Shelf{
  public int capacity = 0;
  public int nBooks = 0;
  public void addBooks(int n1){
    if(capacity==0){
      System.out.println("Zero capacity. Cannot add books");
    }
    else if(capacity<nBooks+n1){
      System.out.println("Exceeds capacity");
    }
    else{
      System.out.println(n1+" books added to shelf");
      nBooks+=n1;
    }
  }
  public void showDetails(){
    System.out.println("Shelf capacity: "+ capacity);
    System.out.println("Number of books: "+ nBooks);
  }
}


4)
public class StudentTester{
  public static void main(String[] args) {
    Student std1 = new Student();
    std1.showDetails();
    System.out.println("1---------------");
    std1.updateDetails("Alif", 3.99, 12);
    System.out.println("2---------------");
    std1.checkScholarshipEligibility();
    System.out.println("3---------------");
    std1.showDetails();
    Student std2 = new Student();
    std2.updateDetails("Mim", 3.4);
    Student std3 = new Student();
    std3.updateDetails("Henry", 3.5, 15, "BBA");
    System.out.println("5---------------");
    std2.checkScholarshipEligibility();
    System.out.println("6---------------");
    std3.checkScholarshipEligibility();
    System.out.println("7---------------");
    std2.showDetails();
    System.out.println("8---------------");
    std3.showDetails();
  }
}


public class Student{
  public String name = "Not Set";
  public String dept = "CSE";
  public double cg = 0.0;
  public int cred = 9;
  public String ss = "Not Set";
  public void updateDetails(String s1, double d1, int n1){
    this.name = s1;
    this.cg = d1;
    this.cred = n1;
  }
  public void updateDetails(String s1, double d1){
    this.name = s1;
    this.cg = d1;
  }
  public void updateDetails(String s1, double d1, int n1, String s2){
    this.name = s1;
    this.cg = d1;
    this.cred = n1;
    this.dept = s2;
  }
  public void checkScholarshipEligibility(){
    if(cg>=3.7){
      ss = "Merit based scholarship";
      System.out.println(name+" is eligible for Merit based Scholarship");
    }
    else if(cg>=3.5 && cg<3.7){
      ss = "Need - based scholarship";
      System.out.println(name+" is eligible for Need-based Scholarship");
    }
    else if(cg>=3.5 && cred>10){
      ss = "eligible for scholarship";
      System.out.println(name+" is eligible for Scholarship");
    }
    else{
      ss = "No scholarship";
      System.out.println(name+" is not eligible for scholarship ");
    }
  }
  public void showDetails(){
    System.out.println("Name :"+name);
    System.out.println("Department :"+dept);
    System.out.println("CGPA: "+cg);
    System.out.println("Credits: "+cred);
    System.out.println("Scholarship status: "+ss);
  }
}

5)
public class Tester5{
  public static void main(String[] args) {
    Library a1 = new Library();
    a1.setBookCapacity(3);
    System.out.println("1-------------");
    a1.addBook("Ice");
    System.out.println("2-------------");
    a1.printDetail();
    System.out.println("3-------------");
    a1.addBook("Emma");
    a1.addBook("Wings");
    a1.addBook("Next");
    System.out.println("4-------------");
    a1.printDetail();
    Library a2 = new Library();
    a2.setBookCapacity(4);
    System.out.println("5-------------");
    a2.addBook("Onnobhubon");
    a2.addBook("Ami");
    System.out.println("6-------------");
    a2.printDetail();
    System.out.println("7-------------");
    a2.addBook("Deyal");
    a2.addBook("Himu");
    a2.addBook("Megher Upor Bari");
    System.out.println("8-------------");
    a2.printDetail();
  }
}

public class Library{
  public int capacity = 0;
  public int tBooks = 0;
  public String [] bList;
  public void setBookCapacity(int n1){
    this.capacity = n1;
    bList = new String[capacity];
  }
  public void addBook(String s1){
    if(tBooks<capacity){
      bList[tBooks] = s1;
      tBooks++;
      System.out.println("Book "+s1+" added to the Library");
    }
    else{
      System.out.println("Exceeds maximum capacity. You can't add more than "+capacity+" books");
    }
  }
  public void printDetail(){
    System.out.println("Maximum Capacity: "+capacity);
    System.out.println("Total Books: "+tBooks);
    System.out.println("Book List: ");
    for(int i = 0;i<tBooks;i++){
      System.out.println(bList[i]);
    }
  }
}

 
6)
public class TaxiTester{
 public static void main(String[] args) {
   TaxiLagbe taxi1 = new TaxiLagbe();
   taxi1.storeInfo("1010-01", "Dhaka");
   System.out.println("1-------------");
   taxi1.printDetails();
   System.out.println("2-------------");
   taxi1.addPassenger("Wilson", 105);
   System.out.println("3-------------");
   taxi1.printDetails();
   System.out.println("4-------------");
   taxi1.addPassenger("Walker", 100, "Wood", 200);
   System.out.println("5-------------");
   taxi1.printDetails();
   System.out.println("6-------------");
   taxi1.addPassenger("Karen", 200);
   taxi1.addPassenger("Donald", 130);
   System.out.println("7-------------");
   taxi1.printDetails();
   System.out.println("8-------------");
   TaxiLagbe taxi2 = new TaxiLagbe();
   taxi2.storeInfo("1010-02", "Khulna");
   taxi2.addPassenger("Don", 115, "Parker", 215);
   System.out.println("9-------------");
   taxi2.printDetails();
 }
}

public class TaxiLagbe{
  public String tNumber;
  public String area;
  public int passenger = 0;
  public String[] pList = new String[4];
  public int collectedFare;
  public void storeInfo(String s1, String s2){
    this.tNumber = s1;
    this.area = s2;
  }
  public void addPassenger(String s1, int s2){
    if(passenger<4){
      pList[passenger] = s1;
      passenger++;
      collectedFare+=s2;
      System.out.println("Dear "+s1+"! Welcome to TaxiLagbe");
    }
    else{
      System.out.println("Taxi Full! No more passenger can be added");
    }
  }
  public void addPassenger(String s1, int s2, String s3,int s4){
    if(passenger+2<=4){
      pList[passenger] = s1;
      passenger++;
      collectedFare+=s2;
      System.out.println("Dear "+s1+"! Welcome to TaxiLagbe");
      pList[passenger] = s3;
      passenger++;
      collectedFare+=s4;
      System.out.println("Dear "+s3+"! Welcome to TaxiLagbe");
    }
    else{
      System.out.println("Taxi Full! No more passenger can be added");
    }    
  }
  public void printDetails(){
    System.out.println("Taxi number: "+tNumber);
    System.out.println("This taxi can cover "+area+" area");
    System.out.println("Total Passenger: "+passenger);
    System.out.println("Passenger Lists:");
    for(int i =0;i<passenger;i++){
      System.out.print(pList[i]+ " ");
    }
    System.out.println();
    System.out.println("Total collected fare: "+collectedFare+" Taka");
  }


7)
public class CartTester{
  public static void main(String [] args){
    Cart c1 = new Cart (); 
    Cart c2 = new Cart ();
    Cart c3 = new Cart ();
    
    c1.create_cart(1);
    c2.create_cart(2);
    c3.create_cart(3);
    System.out.println("====1====");
    c1.addItem("Table", 3900.5);
    c1.addItem("Chair", 1400.76);
    c1.addItem(5400.87, "Television");
    c1.addItem(5000.0, "Refrigerator");
    
    System.out.println("====2====");
    c2.addItem("Stove",439.90);
    
    System.out.println("====3====");
    c3.addItem("Chair",1400.5);
    c3.addItem(3400.0, "Chair");
    
    System.out.println("====4====");
    c1.cartDetails();
    
    System.out.println("====5====");
    c2.cartDetails();
    
    System.out.println("====6====");
    c3.cartDetails();
    c1.giveDiscount(10);
    
    System.out.println("====7====");
    c1.cartDetails();
  }
}


public class Cart{
  public int cartNo;
  public String [] items = new String[3];
  public double [] price = new double[3];
  public int count = 0;
  public double tPrice = 0.0;
  public double discount = 0.0;
  public void create_cart(int n1){
    this.cartNo = n1;
  }
  public void addItem(String s1, double d1){
    if(count<3){
      items[count] = s1;
      price[count] = d1;
      count++;
      System.out.println(s1+" added to cart "+cartNo);
      System.out.println("You have "+count+ " item(s) in your cart now.");
    }
    else{
      System.out.println("You already have 3 items on your cart");
    }
  }
  public void addItem(double d1, String s1){
    if(count<3){
      price[count] = d1;
      items[count] = s1;
      count++;
      System.out.println(s1+" added to cart "+cartNo);
      System.out.println("You have "+count+ " item(s) in your cart now.");
    }
    else{
      System.out.println("You already have 3 items on your cart");
    }
  }
  public void giveDiscount(double d1){
    this.discount = d1;
  }
  public void cartDetails(){
    tPrice = 0.0;
    System.out.println("Your cart(c"+cartNo+") :");
    for(int i=0;i<count;i++){
      System.out.println(items[i]+ ": "+price[i]);
      tPrice+=price[i];
    }
    double dp = (tPrice*(1-discount/100));
    System.out.println("Discount Applied: "+discount+"%");
    System.out.println("Total Price: "+dp);
  }
}
    

8)
public class Reader_tester {
  public static void main(String[] args){
    Reader r1 = new Reader();
    Reader r2 = new Reader();
    
    System.out.println("1 ==========");
    System.out.println(r1.createReader("Messi", 2));
    System.out.println(r2.createReader("Ronaldo", 3));
    
    System.out.println("2 ==========");
    r1.readerInfo();
    
    System.out.println("3 ==========");
    r2.addBook("Java");
    r2.addBook("Python");
    r2.addBook("C++");
    r2.readerInfo();
    
    System.out.println("4 ==========");
    r1.addBook("C#");
    r1.addBook("Rust");
    r1.addBook("GoLang");
    
    System.out.println("5 ==========");
    r2.addBook("Python");
    
    System.out.println("6 ==========");
    r1.readerInfo();
  }
}


public class Reader{
  public String name;
  public int capacity;
  public String[]books;
  public int bookCount;
  public String createReader(String s1, int n1){
   this.name = s1;
   this.capacity = n1;
   this.books = new String[capacity];
   this.bookCount = 0;
   return("A new reader is created!");
  }
  public void addBook(String s1){

   if(bookCount<capacity){
        books[bookCount] = s1;
        bookCount++;
   }
   else{
     System.out.println("No More Cpaacity");
   }
  }
  public void readerInfo(){
    System.out.println("Name: "+name);
    System.out.println("Capacity: "+capacity);
    System.out.println("Books:");
    if(bookCount==0){
      System.out.println("No books added yet");
    }
    for(int i =0;i<bookCount;i++){
      System.out.println("Book "+(i+1)+": "+books[i]);
    }
  }
}
  

