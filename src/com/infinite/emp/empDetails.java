package com.infinite.emp;

import java.util.Scanner;

public class empDetails {
    private String name;
    String yoj;
    double salary;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYoj() {
        return yoj;
    }

    public void setYoj(String yoj) {
        this.yoj = yoj;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        empDetails[][] emp=new empDetails[4][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i< emp.length;i++){
            for(int j=0;j< emp[0].length;j++){
                emp[i][j]=new empDetails();
            }
        }

        for(int i=0;i< emp.length;i++){
                emp[i][0].setName(sc.next());
                emp[i][1].setYoj(sc.next());
                emp[i][2].setAddress(sc.next());

        }
        for(int i=0;i< emp.length;i++){
            System.out.print(emp[i][0].getName()+"\t\t");
            System.out.print(emp[i][1].getYoj()+"\t\t");
            System.out.print(emp[i][2].getAddress()+"\t\t");
            System.out.println();
        }

    }
}
