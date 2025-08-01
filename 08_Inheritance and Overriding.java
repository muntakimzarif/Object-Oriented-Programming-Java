1)
public class Student{
  private String name = "Just a Student"; 
  private String department = "nothing";
  
  public void setDepartment(String dpt){
    this.department = dpt;
  }
  public void setName(String name){
    this.name = name;
  }
  public void details(){
    System.out.println("Name : " + name + " Department: " + department);
  }
}
//Tester Class
public class TestStudent{
  public static void main(String [] args){
    BBAStudent b1 = new BBAStudent();
    BBAStudent b2 = new BBAStudent("Humty Dumty");
    BBAStudent b3 = new BBAStudent("Little Bo Peep"); 
    b1.details();
    System.out.println("1---------------");
    b2.details();
    System.out.println("2---------------");
    b3.details();
  }
}

public class BBAStudent extends Student{
  public BBAStudent(){
    super.setName("Default");
    super.setDepartment("BBA");
  }
  public BBAStudent(String s1){
    super.setName(s1);
    super.setDepartment("BBA");
  }
}

2)
public class Account{
  public double balance = 0.0;
  
  public Account(double balance){
    this.balance = balance;
  }
  public double showBalance(){
    return balance;
  }
}
 
//Tester Class
public class TestAccount{
  public static void main(String [] args){
    System.out.println("Total Checking Accounts: "+CheckingAccount.count);
    CheckingAccount c1 = new CheckingAccount();
    System.out.println("Account Balance: " + c1.showBalance());
    CheckingAccount c2 = new CheckingAccount(100.0);
    System.out.println("Account Balance: " + c2.showBalance());
    CheckingAccount c3 = new CheckingAccount(200.0);
    System.out.println("Account Balance: " + c3.showBalance());
    System.out.println("Total Checking Accounts: "+CheckingAccount.count);
  

public class CheckingAccount extends Account{
  public static int count;
  public CheckingAccount(){
    super(0.0);
    count++;
  }
  public CheckingAccount(double d1){
    super(d1);
    count++;
  }
}

3)
public class Animal {
    public String name;
    public int age;
    public String color;
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    public String info() {
        return "Name: "+name+"\nAge: "+age+"\nColor: "+color+"\n";
    }
}

public class AnimalTester {
    public static void main(String[] args) {
      Dog dog = new Dog("Buddy", 5, "Brown", "Bulldog");
      Cat cat = new Cat("Kitty", 3, "White", "Persian");
      System.out.println("1.========");
      System.out.println(dog.info());
      System.out.println("2.========");
      System.out.println(cat.info());
      System.out.println("3.========");
      dog.makeSound();
      System.out.println("4.========");
      cat.makeSound();
    }
}

public class Dog extends Animal{
  public String type;
  public Dog(String s1, int n1, String s2, String s3){
    super(s1, n1, s2);
    type = s3;
  }
  public void makeSound(){
     System.out.println(super.color+" color "+super.name+" is barking");
  }
  public String info(){
    return super.info()+"Breed: "+type;
  }
}
    public class Cat extends Animal{
  public String type;
  public Cat(String s1, int n1, String s2, String s3){
    super(s1, n1, s2);
    type = s3;
  }
  public void makeSound(){
    System.out.println(super.color+" color "+super.name+" is barking");
  }
  public String info(){
    return super.info()+"Breed: "+type;
  }
}


4)
public class Vehicle{
  public int x;
  public int y;
  
  public void moveUp(){
    y = y+1;
  }
  public void moveDown(){
    y = y-1;
  }
  public void moveLeft(){
    x = x-1;
  }
  public void moveRight(){
    x = x+1;
  }
  public String toString(){
    return "("+ x + ","+ y + ")";
  }
}
 
//Tester Class
public class Vehicle2010User{
  public static void main(String[] args){
    Vehicle2010 car1 = new Vehicle2010();
    System.out.println(car1);
    car1.moveLowerLeft();
    System.out.println(car1);
    
    Vehicle2010 car2 = new Vehicle2010();
    System.out.println(car2);
    car2.moveUpperRight();
    System.out.println(car2);
    car2.moveLowerRight();
    System.out.println(car2);
  }
}

public class Vehicle2010 extends Vehicle{
  public void moveLowerLeft(){
    y = y-1;
    x = x-1;
  }
  public void moveUpperRight(){
    y = y+1;
    x = x+1;
  }
 public void moveLowerRight(){
    y = y-1;
    x = x+1;
  }
}


5)
public class RealNumber {
    public double realValue;
    public RealNumber() {
        this(0.0);
    }
    public RealNumber(double realValue) {
        this.realValue = realValue;
    }
    public String toString(){
        return "RealPart: " + realValue;
    }
}

public class ComplexNumberTester {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println(cn1);
        System.out.println("----------------");
        ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
        System.out.println(cn2);
    }
}

public class ComplexNumber extends RealNumber{
  public double iVal;
  public ComplexNumber(){
    super(1.0);
    iVal = 1.0;
  }
  public String toString(){
    return super.toString()+"\nImaginaryPart: "+iVal;
  }
  public ComplexNumber(double d1, double d2){
    super.realValue = d1;
    iVal = d2;
  }
}


6)
public class Employee {
    public String name;
    private double baseSalary;
    private int hoursWorked;

