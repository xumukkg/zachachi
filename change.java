package com.company;
import java.util.Scanner;
public class change {

    public static void main (String[] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите значение А: ");
        int a = n.nextInt();
        Scanner m = new Scanner(System.in);
        System.out.println("Введите значение В: ");
        int b = m.nextInt();
            if (a>b) {
                a = a ^ b ^ (b = a);
            }
        System.out.println("Новые значения А и В соответственно ; "+ a + ", " + b);
    }
}
