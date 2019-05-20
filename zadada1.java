package com.company;
// для выполнения этой задачи нужно реализация нужного порядка для двух массивов
// в это решения выдает последовательной вывод ранее введенных данных, но
// 1) при желании  можно сделать так, чтобы данные вводились вручную.
// 2) Одной функцийе.

public class zadada1
{
    public static void main(String[] args)
    {
        int temp;
        int A [] = {2, 3,4,5,6,7,8,9};
//        int B [10,8,6,4,2];

        for (int i = 0; i < A.length; i++)
        {
            for (int j = i + 1; j < A.length; j++)
            {
                if (A[i] < A[j])
                {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < A.length - 1; i++)
        {
            System.out.print(A[i] + ",");
        }
        System.out.print(A[A.length - 1]);
        int B []={2,4,6,8,10,12};

        for (int i = 0; i < B.length; i++)
        {
            for (int j = i + 1; j < B.length; j++)
            {
                if (B[i] < B[j])
                {
                    temp = B[i];
                    B[i] = B[j];
                    B[j] = temp;
                }
            }
        }
        System.out.println("Descending Order:");
        for (int i = 0; i < B.length - 1; i++)
        {
            System.out.print(B[i] + ",");
        }
        System.out.println(B[B.length - 1]);

    }
}
