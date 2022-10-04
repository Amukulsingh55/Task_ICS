package com.Dsa;

public class sortZeroOneTwo {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,2,1,2,0,0,0,1};

        int n=arr.length;
        int low=0,temp=0;
        int mid=0,high=n-1;
        while(mid<=high){
            switch(arr[mid]){
                //if element is 0
                case 0: {
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                //if element is 1
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            System.out.println("");
        }
    }
}
