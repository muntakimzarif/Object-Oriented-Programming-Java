1)
public class BrowserHistoryTester {
  public static void main(String[] args){
    BrowserHistory chrome = new BrowserHistory(3);
    System.out.println(chrome.count + " web pages visited.");
    System.out.println("1=========");
    chrome.showHistory();
    System.out.println("2=========");
    chrome.currentWeb();
    System.out.println("3=========");
    chrome.visitWeb("www.google.com");
    chrome.visitWeb("www.facebook.com");
    chrome.visitWeb("www.youtube.com");
    chrome.visitWeb("www.reddit.com");
    System.out.println("4=========");
    System.out.println(chrome.count + " web pages visited.");
    System.out.println("5=========");
    chrome.showHistory();
    System.out.println("6=========");
    chrome.currentWeb();
    System.out.println("7=========");
    chrome.back();
    System.out.println("8=========");
    System.out.println(chrome.count + " web pages visited.");
    System.out.println("9=========");
    chrome.currentWeb();
    System.out.println("10=========");
    chrome.back();
    System.out.println("11=========");
    chrome.currentWeb();
    System.out.println("12=========");
    chrome.back();
    System.out.println("13=========");
    chrome.currentWeb();
    System.out.println("14=========");
    System.out.println(chrome.count + " web pages visited.");
  }
}

public class BrowserHistory{
  public static int count;
  private int cap;
  public String [] vis;
  public BrowserHistory(int n1){
    cap = n1;
    vis = new String [cap];
  }
  public void visitWeb(String s1){
    if(count<cap){
      vis[count++] = s1;
      System.out.println("Visited: "+s1);
    }
    else{
      System.out.println("History is full. Cannot visit "+s1+" web page");
    }
  }
  public void showHistory(){
    if(count == 0){
      System.out.println("No web pages visited yet");
    }
    else{
      System.out.println("Browser History: ");
      for(int i =0; i<count; i++){
        System.out.println(vis[i]);
      }
    }
  }
  public void currentWeb(){
    if(count ==0){
      System.out.println("You did not visit any website yet!");
    }
    else{
      System.out.println("Current web page: "+vis[count-1]);
    }
  }
  public void back(){
    if(count ==0){
      System.out.println("You have not visited any website yet!");
    }
    else{
      count--;
    }
  }
}

2)
public class CustomerServiceTester {
  public static void main(String[] args) {
    CustomerService service = new CustomerService(3);
    service.serveCustomer();
    System.out.println("1=========");
    service.addCustomer("Arthur");
    service.addCustomer("Bruce");
    service.addCustomer("Clark");
    service.addCustomer("Kara");
    System.out.println("2=========");
    service.serveCustomer(); 
    service.serveCustomer(); 
    System.out.println("3=========");
    service.addCustomer("Diana");
    service.addCustomer("Victor");
    service.addCustomer("Harley");
    System.out.println("4=========");
    service.serveCustomer(); 
    service.serveCustomer(); 
    service.serveCustomer(); 
    service.serveCustomer(); 
  }
}

public class CustomerService{
  public String[] add;
  public int cap;
  public int count;
  public boolean serve;
  public int front;
  public int back;
  public CustomerService(int n1){
    cap = n1;
    add = new String [cap];
    serve = false;
  }
  public void addCustomer(String s1){
    if(count<cap){
      add[back] = s1;
      back = (back+1)%cap;
      count++;
      System.out.println("Added: "+s1);
    }
    else{
      System.out.println("Queue is full. Cannot add "+s1);
    }
  }
  public void serveCustomer(){
    if(count>0){
      System.out.println("Serving "+add[front]);
      front = (front+1)%cap;
      count--;
    }
    else{
      System.out.println("No customers to serve");
    }
  }
}

3)
public class shapeTester {
  public static void main(String[] args) {
    Shape s = new Shape();
    s.name = "Mobius Strip";
    s.color = "Blue";
    s.displayInfo();
    System.out.println("=======================");
    Circle c = new Circle();
    System.out.println("=======================");
    c.name = "Circle";
    c.color = "Red";
    c.radius = 5;
    c.displayInfo();
    System.out.println("=======================");
    c.area();
  }
}

