package com.lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1, 3, 5));
        lists.add(Arrays.asList(1, 3, 7));
        lists.add(Arrays.asList(2, 2, 3, 6));

        Iterator iterator = new Iterator(lists);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // 1, 1, 2, 2, 3, 3, 5, 6, 7
    }
}