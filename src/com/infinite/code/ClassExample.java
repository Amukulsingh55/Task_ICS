package com.infinite.code;

public class ClassExample {
    int a;
    int b;
}
class Cons1{
    //if u provide any constructor then compiler
    //does not create Default constructor.
    Cons1(int a){

    }
    public static void main(String[] args) {
        Cons1 c=new Cons1(7);
    }
}
class Customer1{
    String name;
    int id;
    String contact_no;
    String address;
    //constructor
    public Customer1(){
        System.out.println("This is constructor");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(int a,String c){

    }
    public void display(int a,int b,String c){

    }
    public static void main(String[] args) {
        Customer1 c1 = new Customer1();
        c1.setName("harshada");
        c1.setId(12);
        c1.setContact_no("2354454");
        c1.setAddress("mumbai");
        System.out.println(c1.getName());
        System.out.println(c1.getId());

        c1.display(6,8,"hello");
        c1.display(6,"Infinite");

        Customer1 c2 = new Customer1();
        c2.setName("Daksh");
        c2.id = 10;
        c2.contact_no = "345435";
        c2.address = "delhi";
        System.out.println("c2.name = " + c2.name);
        System.out.println("c2.getContactNo() = " + c2.getContact_no());
        System.out.println("c2.getAddress() = " + c2.getAddress());
    }

}