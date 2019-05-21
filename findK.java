package com.company;
public class findK
{
    // Function to ind missing number 
    public static int getNumber (int a[], int n)
    {
        int i, total;

        total  = (n+1)*(n+2)/2;

        for ( i = 0; i< n; i++)
            total -= a[i];
        return total;
    }


    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6,8,9,10};
        int miss = getNunmber(a,9);
//        не забудьте ввести количества элементов в массиве, т.е. n
        System.out.println(miss);
    }
} 