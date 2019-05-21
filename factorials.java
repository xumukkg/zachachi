package com.company;
import java.util.Scanner;
public class factorials
{

    public static int func(int n)
    {
        System.out.println("Введите свое число:");
        Scanner m = new Scanner(System.in);
        n=m.nextInt();
        int res = 1, i;
        int sum =1;
        for (i=2; i<=n; i++)
        {res *= i;
        sum=sum*res;}
        return sum;
    }


    public static void main(String[] args)
    {
        System.out.println("Factorial "+ " is " + func(5));
    }
} 