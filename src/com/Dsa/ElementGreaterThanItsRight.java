package com.Dsa;

public class ElementGreaterThanItsRight {

    public static void main(String[] args) {
        int arr[]={14,15,8,9,5,2,1,1};
        int n=arr.length;

        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
               if (arr[j]>arr[i]){
                   break;
               }
               if(j==n-1) {
                   System.out.println(arr[i]);

               }
            }
            if(i==n-1){
                System.out.println(arr[i]);

            }
        }
    }
}