public class Shape {
  public String name;
  public String color;

  public void displayInfo() {
    System.out.printf("Name: %s\nColor: %s\n", name, color);
  }
}

public class Circle extends Shape{
  public int radius;
  public void area(){
    System.out.println("Area of "+color+" Circle: "+3.1416*radius*radius);
  }
}

4)
public class AnimalTester{
  public static void main(String args[]){
    Animal a1 = new Animal();
    System.out.println("1-------------");
    a1.details();
    System.out.println("2-------------");
    Dog d1  = new Dog();
    d1.name = "Pammy";
    System.out.println("3-------------");
    System.out.println("Name: " + d1.getName());
    d1.details();
    System.out.println("4-------------");
    d1.updateSound("Bark");
    System.out.println("5-------------");
    d1.details();
  }
}

public class Animal{ 
  public int legs = 4;
  public String sound = "Not defined";
  
  public void details(){
    System.out.println("Legs: "+legs);
    System.out.println("Sound: "+sound);
  }
}

public class Dog extends Animal{
  public String name;
  public Dog(){
    System.out.println("The dog says hello!");
  }
  public String getName(){
    return name;
  }
  public void details(){
    super.details();
  }
  public void updateSound(String s1){
    super.sound = s1;
  }
}

5)
public class Tester5 {
  public static void main(String[] args) {
    Cricket_Tournament ct1 = new Cricket_Tournament();
    System.out.println(ct1.detail());
    System.out.println("-----------------------");
    
    Cricket_Tournament ct2 = new Cricket_Tournament("IPL", 10, "t20");
    System.out.println(ct2.detail());
    System.out.println("-----------------------");
    
    Tennis_Tournament tt = new Tennis_Tournament("Roland Garros", 128);
    System.out.println(tt.detail());
  }
}

public class Tournament {
  private String name;
  public Tournament() {
    this.name = "Default";
  }
  public Tournament(String name) {
    this.name = name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
}

public class Tennis_Tournament extends Tournament{
  public int num;
  public Tennis_Tournament(String s1, int n1){
    super.setName(s1);
    num = n1;
  }
  public String detail(){
    return "Tennis Tournament name: "+super.getName()+"\nNumber of Players: "+num;
  }
}

public class Cricket_Tournament extends Tournament{
  public String type;
  public int teams;
  public Cricket_Tournament(){
    type = "No type";
    super.setName("Default");
  }
  public Cricket_Tournament(String s1, int n1, String s2){
    super.setName(s1);
    teams = n1;
    type = s2;
  }
  public String detail(){
    return "Cricket Tournament Name: "+super.getName()+"\nNumber of Teams: "+teams+"\nType: "+type;
  }
}

6)
public class Tester6 {
  public static void main(String[] args) {
    Book book = new Book(1, "The Alchemist", 500, "97806", "HarperCollins");
    System.out.println(book.printDetail());
    System.out.println("-----------------------");
    
    CD cd = new CD(2, "Shotto", 300, "Warfaze", 50, "Hard Rock");
    System.out.println(cd.printDetail());
  }
}

class Product {
  private int id;
  private String title;
  private int price;
  
  public Product(int id, String title, int price) {
    this.id = id;
    this.title = title;
    this.price = price;
  }
  
  public String getIdTitlePrice() {
    return "ID: " + id + " Title: " + title + " Price: " + price;
  }
}

public class Book extends Product{
  public String isbn;
  public String pub;
  public Book(int n1, String s1, int n2, String s3, String s2){
    super(n1, s1, n2);
    isbn = s3;
    pub = s2;
  }
  public String printDetail(){
    return super.getIdTitlePrice()+" ISBN: "+isbn+" Publisher: "+pub;
  }
}
public class CD extends Product{
  public String band;
  public int dur;
  public String genre;
  public CD(int n1, String s1, int n2, String s2, int n3, String s3){
    super(n1, s1, n2);
    band = s2;
    dur = n3;
    genre = s3;
  }
  public String printDetail(){
    return super.getIdTitlePrice()+" Band: "+band+" Durationr: "+dur+" minutes Genre: "+genre;
  }
}

