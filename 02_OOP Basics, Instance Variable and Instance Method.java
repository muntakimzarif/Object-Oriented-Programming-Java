1)
a)

public class UniversityTester{
  public static void main(String[]args){
    University u1 = new University();
    University u2 = new University();
    System.out.println(u1);
    System.out.println(u2);
    System.out.println(u1.name);
    System.out.println(u2.name);
    System.out.println(u1.country);
    System.out.println(u2.country); 
  }
}
public class University{
    public String name;
    public String country;
}

b)
public class University{
    public String name;
    public String country;
}

public class UniversityTester{
  public static void main(String[]args){
    University u1 = new University();
    University u2 = new University();
    System.out.println(u1);
    System.out.println(u2);
    System.out.println(u1.name);
    System.out.println(u2.name);
    System.out.println(u1.country);
    System.out.println(u2.country); 
    //Are the location of the objects the same? NO.
    u1.name =  "Imperial College London";
    u1.country =  "England";
    u2.name =  "BRAC University";
    u2.country =  "Bangladesh";
    System.out.println(u1.name);
    System.out.println(u2.name);
    System.out.println(u1.country);
    System.out.println(u2.country); 
  }
}

2)

public class Student{
  public String name = "default";
  public int id = 0;
}

public class StudentTester1{
   public static void main(String [] args){
      Student s1 = new Student();
      System.out.println("Name of the Student: "+s1.name);
      System.out.println("ID of the Student: "+s1.id);
      s1.name = "Bob";
      s1.id = 123;
      System.out.println("Name of the Student: "+s1.name);
      System.out.println("ID of the Student: "+s1.id);
   }
}


3)

public class CSECourse{
  public String courseName = "Programming Language II";
  public String courseCode = "CSE111";
  public int credit = 3;
}

public class CourseTester{
  public static void main(String args []){
    CSECourse c1 = new CSECourse();
    System.out.println("Course Name: "+c1.courseName);
    System.out.println("Course Code: "+c1.courseCode);
    System.out.println("Credit: "+c1.credit);
   }
}

4)

public class ImaginaryNumber{
  public int imaginaryPart = 0;
  public int realPart = 0;
  public void printNumber(){
    System.out.println(realPart+" + "+imaginaryPart+"i");
  }
}

public class Tester6{
  public static void main(String [] args){
     ImaginaryNumber num1 = new ImaginaryNumber();
     String p = num1.printNumber();
     System.out.println(p);
     System.out.println("1********");
     num1.realPart=3;
     num1.imaginaryPart=7;
     System.out.println(num1.printNumber());
     System.out.println("2********");
     ImaginaryNumber num2 = new ImaginaryNumber();
     num2.realPart=1;
     num2.imaginaryPart=9;
     System.out.println(num2.printNumber());
    }
}

5)
public class Tester5{
  public static void main(String[] args) {
    Course c1 = new Course();
    Course c2 = new Course();  
    c1.updateDetails("Programming Language I","CSE110", 3);
    System.out.println("========== 1 ==========");
    c1.displayCourse(); 
    c2.updateDetails("Data Structures","CSE220", 3);
    System.out.println("========== 2 ==========");
    c2.displayCourse();  
    c1.updateDetails("Programming Language II","CSE111", 3);
    System.out.println("========== 3 ==========");
    c1.displayCourse();
  }
}

public class Course{
  public String courseName;
  public String courseCode;
  public int courseCredit;
  public void updateDetails(String courseName, String courseCode,int courseCredit){
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.courseCredit = courseCredit;
  }
    public void displayCourse(){
      System.out.println("Course Name: "+ courseName);
      System.out.println("Course Code: "+ courseCode);
      System.out.println("Course Credit: "+ courseCredit);
    }
}


6)
public class AssignmentTester{
  public static void main(String [] args){
    Assignment as1 = new Assignment();
    as1.printDetails();
    System.out.println("1---------------");
    as1.tasks = 11;
    as1.difficulty = "Moderate";
    as1.submission = true;
    as1.printDetails();
    System.out.println("2---------------");
    System.out.println(as1.makeOptional());
    System.out.println("3---------------");
    as1.printDetails();
    System.out.println("4---------------");
    Assignment as2 = new Assignment();
    as2.tasks = 12;
    as2.difficulty = "Hard";
    as2.submission = false;
    as2.printDetails();
    System.out.println("5---------------");
    System.out.println(as2.makeOptional());
  }
}

