package com.infinite.emp;

import java.util.Scanner;

class Answer {
    private String name;
    private Double costPerDay;
    private Double deposit;

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     Double getCostPerDay() {
        return costPerDay;
    }

     void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

     Double getDeposit() {
        return deposit;
    }

     void setDeposit(Double deposit) {
        this.deposit = deposit;
    }
    void display(){
        System.out.println("Item name : "+name);
        System.out.println("Enter the cost per day  :"+String.format("%.2f",costPerDay));
        System.out.println("Enter the item Name :"+String.format("%.2f",deposit));

    }

}
public class Items{

    public static void main(String[] args) {
        Answer ans=new Answer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item Name :");
        String name=sc.nextLine();
        System.out.println("Enter the items costs per day:");
        double costPerDay=sc.nextDouble();
        System.out.println("Enter the Deposit :");
        double deposit =sc.nextDouble();
        ans.setName(name);
        ans.setCostPerDay(costPerDay);
        ans.setDeposit(deposit);
        ans.display();

    }
}