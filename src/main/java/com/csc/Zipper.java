package com.csc;

import java.util.ArrayList;
import java.util.List;

public class Zipper {

    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int minLength = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minLength; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }

        if (list1.size() > minLength) {
            mergedList.addAll(list1.subList(minLength, list1.size()));
        } else if (list2.size() > minLength) {
            mergedList.addAll(list2.subList(minLength, list2.size()));
        }

        return mergedList;
    }
}
