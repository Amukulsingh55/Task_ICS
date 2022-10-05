package com.infinite.code;


class Pizza{
int price;
String size;
int quantity;
Pizza(String size,int quantity){
    this.size=size;
    this.quantity=quantity;
    if (this.size.equals("Regular")){
        this.price=100;
    } else if (this.size.equals("Medium")) {
        this.price=250;
    }else{
        this.price=390;
    }
}
}
class Foodie{
    public int fId;
    public String fName;
    public String city;
    public long mobileNo;
    public double totalPrice;

    public Foodie(int fId, String fName, String city, long mobileNo) {
        this.fId = fId;
        this.fName = fName;
        this.city = city;
        this.mobileNo = mobileNo;
    }
    public void calculatePtotalPrice(Pizza[] pizzaList){
        for(Pizza pizza:pizzaList){
            totalPrice+=pizza.price+pizza.quantity;
        }
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
class SuperFoodie extends Foodie {
    public double discount;
     SuperFoodie(int fId, String fName, String city, long mobileNo,double discount) {
        super(fId, fName, city, mobileNo);

        this.discount = discount;
    }
    public void calculateTotalPriceWDiscount(Pizza[] pizzaList){
         this.calculatePtotalPrice(pizzaList);
         this.totalPrice-=totalPrice*(discount/100);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
class UltraFoodie extends SuperFoodie {

    public int rewardPoints;
    public UltraFoodie(int foodieId, String foodieName, String city, long mobileNo, double discount) {
        super(foodieId, foodieName, city, mobileNo, discount);
    }

    public void calculateTotalPriceWithRewardPoints(Pizza[] pizzaList) {
        this.calculateTotalPriceWDiscount(pizzaList);
        rewardPoints = (int)(totalPrice/10);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
    //respective getter and setter functions

}

public class PizzaExtends {
    public static void main(String[] args) {
        Pizza[] pizzaList1 = {new Pizza("Regular", 1), new Pizza("Medium", 2)};

        Foodie foodie = new Foodie(1, "Jacob", "NY", 3211425632l);
        foodie.calculatePtotalPrice(pizzaList1);
        System.out.println("Total cost for Foodie "+foodie.getfName()+": "+foodie.getTotalPrice());

        SuperFoodie superFoodie = new SuperFoodie(2, "Queenie", "Delhi", 6523413123l, 5);
        superFoodie.calculateTotalPriceWDiscount(pizzaList1);
        System.out.println("Total cost for SuperFoodie "+superFoodie.getfName()+": "+superFoodie.getTotalPrice());

        UltraFoodie ultraFoodie = new UltraFoodie(3, "Eddie", "London", 7432256735l, 9);
        ultraFoodie.calculateTotalPriceWithRewardPoints(pizzaList1);
        System.out.println("Total cost for UltraFoodie "+ultraFoodie.getfName()+": "+ultraFoodie.getTotalPrice()+" with Reward Points: "+ultraFoodie.getRewardPoints());
    }
}
