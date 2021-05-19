package com.lesson12;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

    private List<Integer> listForOut = new ArrayList<>();
    private int internalCounter = 0;

    public Iterator(List<List<Integer>> lists) {

        for (int i = 0; i < lists.size(); i++) {
            int counterListOne = 0;
            int counterListTwo = 0;
            while (i == 0) {
                if ((counterListTwo == lists.get(1).size() && counterListOne < lists.get(0).size()) || counterListOne < lists.get(0).size() && lists.get(0).get(counterListOne) <= lists.get(1).get(counterListTwo)) {
                    listForOut.add(lists.get(0).get(counterListOne));
                    counterListOne++;
                } else if ((counterListOne == lists.get(0).size() &&counterListTwo < lists.get(1).size()) || counterListTwo < lists.get(1).size() && lists.get(1).get(counterListOne) >= lists.get(1).get(counterListTwo)) {
                    listForOut.add(lists.get(1).get(counterListTwo));
                    counterListTwo++;
                } else {
                    i += 2;
                    counterListOne = 0;
                    counterListTwo = 0;
                }
            }
            while (true) {
                if (counterListTwo < lists.get(i).size() && counterListOne < listForOut.size() && listForOut.get(counterListOne) < lists.get(i).get(counterListTwo)) {
                    counterListOne++;
                } else if (counterListOne == listForOut.size() ||
                        counterListTwo < lists.get(i).size() && counterListOne < listForOut.size()
                                && counterListTwo < lists.get(i).get(counterListTwo) && listForOut.get(counterListOne) >= lists.get(i).get(counterListTwo)) {
                    listForOut.add(counterListOne, lists.get(i).get(counterListTwo));
                    counterListTwo++;
                } else {
                    break;
                }
            }

        }


    }


    public boolean hasNext() {
        return internalCounter < listForOut.size();
    }

    public Integer next() {
        int integerFromList = listForOut.get(internalCounter);
        internalCounter++;
        return integerFromList;
    }

}