7)
public class StudentTester{
  public static void main (String args[]){
    CSEStudent.details();
    System.out.println("1--------------");
    CSEStudent s1 =  new CSEStudent("Bob", 23);
    s1.info();
    System.out.println("2--------------");
    CSEStudent s2 =  new CSEStudent("Don", 33);
    s2.info();
    System.out.println("3--------------");
    s1.addLabBasedCourse("CSE220");
    s1.addLabBasedCourse("CSE221");
    System.out.println("4--------------");
    s1.info();
    System.out.println("5--------------");
    CSEStudent.details();
    System.out.println("6--------------");
    s1.addLabBasedCourse("CSE230");
    System.out.println("7--------------");
    s1.info();
    System.out.println("8--------------");
    s2.addLabBasedCourse("CSE110");
    s2.info();
  }
}

class Student{
  public String name;
  public int id;
  public String courses = "";
  
  public Student(String n, int i){
    name = n;
    id = i;
  }
  
  public void info(){
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("Courses: "+courses);
  }
}

public class CSEStudent extends Student{
  public static String [] course = {"CSE110", "CSE111", "CSE220", "CSE221"};
  public static int count;
  public String [] took = new String [5];
  public int count1;
  public CSEStudent(String s1, int n1){
    super(s1, n1);
    count++;
  }
  public void addLabBasedCourse(String s1){
    for(int i = 0; i<course.length;i++){
      if(course[i].equals(s1)){
        took[count1++] += s1;
        courses += s1+" ";
        return;
      }
    }
        System.out.println("It is not a lab based course!");
    }
  public static void details(){
    System.out.println("Total CSE Students: "+count);
    System.out.println("Available Lab Based Courses: ");
    for(int i = 0; i< course.length;i++){
      System.out.print(course[i]+" ");
    }
    System.out.println();
  }
}

8)
public class PlayerTester {
  public static void main(String[] args) {
    Player playerOne = new Player("Al-Nassr", "Ronaldo", "Striker", 25, 32);
    playerOne.calculateRatio();
    playerOne.printDetails();
    System.out.println("----------------");
    Manager managerOne = new Manager("Real Madrid", "Zidane", "Manager", 25);
    managerOne.printDetails();
  }
}

class SportsPerson {
  private String team;
  private String name;
  public String role;
  public double earningPerMatch;
  
  public SportsPerson(String teamName, String name, String role){
    this.team = teamName;
    this.name = name;
    this.role = role;
    this.earningPerMatch = 0;
  }
  
  public String getNameTeam() {
    return "Name: " + name + ", Team Name: " + team;
  }
}

public class Player extends SportsPerson{
  public double goal;
  public double total;
  public double ratio;
  public Player(String s1, String s2, String s3, int n1, int n2){
    super(s1, s2, s3);
    goal = n1;
    total = n2;
    ratio = goal/total;
  }
  public void calculateRatio(){
    super.earningPerMatch =  (goal*1000) + (total*10);
  }
  public void printDetails(){
    System.out.println(super.getNameTeam());
    System.out.println("Team Role: "+role);
    System.out.println("Total Goal: "+(int)goal+", Total Played: "+(int)total);
    System.out.println("Goal Ratio: "+String.format("%.2f",ratio));
    System.out.println("Match Earning: "+(int)earningPerMatch+"K");
  }
}

public class Manager extends SportsPerson{
  public int wins;
  public Manager(String s1, String s2, String s3, int n1){
    super(s1, s2, s3);
    wins = n1;
    super.earningPerMatch = wins*1000;
  }
  public void printDetails(){
    System.out.println(super.getNameTeam());
    System.out.println("Team Role: "+role);
    System.out.println("Total wins: "+wins);
    System.out.println("Match Earning: "+(int)earningPerMatch+"K");
  }
}