public class Assignment{
  public String difficulty;
  public boolean submission;
  public int tasks;
  public void printDetails(){
    System.out.println("Number of tasks: "+tasks);
    System.out.println("Difficulty Level: "+difficulty);
    System.out.println("Submission Required: "+submission);
  }
  public String makeOptional(){
    if(submission == false){
      return "Submission is already not required";
    }
    else{
      submission = false;
      return "Assignment will not require submission";
    }
  }
}


7)
public class Tester9{
  public static void main(String[]args){
     CellPhone phone1 = new CellPhone();
     phone1.printDetails();
     phone1.model ="Nokia 1100";
     System.out.println("1##################");
     phone1.storeContact("Joy - 01834");
     System.out.println("===================");
     phone1.printDetails();
     System.out.println("2##################");
     phone1.storeContact("Toya - 01334");
     phone1.storeContact("Aayan - 01135");
     System.out.println("===================");
     phone1.printDetails();
     System.out.println("3##################");
     phone1.storeContact("Sani - 01441");
     System.out.println("===================");
     phone1.printDetails();  
  }
}

public class CellPhone{
  public String model = "unknown";
  public int contactStored = 0;
  public String[] storedContacts = new String[3];
  public void printDetails(){
    System.out.println("Phone Model: "+model);
    System.out.println("Contacts Stored "+contactStored);
    if(contactStored>0){
      System.out.println("Stored Contacts ");
      for(int i = 0;i<contactStored;i++){
        System.out.println(storedContacts[i]);
      }
    }
  }
  public void storeContact(String s1){
    if(contactStored < storedContacts.length){
      storedContacts[contactStored] = s1;
      contactStored++;
      System.out.println("Contact Stored");
    }
    else{
      System.out.println("Memory full new contacts cannot be stored");
    }
  }
}


8)
public class Tester3{
  public static void main(String[] args){

    Employee emp1 = new Employee();
    Employee emp2 = new Employee();
    Employee emp3 = new Employee();
      
    emp1.newEmployee("Harry Potter");
    emp2.newEmployee("Hermione Granger");
    emp3.newEmployee("Ron Weasley");
    System.out.println("1 ==========");
    emp1.displayInfo();
    System.out.println("2 ==========");
    emp2.displayInfo();
    System.out.println("3 ==========");
    emp3.displayInfo();
    System.out.println("4 ==========");
    emp1.calculateTax();
    System.out.println("5 ==========");
    emp1.promoteEmployee("lead");
    System.out.println("6 ==========");
    emp1.calculateTax();
    System.out.println("7 ==========");
    emp1.displayInfo();
    System.out.println("8 ==========");
    emp3.promoteEmployee("manager");
    System.out.println("9 ==========");
    emp3.calculateTax();
    System.out.println("10 ==========");
    emp3.displayInfo();
  }
}

public class Employee 
{
  public String name;
  public double salary;
  public String designation;
  
  public Employee() 
  {
    this.salary = 30000.0; 
    this.designation = "junior"; 
  }
  public void newEmployee(String name)
  {
    this.name = name;
  }
  public void displayInfo()
  {
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary + " Tk");
    System.out.println("Employee Designation: " + designation);
  }
  public void calculateTax() 
  {
    double tax = 0.0;
    if (salary > 50000)
    {
      tax = salary * 0.30; 
    } 
    else if (salary > 30000) 
    {
      tax = salary * 0.10; 
    }
    if (tax > 0) 
    {
      System.out.println(name + " Tax Amount: " + tax + " Tk");
    } 
    else 
    {
      System.out.println("No need to pay tax");
    }
  }
  public void promoteEmployee(String newDesignation)
  {
    if (newDesignation.equals("senior")) 
    {
      salary += 25000;
    } 
    else if (newDesignation.equals("lead")) 
    {
      salary += 50000;
    } 
    else if (newDesignation.equals("manager"))
    {
      salary += 75000;
    } 
    else 
    {
      System.out.println("Invalid promotion");
      return;
    }
    designation = newDesignation;
    System.out.println(name + " has been promoted to " + designation);
    System.out.println("New Salary: " + salary + " Tk");
  }
}




