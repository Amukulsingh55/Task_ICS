package com.infinite.code;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTryOut {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("Bross");
        names.add("Ross");
        names.add("Steve");
        names.add("Rachel");
        names.add("steve");
        //checking empty arraylist or not
        if(names.isEmpty()){

            System.out.println("No names are present!!");
        }
        //Display number of names in the
        for(String name:names){
            System.out.println(name);
        }
        List<String> newNames=new ArrayList<String>();
        newNames.add("Emily");
        newNames.add("Melissa");

        names.addAll(newNames);
        //Display all names
        System.out.println("Display all names");
        System.out.println("-------------------------");
        for(String name:names){
            System.out.println(name);
        }
        //names Ross  is present or not in list
        System.out.println("-------------------------");

        if(names.contains("Ross")){
            System.out.println("Name is already present ");
        }
         //Converting List to Array
        Object[] namesArray = names.toArray();
    }
}
