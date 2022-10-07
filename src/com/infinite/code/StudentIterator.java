package com.infinite.code;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentIterator {
    private int studentId;
    private String studentName;
    private boolean courseRegistered;

    public StudentIterator(int studentId, String studentName, boolean courseRegistered) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseRegistered = courseRegistered;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean getCourseRegistered() {
        return courseRegistered;
    }

    public void setCourseRegistered(boolean courseRegistered) {
        this.courseRegistered = courseRegistered;
    }

    public static void main(String[] args) {
        List<StudentIterator> studentList=new ArrayList<StudentIterator>();
        studentList.add(new StudentIterator(1001,"Enna",true));
        studentList.add(new StudentIterator(1002,"Meena",true));
        studentList.add(new StudentIterator(1003,"Deeca",true));

        //creating listiterator object
        ListIterator<StudentIterator> itrr= studentList.listIterator();
        //displaying studentName in forward direction
        while (itrr.hasNext()){
            System.out.println(itrr.next().getStudentName());
        }
        System.out.println("=================================");
        while (itrr.hasPrevious()){
            System.out.println(itrr.previous().getStudentName());
        }
    }
}
