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

    private static int findMin(int... arr){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(0, -1223, 8, 3, -567));
    }
}