    public Employee(String name, double baseSalary, int hoursWorked){
        this.name = name;
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Work Hours: " + hoursWorked);
    }
}
public class EmployeeTester {
 public static void main(String[] args) {
  Manager neymar = new Manager("Neymar",1000, 45, 10);
  Developer messi = new Developer("Messi", 1000, 50, "Java");
  Developer chiesa = new Developer("Chiesa", 1000, 50, "Javascript");
  neymar.calculateSalary();
  System.out.println("1.==========");
  neymar.displayInfo();
  System.out.println("2.==========");
  neymar.requestIncrement(100);
  System.out.println("3.==========");
  neymar.setHoursWorked(85);
  neymar.requestIncrement(100);
  System.out.println("4.==========");
  neymar.calculateSalary();
  System.out.println("5.==========");
  neymar.displayInfo();
  System.out.println("6.==========");
  messi.calculateSalary();
  System.out.println("7.==========");
  messi.displayInfo();
  System.out.println("8.==========");
  chiesa.calculateSalary();
  System.out.println("9.==========");
  chiesa.displayInfo();
 }
}
public class Developer extends Employee{
  public String lang;
  public double finals;
  public Developer(String s1, double d1, int n1, String s2){
    super(s1, d1, n1);
    lang = s2;
  }
  public void calculateSalary(){
    double n1 = getBaseSalary();
    if(lang.equals("Java")){
      finals = n1+700;
    }
    else{
      finals = n1;
    }
  }
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Language: "+lang);
    System.out.println("Final Salary: $"+finals);
  }
}

public class Manager extends Employee{
  public double dis;
  public double salary;
  public Manager(String s1,double d1, int n1, double d2){
    super(s1, d1, n1);
    dis = d2;
  }
  public void calculateSalary(){
    if(getHoursWorked()>40){
      salary = getBaseSalary()*(dis/100)+ getBaseSalary();
    }
  }
  public void requestIncrement(int n1){
    if(getHoursWorked()>100){
      setBaseSalary(getBaseSalary()+n1);
      System.out.println("$"+n1+" Increment approved");
    }
    else if(getHoursWorked()>80 && getHoursWorked()<100){
      setBaseSalary(getBaseSalary()+n1/2);
      System.out.println("$"+n1/2+" Increment approved");
    }
    else{
      System.out.println("Increment denied");
    }
  }
  public void displayInfo(){
    System.out.println("Name: " + name);
    System.out.println("Base Salary: $"+getBaseSalary());
    System.out.println("Work Hours: "+getHoursWorked());
    System.out.println("Bonus: "+dis+"$");
    System.out.println("Final Salary: $"+salary);
  }
}

7)
public class Tea {
    public String name;
    public int price;
    public boolean status;

    public Tea(String name, int price) {
        this.name = name;
        this.price = price;
        this.status = false;
    }

    public void productDetail() {
        System.out.println("Name: " + name + ", Price: " + price);
        System.out.println("Status: " + status);
    }
}
//Driver Code
public class TeaTester{
 public static void main(String[] args) {
   KKTea t1 = new KKTea(250, 50);
   System.out.println("--------1---------");
   t1.productDetail();
   System.out.println("--------2---------");
   KKTea.totalSales();
   System.out.println("--------3---------");
   KKTea t2 = new KKTea(470, 100);
   KKTea t3 = new KKTea(360, 75);
   KKTea.updateSoldStatusRegular(t1);
   KKTea.updateSoldStatusRegular(t2);
   System.out.println("--------4---------");
   t2.productDetail();
   System.out.println("--------5---------");
   KKTea.totalSales();
   System.out.println("--------6---------");
   KKFlavouredTea t4 = new KKFlavouredTea("Jasmine", 260, 50);
   KKFlavouredTea t5 = new KKFlavouredTea("Honey Lemon", 270, 45);
   KKFlavouredTea t6 = new KKFlavouredTea("Honey Lemon", 270, 45);
   System.out.println("--------7---------");
   t4.productDetail();
   System.out.println("--------8---------");
   t6.productDetail();
   System.out.println("--------9---------");
   KKFlavouredTea.updateSoldStatusFlavoured(t4);
   KKFlavouredTea.updateSoldStatusFlavoured(t5);
   KKFlavouredTea.updateSoldStatusFlavoured(t6);
   System.out.println("--------10---------");
   KKTea.totalSales();
 }
}


public class KKFlavouredTea extends KKTea{
  public String tea;
  public KKFlavouredTea(String s1, int n1, int n2){
    super(n1, n2);
    tea = s1;
    name = "KK " +tea+ " Tea";
  }
  public static void updateSoldStatusFlavoured(KKFlavouredTea s1){
    s1.status = true;
    countF++;
    sales++;
  }
  public void productDetail(){
    System.out.println("Name: " + name + ", Price: " + price);
    System.out.println("Status: " + status);
    System.out.println("Weight: "+weight+", Tea Bags: "+bags);
  }
}

public class KKTea extends Tea{
  public static int sales;
  public static int countR;
  public static int countF;
  public Tea reg;
  public int weight;
  public int bags;
  public KKTea(int n1, int n2){
    super("KK Regular Tea", n1);
    bags = n2;
    weight = bags*2;
  }
  public static void updateSoldStatusRegular(KKTea s1){
    s1.status = true;
    countR++;
    sales++;
  }
  public static void totalSales(){
    System.out.println("Total Sales "+sales);
    System.out.println("KK Regular Tea: "+countR);
    if(countF>0){
      System.out.println("KK Flavoured Tea: "+countF);
    }
  }
  public void productDetail(){
    System.out.println("Name: " + name + ", Price: " + price);
    System.out.println("Status: " + status);
    System.out.println("Weight: "+weight+", Tea Bags: "+bags);
  }
}

