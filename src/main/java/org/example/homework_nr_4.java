package org.example;

import javax.rmi.CORBA.Stub;

public class homework_nr_4 {

    public static void main(String[] args) {
        int[] name = new int[3];
        name[0] = 10;
        name[1] = 12;
        name[2] = 16;
        for (int index = 0; index != name.length; index++) {
            System.out.println(name[index]);
        }

        int[] array = new int[5];
        array[0] = 5;
        array[1] = 15;
        array[2] = 9;
        array[3] = 10;
        array[4] = 4;

        int sum = 0;

        for (int index = 0; index != array.length; index++) {
            sum += array[index];

        }

        System.out.println("Сумма элементов одномерного маассива равна:" + sum);
        System.out.println("Среднее значение элементов одномерного массива:" + sum / array.length);

        int[][] arrayTo = new int[][]{
                {1, 3, 5, 8, 2},
                {6, 4, 2, 9, 1},
                {4, 9, 5, 1, 8}
        };
        System.out.println(arrayTo.length);
        //Вывод всех чётных элементов массива
        for (int j = 0; j != arrayTo.length; j++) {
            for (int i = 0; i != arrayTo[j].length; i++) {
                if (arrayTo[j][i] % 2 == 0) {
                    System.out.println(arrayTo[j][i]);
                }
            }
        }
        //Вывод количества всех чётных элементов массива
        int even = 0;
        for (int j = 0; j != arrayTo.length; j++) {
            for (int i = 0; i != arrayTo[j].length; i++) {
                if (arrayTo[j][i] % 2 == 0) {
                    even++;
                }
            }
        }
        System.out.println("Количество четных чисел " + even);
        //Вывод количества всех нечётных элементов массива
        int count = 0;
        for (int j = 0; j != arrayTo.length; j++) {
            for (int i = 0; i != arrayTo[j].length; i++) {
                if (arrayTo[j][i] % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println("Количество нечетных чисел " + count);
    }
}
/*
        //ДЗ номер 6
        String[] stud = {"Alexei", "Max", "Pavel", "Vitalii", "Andrei"};
        String[] studCopy = new String[stud.length];

        for (int i = 0; i < stud.length; i++) {
            studCopy[i] = stud[i];
        }

        System.out.println("Исходный массив: " + stud);
        System.out.println("Копия массива: " + studCopy);
    }
}
*/


