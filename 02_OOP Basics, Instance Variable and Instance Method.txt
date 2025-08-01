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
    //Are the location of the objects the same? NO.
  }
}

b)

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


3)

public class CSECourse{
  public String courseName = "Programming Language II";
  public String courseCode = "CSE111";
  public int credit = 3;
}

4)

public class ImaginaryNumber{
  public int imaginaryPart = 0;
  public int realPart = 0;
  public void printNumber(){
    System.out.println(realPart+" + "+imaginaryPart+"i");
  }
}


5)

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



