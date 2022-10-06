package com.infinite.code;

@FunctionalInterface
interface Calculator{

    //defining abstract method
    int doOperation(int num1, int num2);

    //defining default method
    default boolean checkValues(int num1, int num2) {
        return (num1>0 && num2>0);
    }
}
class Testert implements Calculator  {
    //implementing abstract method
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Testert();

        //executing default method
        System.out.println(calculator.checkValues(5, 6));
        //executing implemented abstract method
        System.out.println(calculator.doOperation(5, 6));
    }
}
public class FunctionalInterfaceCalc {
}
