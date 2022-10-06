package com.infinite.code;
class MobileShopee{
    static int stockAvailable = 700;
    public static void checkStock(int quantityRequired) throws Exception{
        if(stockAvailable < quantityRequired)
            throw new Exception("There is not enough stock available.");
        System.out.println("Please proceed to the check-out");
    }
    public static void buyMobiles(int quantityRequired) throws Exception{
        checkStock(550);
        System.out.println("Please pay for the items in your cart.");
    }
    public static void main(String[] args) {
        try{
            buyMobiles(550);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
//class MobileShopee {
//    static int stockAvailable = 400;
//    public static void checkStock(int quantityRequired) throws Exception{
//        if(stockAvailable < quantityRequired)
//            throw new Exception("There is not enough stock available.");
//        System.out.println("Please proceed to the check-out");
//    }
//    public static void buyMobiles(int quantityRequired) {
//        try{
//            checkStock(550);
//            System.out.println("Thank you for shopping at MobileShopee");
//        } catch(Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//    public static void main(String[] args) {
//        buyMobiles(550);
//    }
//}
public class ExceptionTry1 {

}
