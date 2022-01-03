package ru.geekbrains.Algorithms.lesson_three;

import java.util.Stack;

public class CheckBrackets {

    public boolean checkBrackets(String exp) {
        if (exp.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char current = exp.charAt(i);
            if (current == '{' || current == '(' || current == '[' || current == '<') {
                stack.push(current);
            }

            if (current == '}' || current == ')' || current == ']' || current == '>') {
                if (stack.isEmpty()) {
                    return false;
                }

                char last = stack.peek();
                if (current == '}' && last == '{' ||
                        current == ')' && last == '(' ||
                        current == ']' && last == '[' ||
                        current == '>' && last == '<') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

