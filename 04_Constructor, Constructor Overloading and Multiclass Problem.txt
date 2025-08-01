1)

public class Student{
  public String name;
  public String prog;
  public Student(String s1, String s2){
    this.name = s1;
    this.prog = s2;
  }
  public void updateName(String s1){
    this.name = s1;
  }
  public void updateProgram(String s1){
    this.prog = s1;
  }
  public String accessProgram(){
    return prog;
  }
}

2)

public class Toy{
  public String name;
  public int price;
  public Toy(String s1, int n1){
    this.name = s1;
    this.price = n1;
    System.out.println("A new toy has been made!");
  }
  public void updatePrice(int n1){
    this.price = n1;
  }
  public void updateName(String s1){
    System.out.println("Changing old name: "+name);
    name = s1;
    System.out.println("New name: "+s1);
  }
  public void showPrice(){
    System.out.println("Price: "+price+" Taka");
  }
}


3)

public class Shape2D{
  public String name;
  public int length;
  public int breadth;
  public int height;
  public int base;
  public double area;
  public Shape2D(){
    this.name = "Square";
    this.length = 5;
    System.out.println("A "+name+" has been created with length: "+length);
    area = length*length;
  }
  public Shape2D(int n1, int n2){
    this.length = n1;
    this.breadth = n2;
    this.name = "Rectangle";
    System.out.println("A "+name+" has been created with length: "+length+" and breadth: "+breadth);
    area = n1*n2;
  }
  public Shape2D(int n1, int n2, String s1){
    this.height = n1;
    this.base = n2;
    this.name = s1;
    System.out.println("A "+name+" has been created with height: "+height+" and base: "+base);
    area = 0.5*n1*n2;
  }
  public Shape2D(int n1, int n2, int n3){
    this.name = "Triangle";
    double d1 = (n1+n2+n3)/2;
    area = Math.sqrt(d1*(d1-n1)*(d1-n2)*(d1-n3));
    System.out.println("A Triangle has been created with the following sides: "+n1+", "+n2+", "+n3);
  }
  public void area(){
    System.out.println("The area of the "+name+" is "+ area);
  }
}


4)

public class Student{
  public int id;
  public String [] course = new String[4];
  public int count;
  public double cg;
  public Student(int n1){
    this.id = n1;
    System.out.println("A student with ID "+id+"has been created.");
  }
  public Student(int n1, double d1){
    this.id = n1;
    this.cg = d1;
    System.out.println("A student with ID "+id+" and cgpa "+cg+" has been created.");
  }
  public void storeID(int n1){
    this.id = n1;
  }
  public void storeCG(double d1){
    this.cg = d1;
  }
  public void addCourse(String s1){
    if(cg == 0.0){
      System.out.println("Failed to add "+s1);
      System.out.println("Set cg first");
    }
    else if(cg<3 && count==3){
      System.out.println("Failed to add "+s1);
      System.out.println("CG is low can't add more than 3 courses");
    }
    else if(cg>3 && count==4){
      System.out.println("Failed to add "+s1);
      System.out.println("Maximum 4 courses allowed");
    }
    else{
      course[count] = s1;
      count++;
    }
  }
  public void removeAllCourse(){
    for(int i=0;i<count;i++){
      course[i] = null;
      count = 0;
    }
  }
  public void addCourse(String[]s1){
    for(int i=0;i<s1.length;i++){
      if(count==4){
        System.out.println("Failed to add "+s1[i]);
        System.out.println("Maximum 4 courses allowed");
      }
      else{
        course[count] = s1[i];
        count++;
      }
    }
  }
  public void showAdvisee(){
    System.out.println("Student ID: "+id+", CGPA: "+cg);
    if(count>0){
      System.out.println("Added courses are: ");
      for(int i=0;i<count;i++){
        System.out.print(course[i]+" ");
      }
      System.out.println();
    }
    else{
      System.out.println("No courses added.");
    }
  }
}


5)

public class Triangle{
  public int side1;
  public int side2;
  public int side3;
  public int perimeter;
  public String name;
  public Triangle(int n1, int n2, int n3){
    this.side1 = n1;
    this.side2 = n2;
    this.side3 = n3;
    this.perimeter = n1+n2+n3;
  }
  public String printTriangleType(){
    if(side1==side2 && side2==side3){
      return "This is an Equilateral Triangle.";
    }
    else if(side1!=side2 && side2!=side3){
      return "This is a Scalene Triangle.";
    }
    else{
      return "This is an Isosceles Triangle.";
    }
  }
  public void triangleDetails(){
    System.out.println("Three sides of the triangle are: "+side1+", "+side2+", "+side3);
    System.out.println("Perimeter: "+perimeter);
  }
  public void compareTrinagles(Triangle s1){
    if(this == s1){
      System.out.println("These two triangle objects have the same address.");
    }
    else if(this.side1 == s1.side1 && this.side2 == s1.side2 && this.side3 == s1.side3){
      System.out.println("Addresses are different but the sides of the triangles are equal."); 
    }
    else if(this.perimeter == s1.perimeter){
      System.out.println("Only the perimeter of both triangles is equal.");
    }
    else{
       System.out.println("Addresses, length of the sides and perimeter all are different.");
    }
  }
}

