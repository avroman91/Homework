package com.lesson14.task2;

public class Helper {

    private String key;
    private int count;

    public Helper(String word, int count) {
        this.key = word;
        this.count = count;
    }

    public String getWord() {
        return key;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Helper{" +
                "URL : '" + key + '\'' +
                ", count=" + count +
                '}';
    }
}