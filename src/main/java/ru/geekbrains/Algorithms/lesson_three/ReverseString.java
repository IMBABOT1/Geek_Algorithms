package ru.geekbrains.Algorithms.lesson_three;

import java.util.Stack;

public class ReverseString {

    private Stack<String> stack;

    public ReverseString(){
        stack = new Stack<>();
    }

    public void reverse(String str){
        String[] arr = str.split("");

        for (int i = 0; i < str.length() ; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < str.length() ; i++) {
            System.out.print(stack.pop());
        }
    }
}
