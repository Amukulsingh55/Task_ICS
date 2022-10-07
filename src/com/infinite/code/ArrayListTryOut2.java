package com.infinite.code;

import java.util.ArrayList;
import java.util.List;

class  Student1{
    private int studentId;
    private String StudentName;
    private boolean courseRegister;

    public Student1(int studentId, String studentName, boolean courseRegister) {
        this.studentId = studentId;
        StudentName = studentName;
        this.courseRegister = courseRegister;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public boolean getCourseRegister() {
        return courseRegister;
    }

    public void setCourseRegister(boolean courseRegister) {
        this.courseRegister = courseRegister;
    }

    public static void main(String[] args) {
        List<Student1> studentList=new ArrayList<Student1>();
        studentList.add(new Student1(1001,"Steve",true));
        studentList.add(new Student1(1002,"Rachel",false));
        studentList.add(new Student1(1003,"Monica",true));
        studentList.add(new Student1(1004,"David",true));

        List<String> studentNames = new ArrayList<String>();
        // Iteration of the studentList using for-each loop
        for(Student1 student:studentList){
            studentNames.add(student.getStudentName());
            System.out.println("Student ID : "+student.getStudentId());
            System.out.println("Student Name : "+student.getStudentName());
            System.out.println("Course Registered : " + student.getCourseRegister());
        }
        System.out.println("Student Names : " + studentNames);
    }
}
public class ArrayListTryOut2 {

}
