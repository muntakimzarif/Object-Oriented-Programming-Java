1)

import java.util.Scanner;
public class lab1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Numbers");
    int count = 0;
    int max = 0;
    int min = 0;
    double sum = 0;
    for(int i = 1 ; i<=10; i++){
      int num = sc.nextInt();
      if(num>0 && num%2!=0){
        sum+=num;
        count++;
        if(count ==1){
          min = num;
          max = num;
        }
        if(num<min){
          min = num;
        }
        if(num>max){
          max = num;
        }
      }
    }
    if(count>0){
      double avg = sum/count;
      System.out.println("Sum:"+ sum);
      System.out.println("Maximum Value:"+ max);
      System.out.println("Minimum Value:"+ min);
      System.out.println("Average:"+ avg);
    }
    else{
      System.out.println("No odd positive numbers found");
    }
  }
}


2)

import java.util.Scanner;
public class lab1 {
  public static void main(String[] args) {
    System.out.println("Enter Number 1");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    System.out.println("Enter Number 2");
    int num2 = sc.nextInt();
    int max = 0;
    int min = 0;
    int count = 0;
    if (num1>num2) {
      max = num1;
      min = num2;
    }
    else{
      max = num2;
      min = num1;
    }
    for (int i = min; i <= max; i++) {
      if (i > 1) {
        boolean b1 = true;
        for (int j = 2; j < i; j++) {
          if (i % j == 0){
            b1 = false;
            break;
          }
        }
        if (b1) {
          count++;
        }
      }
    }
    System.out.println("There are " + count + " prime numbers between " + min + " and " + max);
  }
}

3)

import java.util.Scanner;
public class lab1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Number 1");
    String s1 = sc.nextLine();
    System.out.println("Enter Number 2");
    String s2 = sc.nextLine();
    String s3 = s1+ " " + s2;
    int sum = 0;
    for(int i =0; i<s3.length(); i++){
      char ch = s3.charAt(i);
      if((ch>='a' && ch<='z'|| ch>='A' && ch<='Z')){
        sum+=(int)ch;
      }
    }
    System.out.println(s3);
    System.out.println(sum);
  }
}

4)

import java.util.Scanner;
public class lab1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter String");
    String s1 = sc.nextLine();
    String s2 = "";
    for(int i =0; i<s1.length(); i++){
      char ch = s1.charAt(i);
      if((ch>='a' && ch<='z')){
        s2+=(char)(ch-1);
      }
      if(ch=='a'){
        s2+='z';
      }
    }
    System.out.println(s2);
  }
}

5)

import java.util.Scanner;
public class lab1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the length of the array");
    int length = sc.nextInt();
    int [] arr1 = new int[length];
    for(int i =0;i<length;i++){
      arr1[i] = sc.nextInt();
    }
    for(int i= 0;i<length/2;i++){
      int temp = arr1[i];
      arr1[i] = arr1[length-1-i];
      arr1[length-1-i] = temp;
    }
    for(int i =0;i<length;i++){
      System.out.print(arr1[i]+ " ");
    }
    System.out.println();     
  }
}

6)

import java.util.Scanner;
public class lab1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int [] num1= new int[num];
    for(int i=0;i<num;i++) {
      System.out.println("Enter Numbers");
      num1[i] = sc.nextInt();
    }
    for(int i =0;i<num;i++){
      int count = 1;
      for(int j =0;j<i;j++) {
        if (num1[i] == num1[j]) {
          count = 0;
        }
      }
      if(count!=0){
        for(int k=i+1;k<num;k++){
          if(num1[i]==num1[k]){
            count++;
          }
        }
        System.out.println(num1[i]+ "="+count+"times");
      }
    }
  }
}

7)

import java.util.Scanner;
public class lab1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    double [] num1= new double[num];
    for(int i=0;i<num;i++) {
      System.out.println("Enter Numbers");
      num1[i] = sc.nextDouble();
    }
    double[] num2 = new double[num];
    int count = 0;
    System.out.println("New Array");
    for(int i =0;i<num;i++){
      if(i==0 || num1[i]!=num1[i-1]){
        num2[count]=num1[i];
        count++;
      }
    }
    for(int i =0;i<count;i++) {
      System.out.print(num2[i]+ " ");
    }
    System.out.println();
    int newCount = num-count;
    System.out.println("Removed elements: "+newCount);
  }
}


8)

import java.util.Scanner;
public class lab1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row");
    int row = sc.nextInt();
    System.out.println("Enter Column");
    int col = sc.nextInt();
    int[][] arr1 = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.println("Enter Numbers");
        arr1[i][j] = sc.nextInt();
      }
    }
    System.out.println("2d array");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr1[i][j] + " ");
      }
      System.out.println();
    }
    int[] arr2 = new int[row*col];
    int count =0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        arr2[count] = arr1[i][j];
        count++;
      }
    }
    System.out.println("1d array");
    for (int i = 0; i < row*col; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println(); 
  }  
}



9)

import java.util.Scanner;
public class lab1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int rc = sc.nextInt();
    int[][] arr1 = new int[rc][rc];
    for (int i = 0; i < rc; i++) {
      for (int j = 0; j < rc; j++) {
        System.out.println("Enter Numbers");
        arr1[i][j] = sc.nextInt();
      }
    }
    boolean b1 = true;
    for (int i = 0; i < rc; i++) {
      for (int j = 0; j < rc; j++) {
        if(i==j){
          if(arr1[i][j]!=1){
          b1=false;
          break;
        }
       }
        else{ 
          if(arr1[i][j]!=0){
          b1=false;
          break;
        }
      }
    }
      if(!b1){
        break;
      }
    }
      if(b1){
        System.out.println("Identity Matrix");
      }
      else{
        System.out.println("Not an Identity Matrix");
      }
    }
  }


10)

import java.util.Scanner;
public class lab1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr1 = {
      {0, 0, 10, 0, -1},
      {0, -1, 0, 0, -1},
      {-1, 0, -1, 0, 0},
      {0, -1, 7, 0, -1},
      {0, -1, 0, -1, 0}};
    System.out.println("Initial Map:");
    m1(arr1);
    int move = 5;
    int row = 3;
    int col = 2;
    int pr=row;
    int pc=col;
    for (int i = 1; i <=move; i++) {
      System.out.println("enter move " + i);
      String s1 = sc.nextLine();
      char c1 = s1.charAt(0);
      
      pr=row;
      pc=col;
      if (c1 == 'R') {
        col++;
      } else if (c1 == 'U') {
        row--;
      } else if (c1 == 'D') {
        row++;
      } else if (c1 == 'L') {
        col--;
      }
      if(row<0||row>=arr1.length||col<0||col>=arr1[0].length){
        System.out.println("Player fell outside the playing area. Game over!");
        break;
      } 
        arr1[pr][pc] = 0;
        if (arr1[row][col] == -1) {
        System.out.println("Player stepped on mine. Game Over!");
        break;
      } 
        if (arr1[row][col] == 10) {
        System.out.println("Treasure found. You win!");
       
        m1(arr1);
        return;
        
      }
         arr1[pr][pc]=0;
        arr1[row][col]=7;
      System.out.println("Current State");
      m1(arr1);
    }
    if (arr1[row][col]!=10){
      System.out.println("You have lost");
   }
  }
  public static void m1 (int[][]arr1) {
    for(int i=0;i< arr1.length;i++){
      for(int j=0;j<arr1[0].length;j++){
        System.out.print(arr1[i][j] + " ");
      }
      System.out.println();
    }
  }
}                           
                             
                        
