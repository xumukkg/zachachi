package com.company;

public class Main {
    public static int fun(int A){
        int res = 1;
        for (int ind = 2; ind<A; ind++) {
            res = res * ind;


        }
        return res;
    }
    public static void main( String[] args) {
        // write your code here

        int temp = fun(3);
        System.out.println(temp);

    }
}