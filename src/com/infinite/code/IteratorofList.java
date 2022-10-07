package com.infinite.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorofList {
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<String>();
        nameList.add("Enna");
        nameList.add("Meena");
        nameList.add("Deeca");
        nameList.add("Teeka");
        //getting Iterator object
        Iterator<String> itr=nameList.iterator();
//        for (Iterator<String> it=itr;it.hasNext();) {
//            System.out.println(it.next());
//        }
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        System.out.println("-------------------------------------");
        List<String> nameList1 = new ArrayList<String>();
        nameList1.add("Harrison");
        nameList1.add("Sirius");
        nameList1.add("James");


//iterating using listIterator()
//Getting ListIterator object
        ListIterator<String> literator = nameList1.listIterator();

//iterating in forward direction
        while(literator.hasNext()) {
            System.out.println(literator.next());
        }
//iterating in reverse direction
        while(literator.hasPrevious()) {
            System.out.println(literator.previous());
        }
    }
}
