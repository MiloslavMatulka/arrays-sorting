package org.example.arrayssorting;

public class ArraysSorting {

    public static void bubbleSort(int[] ints) {
        int comparisonsToMake = ints.length - 1;
        int temp;
        for (int i = 0; i < ints.length - 1; ++i) {
            for (int j = 0; j < comparisonsToMake; ++j) {
                if (ints[j] > ints[j + 1]) {
                    temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
            --comparisonsToMake;
        }
    }

    public static void insertionSort(int[] ints) {
        int i = 1;
        int j;
        int temp;
        while (i < ints.length) {
            temp = ints[i];
            j = i - 1;
            while (j >= 0 && ints[j] > temp) {
                ints[j + 1] = ints[j];
                --j;
            }
            ints[j + 1] = temp;
            ++i;
        }
    }

    public static void printArray(int[] ints) {
        for (int i = 0; i < ints.length; ++i) {
            if (i == ints.length - 1) {
                System.out.print(ints[i]);
            } else {
                System.out.print(ints[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] ints1 = {5, 12, 6, 25, 0, 9, 4};
        bubbleSort(ints1);
        System.out.println("Bubble sort:");
        printArray(ints1);

        int[] ints2 = {5, 12, 6, 25, 0, 9, 4};
        insertionSort(ints2);
        System.out.println("Insertion sort:");
        printArray(ints2);
    }
}
