package ru.geekbrains.Algorithms.lesson_one;

public class Main {

    //O(n)
    private static int degree(int number, int degree){
        int result = 1;

        for (int i = 0; i < degree; i++) {
            result *= number;
        }

        return result;
    }

    //O(n)
    private static int findMin(int... arr){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    //O(n)
    private static double average(int[] arr){
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result / arr.length;
    }
}
