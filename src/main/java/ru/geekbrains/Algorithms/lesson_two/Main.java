package ru.geekbrains.Algorithms.lesson_two;


public class Main {

    public static void main(String[] args) {
        Array array = new Array(5,1,2,3,4,5,5);

        System.out.println(array);
        array.deleteAll();

        System.out.println(array);
    }
}
