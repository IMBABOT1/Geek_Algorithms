package ru.geekbrains.Algorithms.lesson_three;

public class CharacterStack {
    private char[] stack;
    private int head;

    public int size;

    public CharacterStack(int size){
        this.stack = new char[size];
        this.head = - 1;
        this.size = 0;
    }




    public boolean isEmpty() {
        return head == -1;
    }


    public void push(char value) {
        //stack[++head] = value;
        stack[++head] = value;
        ++size;

    }

    public char pop() {
        //if (!isEmpty()) return stack[head--];
        char val;
        try {
            val = stack[--head];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Stack is Empty");
        }
        return val;
    }


    public int peek() {
        //if (!isEmpty()) return stack[head];
        char val;
        try {
            val = stack[head];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Stack is Empty");
        }
        return val;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.length; i++) {
            sb.append(stack[i]);
        }

        return sb.toString();
    }
}
