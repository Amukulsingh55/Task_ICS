package com.infinite.code;

public class StringClass {
    public static void main(String[] args) {
        String name="Oliver";
        name.concat("Carter");
        System.out.println(name);
        System.out.println("-----------------");
        StringBuilder str=new StringBuilder();
        str.append(" Oliver ");
        str.append(" Carter ");
        System.out.println(str);





    }

}
class Character1{
    public Character1(char a) {

    }

    public static void main(String[] args) {
        Character alphaObj='A';
        Character digitObj = '5';
        boolean result1 = Character.isDigit(digitObj); // Output :- true
        System.out.println(result1);
        boolean result2 = Character.isUpperCase(alphaObj); // Output :- true
        System.out.println(result2);
        String val = alphaObj.toString(); // val = "A"
        System.out.println(val);
        char beta = alphaObj.charValue(); // beta = 'A'
        System.out.println(beta);
        char c = Character.toLowerCase('B'); // c = 'b';
        System.out.println(c);
    }
}