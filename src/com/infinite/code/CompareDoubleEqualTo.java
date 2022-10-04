package com.infinite.code;
class Address {

    private String doorNo;
    private String street;

    public Address(String doorNo, String street) {
        this.doorNo = doorNo;
        this.street = street;
    }

    public String getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}

class Tester4 {

    public static void main(String[] args) {
        Address addressOne = new Address("11","Oxford Street");
        Address addressTwo=new Address("11","Oxford Street");

        //The equality of two objects are being checked using == operator
        if (addressOne == addressTwo) {
            System.out.println("The address objects are same!");
        } else {
            System.out.println("The address objects are different!");
        }
    }
}
//equals method
class Addres {

    private String doorNoo;
    private String streett;

    public Addres(String doorNoo, String streett) {
        this.doorNoo = doorNoo;
        this.streett = streett;
    }

    public String getDoorNoo() {
        return doorNoo;
    }
    public void setDoorNoo(String doorNoo) {
        this.doorNoo = doorNoo;
    }

    public String getStreett() {
        return streett;
    }

    public void setStreett(String streett) {
        this.streett = streett;
    }


    @Override
    public boolean equals(Object addres) {
        Addres otherAddress=(Addres) addres;
        if(this.doorNoo.equals(otherAddress.doorNoo) && this.streett.equals(otherAddress.streett))
            return true;
        return false;
    }
    @Override
    public int hashCode() {
        return 1+doorNoo.hashCode()+streett.hashCode();
    }

}

class Testerrr {

    public static void main(String[] args) {
        Addres addressOne = new Addres("11","Oxford Street");
        Addres addressTwo=new Addres("11","Oxford Street");

        //The equality of two objects are being checked using equals() method
        if (addressOne.equals(addressTwo)) {
            System.out.println("The address objects are same!");
        } else {
            System.out.println("The address objects are different!");
        }
        /*
		    Compare the following input with the addressOne and see the result
		    Address addressTwo=new Address("11","Hillview Street");
		*/


    }
}
    public class CompareDoubleEqualTo {

}
