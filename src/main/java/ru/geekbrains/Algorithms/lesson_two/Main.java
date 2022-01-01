package ru.geekbrains.Algorithms.lesson_two;


public class Main {

    public static void main(String[] args) {
        Array array = new Array(1,2,3,4,5);

        System.out.println(array);

        array.delete(0);
        array.delete(1);


        System.out.println(array);

    }
}
