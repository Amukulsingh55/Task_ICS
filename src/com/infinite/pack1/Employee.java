package com.infinite.pack1;

import java.util.*;


class Employees {
   private int empId;
    String empName;
    int empAge;
    String empAddress;
   private String  Department;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empAddress='" + empAddress + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }


}
class Department {
    private String deptName;
     private int deptId;

    public Department() {
        super();
    }

    public int getDeptId() {
        return deptId;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Department(String deptName, int deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}

 public class Employee{
    public static  void main(String[] args){
        Employees emp=new Employees();
        Department dep=new Department();
        emp.setEmpId(1030289);
        emp.setEmpName("MUKUL SINGH");
           emp.setEmpAddress("Banglore");
           emp.setEmpAge(25);
          emp.setDepartment("Software Developer");
        dep.setDeptId(1);
        dep.setDeptName("Software developer");
        System.out.println(emp.toString()+ dep.toString());
    }
}