6)

public class Teacher{
  public String name;
  public String ini;
  public Course [] course = new Course[3];
  public int count = 0;
  public Teacher(String s1, String s2){
    this.name = s1;
    this.ini = s2;
    System.out.println("A new teacher has been created");
  }
  public void addCourse(Course s1){
    if(count<3){
      course[count] = s1;
      count++;
      }
    else{
      System.out.println("Maximum 3 courses");
    }
  }
  public void printDetail(){
    System.out.println("Name: "+name);
    System.out.println("Initial: "+ini);
    System.out.println("List of Courses: ");
    for(int i =0; i<count;i++){
      System.out.println(course[i].course);
    }
  }
}

public class Course{
  public String course;
  public Course(String s1){
    this.course = s1;
  }
}
 

7)

public class BracuBus{
  public String route;
  public int capacity = 2;
  public int count;
  public String [] name = new String [capacity];
  public void showDetails(){
    System.out.println("Bus Route: "+route);
    System.out.println("Passenger Count: "+count+"(Max: "+capacity);
    System.out.println("Passenger on Board:");
    for(int i = 0;i<count;i++){
      System.out.print(name[i]+" ");
    }
    System.out.println();
  }
  public BracuBus(String s1){
    this.route = s1;
  }
  public BracuBus(String s1, int n1){
    this.route = s1;
    this.capacity = n1;
  }
  public void board(BracuStudent s1){
    if(count<capacity){
      if(!s1.hasBusPass()){
        System.out.println("You don't have a bus pass!");
      }
      else if(!s1.getHome().equals(route)){
        System.out.println("You got on the wrong bus!");
      }
      else{
        name[count] = s1.getName();
        count++;
        System.out.println(s1.getName()+" boarded the bus");
      }
    }
    else{
      System.out.println("Bus is full");
    }
  }
  public void board(){
    if(count ==0){
      System.out.println("No Passengers");
    }
    else{
      System.out.println("Passenger on Board:");
      for(int i = 0;i<count;i++){
        System.out.print(name[i]+" ");
      }
      System.out.println();
    }
  }
  public void board(BracuStudent s1, BracuStudent s2){
    if(count<capacity){
      board(s1);
      board(s2);
    }
  }
}

public class BracuStudent {
  public String name;
  public String location;
  public boolean pass = false;
  
  public BracuStudent(String s1, String s2) {
    this.name = s1;
    this.location = s2;
  }
  public void showDetails() {
    System.out.println("Student Name: " +name);
    System.out.println("Lives in " +location);
    System.out.println("Have Bus Pass? " +pass);
  }
  public void getPass() {
    this.pass = true;
  }
  public void updateHome(String s1) {
    this.location = s1;
  }
  public String getName(){
    return name;
  }
  public String getHome(){
    return location;
  }
  public boolean hasBusPass(){
    return pass;
  }


8)

public class Usis{
  public int totalAdvisee;
  public Student [] std = new Student[5];
  public Usis(){
    System.out.println("Usis is ready to use!");
  }
  public void login(Student s1){
    if(s1.email == null || s1.password == null){
      System.out.println("Email and Password need to be set");
    }
    else{
      s1.loggedIn = true;
      System.out.println("Login Successful");
    }
  }
  public void advising(Student s1){
    if(!s1.loggedIn){
      System.out.println("Please login to advise courses!");
    }
    else{
      System.out.println("You haven't selected any courses.");
    }
  }
  public void advising(Student s1, String c1, String c2, String c3, String c4){
    System.out.println("You need special approval to take more than 3 courses.");
  }
  public void advising(Student s1, String c1, String c2, String c3){
    String [] courses = {c1, c2, c3};
    for(int i =0; i<courses.length;i++){
      s1.courses[i] = courses[i];
    }
    std[totalAdvisee] = s1;
    totalAdvisee++;
    System.out.println("Advising successful");
  }
  public void allAdviseeInfo(){
    System.out.println("Total Advise: "+totalAdvisee);
    for(int i =0;i<totalAdvisee;i++){
      Student s1 = std[i];
      System.out.println("Name: "+s1.name+" ID :"+s1.id);
      System.out.println("Department: "+s1.dept);
      System.out.println("Advised Courses: ");
      for(int j=0; j<s1.courses.length; j++){
        System.out.print(s1.courses[j]+" ");
      }
      System.out.println();
      System.out.println("===============");
    }
  }
}

public class Student{
  public String name;
  public int id;
  public String dept;
  public String email;
  public String password;
  public boolean loggedIn;
  public String [] courses;
  public Student(String s1, int n1, String s2){
    this.name = s1;
    this.id = n1;
    this.dept = s2;
    this.email = null;
    this.password = null;
    this.loggedIn = false;
    this.courses = new String[3];
    System.out.println("Student object is created");
  }
}

