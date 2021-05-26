package com.lesson14;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 123);
        System.out.println(list); // [10, 123, 30]
    }
}

