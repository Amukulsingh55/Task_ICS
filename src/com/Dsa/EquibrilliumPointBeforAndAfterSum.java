package com.Dsa;

public class EquibrilliumPointBeforAndAfterSum {
    public static void main(String[] args) {
        int arr[]={1,6,7,0,7};
        int n=arr.length;
        int Tsum=0;
        for(int val:arr){
            Tsum+=val;
        }
        int tempSum=0;
        for(int val=0;val<n;val++){
            Tsum=Tsum-arr[val];
            if(Tsum==tempSum){
                System.out.println(val);
                break;
            }
            tempSum+=arr[val];


        }
    }
}
