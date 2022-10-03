package com.infinite.code;

public class StudentDetailsStaticExample {
    String name;
      static String Department;
     static int rollCount=0;
     //static block
     static{
         System.out.println("Inside static block");
         Department="CSE";
     }
     //Static method
    static void change(){
         rollCount++;
    }
    //constructor to intialize the variable
     StudentDetailsStaticExample(String studentName){
         change();
         name=studentName;
    }
    //display values
    void display(){
        System.out.println(rollCount+" "+name+" "+Department);
    }
    public static void main(String[] args) {
        StudentDetailsStaticExample student1=new StudentDetailsStaticExample("Mukul");
        student1.display();
        StudentDetailsStaticExample student2=new StudentDetailsStaticExample("Aditya");
        student2.display();
        StudentDetailsStaticExample student3=new StudentDetailsStaticExample("Aman");
        student3.display();
        StudentDetailsStaticExample student4=new StudentDetailsStaticExample("Shodh");
        //change department variable
        StudentDetailsStaticExample.Department="ECE";
        student4.display();
    }
}
