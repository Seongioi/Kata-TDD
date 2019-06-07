package com.example.service;

import java.util.ArrayList;

class StringCalculator {

    int add(String arguments) {
        boolean negatives = false;
        ArrayList<Integer> negs = new ArrayList<>();
        if(arguments.length() > 0){
            String delim = "";
            if(arguments.charAt(0) == '/') {
                delim = arguments.charAt(2) + "";
                arguments = arguments.substring(4);
            }
            else {
                delim = "[,\n]";
            }
                String[] nums = arguments.split(delim);
                int sum = 0;
                for(String n: nums) {
                    if(Integer.parseInt(n) < 0){
                        negatives = true;
                        negs.add(Integer.parseInt(n));
                    }
                    sum += Integer.parseInt(n);
                }
                if (negatives){

                    System.out.println("negative numbers not allowed " + negs);
                    throw new RuntimeException("negative numbers not allowed " + negs);
                }
                return sum;
            } else {
                return 0;
        }
    }
}
