package com.infinite.code;
import java.util.Arrays;
public class Problem1 {

    public static void main(String[] args) {
        ArraysFunction();

    }

    static void ArraysFunction() {
        int[] numArr = {6, 8, 9, 10, 40, 66};
        int resultIndex = Arrays.binarySearch(numArr, 50);
        System.out.println("resultIndex = " + resultIndex);
        int[] numArr1 = {6, 8, 9, 10, 40, 66};
        int[] numArr2 = {6, 8, 9, 10, 40, 66};
        boolean resultCompare = Arrays.equals(numArr1, numArr2);
        System.out.println(resultCompare); //prints true or false
        int[] numArr3 = {20, 5, 30, 50, 10, 8};
        Arrays.sort(numArr3);
        for (int a : numArr3) {
            System.out.print(a + " ");
        }
    }

}
class Problem{
    public static void main(String[] args) {
        String[] pizzaSize = {"Regular", "Medium", "Large"};
        int[] pizzaCost = {100, 250, 390};

        String[] pizzaOrdered = {"Medium", "Regular"};
        int[] quantityOrdered = {2, 1};

        float totalAmount = 0f;
        for(int index1 = 0; index1 < pizzaOrdered.length ; index1++) {
            for(int index2 = 0; index2 < pizzaSize.length ; index2++) {
                if ( pizzaOrdered[index1] == pizzaSize[index2] ) {
                    totalAmount += pizzaCost[index2] * quantityOrdered[index1];
                }
                else {
                    totalAmount += 0;
                }
            }
        }
        //5% Discount
        totalAmount = totalAmount - (totalAmount*(float)5/100);
        System.out.println("Your total bill amount is: "+totalAmount);


    }


}