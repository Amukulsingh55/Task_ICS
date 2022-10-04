package com.infinite.code;

public class DynamicBinding {
    public static void main(String[] args) {
        RegularCustome regCust1 = new RegularCustome();
        RegularCustome regCust2 = new RegularCustome();
        PremiumCustomer premCust1 = new PremiumCustomer();

        showCustomerDetails(regCust1);
        showCustomerDetails(premCust1);
        showCustomerDetails(regCust2);
    }

    public static void showCustomerDetails(Custome custome) {
        custome.display();
    }
}

class Custome {
    public void display() {
        System.out.println("Customer is coming...");
    }
}

class RegularCustome extends Custome {
    @Override
    public void display() {
        System.out.println("A regular customer has come");
    }
}

class PremiumCustomer extends Custome {
    @Override
    public void display() {
        System.out.println("A premium customer has come");
    }
}
