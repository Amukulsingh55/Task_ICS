package com.infinite.code;

public class Customerm {
    private String customerId;
    private String customerName;

    public Customerm() {
        System.out.println("Parent Default Constructor");
    }

    public Customerm(String customerId, String customerName) {
        System.out.println("from param con");
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void displayCustomerDetails() {
        System.out.println("Displaying customer details \n***************************");
        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println();
    }
}
