package com.company;
// решения это задачи нужно демонстрация того, как себя будет вести себя функция в определенных языках программирования
// для этого я испоьзовал Java 
//        задача выглядит след., образом !!
// Функция Ф (А)
//   Рез = 1;
//   Для Инд = 2 По А Цикл
//     Рез = Рез * Инд;
//   КонецЦикла;
//   Возврат Рез;
//  КонецФункции

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
