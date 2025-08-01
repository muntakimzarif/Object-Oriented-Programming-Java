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


2)

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
  
