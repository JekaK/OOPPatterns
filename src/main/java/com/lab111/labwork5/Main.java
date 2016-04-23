package com.lab111.labwork5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by kruku on 11.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        CustomList customList = new CustomList();

        customList.add(1);
        customList.add(5);
        customList.add(2);
        customList.add(4);
        customList.add(3);
        customList.add(0);
        Iterator iterator = customList.sortedIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
