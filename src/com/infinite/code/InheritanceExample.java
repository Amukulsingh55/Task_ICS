package com.infinite.code;

public class InheritanceExample {
}

 class Customerm {
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
class RegularCustomer extends Customerm {
    private float discount;
    public RegularCustomer(String custId, String custName) {
        super(custId,custName);
        this.discount = 5.0f;
        System.out.println("Child Constructor");
    }
    public float getDiscount() {
        return discount;
    }
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public static void main(String[] args) {
        RegularCustomer regularCustomer = new RegularCustomer("C1010",
                "Johns Kora");
        regularCustomer.displayCustomerDetails();
    }

}

class A2{
    A2(int a){
        System.out.println("from A2 cons");
    }

}

class B2 extends A2 {
    B2(){
        super(5);
//       this(6);
        System.out.println("from B2");
    }

    B2(int a){
        super(5);
        System.out.println("from parameter");
    }

    public static void main(String[] args) {
        B2 obj = new B2();
    }
}

class C extends B2{

}