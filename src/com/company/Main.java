package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {1, 2, 3, 3, 9, 11, 15};
        int[] array3 = combine(array1, array2);
        printArray(array3);


    }

    public static int[] combine(int[] array1, int[] array2) {
        int index = 0;
        int j = 0;
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) { //
            while (j < array2.length) {         //проверяем, есть ли во втором массиве числа меньше лиюо равных текущему элементу из первого массива
                if (array1[i] >= array2[j]) {
                    array3[index] = array2[j];  // добавляем эти числа в общий массив
                    j++;
                    index++;
                } else break;
            }
            array3[index] = array1[i];      // добавляем текущий элемент из 1го массива в общий
            index++;
        }
        while (j < array2.length) {         // если во втором массиве остались неохваченные элементы, добавляем все в конец общего массива
            array3[index] = array2[j];
            j++;
            index++;
        }
        return array3;
    }

    public static void printArray(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}