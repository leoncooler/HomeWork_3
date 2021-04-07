import java.util.Arrays;
/* Задания 3 и 5 практически слизал, туго доходит)) Задания со звездочками даже не стал смотреть.*/
public class HomeWork_3 {
    public static void main(String args[]) {

        CangeNumbers();
        FillInNumbersUpTo100();
        less_than_6_times2();
        fillDiagonal();
        AcceptingTwoArguments(2,3);

    }
    /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0; */

    public static void CangeNumbers() {

        int[] numb = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] == 0) {
                numb[i] = 1;
            } else {
                numb[i] = 0;
            }
            System.out.println(Arrays.toString(numb));

        }
        System.out.println("");
    }

    /* 2.	Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    значениями 1 2 3 4 5 6 7 8 … 100 */
    public static void FillInNumbersUpTo100() {

        int[] arr = new int[101];
        for (int i = 0; i < 101; i++) {
            arr[i] = i + 1;
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println();
    }

    /* 3.	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2 */
    public static void less_than_6_times2() {

        int[] arrst = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrst.length; i++) {
            if (arrst[i] < 6) {
                arrst[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrst));
        System.out.println();
    }

    /* 4.	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
    public static void fillDiagonal() {
        int[][] diagon = new int[9][9];
        for (int i = 0; i < diagon.length; i++) {
            for (int j = 0; j < diagon.length; j++) {
                if (i == j) {
                    diagon[i][j] = 1;
                }
            }
                    for (int j = diagon[i].length - 1; j >=0; j--) {
                    if (i + j == diagon.length -1) {
                        diagon[i][j] = 1;
                        System.out.println(Arrays.toString(diagon[i]));
                        System.out.println();
                    }
                }
            }
        }
        /* 5.	Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue; */

    public static int[] AcceptingTwoArguments(int len, int initialValue)
    {
        int[] result = new int[len];

        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
            System.out.print(len + "  ");
        }

         return result;


    }

    }
















