package com.infinite.code;

import java.util.ArrayList;
import java.util.List;

public class LongestStringInArrayList {
    
        public static void main(String[] args) {
            ArrayList nameList = new ArrayList();
            nameList.add("Harrison");
            nameList.add("Sirius");
            nameList.add("James");
            nameList.add("Lily");
            nameList.add("Cho");
            nameList.add("Hermione");
            findLongestString(nameList);
        }

        public static void findLongestString(List<String> list) {
            String longest = "";
            for (String object : list) {
                if(object.length() > longest.length()) //Line1
                    longest = object;
            }
            System.out.println("The string having the maximum length is "+ longest);
        }
    }

