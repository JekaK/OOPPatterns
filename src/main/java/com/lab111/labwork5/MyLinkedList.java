package com.lab111.labwork5;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Eugeniy Krukun on 21.04.2016.
 */
public class MyLinkedList implements Iterable<Integer> {
    private ListElement head;
    private ListElement tail;
    private ListElement itr;
    private ListElement el;
    private int count = 0;

    public void addFront(Integer data) {
        ListElement a = new ListElement();
        a.data = data;
        if (head == null) {
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
        count++;
    }

    public void addBack(Integer data) {
        ListElement a = new ListElement();
        a.data = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
        count++;
    }


    public void delEl(Integer data) {
        if (head == null) {

            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            count = 0;
            return;
        }

        if (head.data == data) {
            head = head.next;
            count--;
            return;
        }

        ListElement t = head;
        while (t.next != null) {
            if (t.next.data == data) {
                if (tail == t.next) {
                    tail = t;
                }
                t.next = t.next.next;
                count--;
                return;
            }
            t = t.next;
        }
    }

    public ListElement getHead() {
        return head;
    }

    public MyLinkedList sort() {
        Integer[] mass = new Integer[count];
        ListElement el = head;
        int i = 0;
        while (el != null) {
            mass[i] = el.data;
            i++;
            el = el.next;
        }
        Arrays.sort(mass);
        MyLinkedList linkedList = new MyLinkedList();
        for (Integer j : mass) {
            linkedList.addBack(j);
        }
        return linkedList;
    }

    public Iterator sortedIterator() {
        MyLinkedList linkedList = sort();
        el = linkedList.getHead();
        return new MyIterator() {
            @Override
            public boolean hasNext() {
                if (el != null) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                if (this.hasNext()) {
                    int i = el.data;
                    el = el.next;
                    return i;
                }
                return null;
            }
        };
    }

    @Override
    public Iterator iterator() {
        itr = head;
        return new MyIterator() {
            @Override
            public boolean hasNext() {
                if (itr != null) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                if (this.hasNext()) {
                    int i = itr.data;
                    itr = itr.next;
                    return i;
                }
                return null;
            }
        };
    }
}