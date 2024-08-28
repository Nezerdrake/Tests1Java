/**
 * многострочный комментарий
 * Примитивы: byte, short, int, long - целые числа; double, float - вещественные числа; char - одиночный символ; boolean - истинность
 * String - НЕ ПРИМИТИВ
 * var - неявная типизация (подставится наиболее вероятный тип)
 * Обертки: int - Integer, char - Character, остальные просто с Большой Буквы
 * Операции: присваивание: =
 *           Арифметика: +, -, *, /. ++ и -- это +1 и -1 соответственно.
 *           Сравнение: <, >, ==, !=, >=, <=
 *           Логика: || (или), && (и), ! (не), ^ (Исключение - Возвращает true, если один и только один из операндов равен true. Возвращает false, если оба операнда равны true или false)
 *           Побитовые: <<, >>, %, |, ^
 *
 *
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s = 123;
        s = s-- - --s; // s = 2
        System.out.println(s);
        s =  123;
        s = --s-s--; // s = 0
        System.out.println(s);

        // int[] arr1 = new int[10];
        int[] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr1[3] = 10;
        System.out.println(arr1[3]);

        int[][] arr2 = new int[3][5];
        for(int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%d", arr2[i][j]);
            }
            System.out.println();
        }

        Functions_Tutorial.sayHi();
    }
}

