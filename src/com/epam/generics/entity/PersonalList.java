package com.epam.generics.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class PersonalList<T> implements MyList<T>, Serializable {
    private static final int DEFAULT_SIZE = 10;
    private Object[] personalList;
    private int order;

    public PersonalList() {
        personalList = new Object[DEFAULT_SIZE];
        order = 0;
    }

    @Override
    public void add(T obj) {
        if (personalList.length == DEFAULT_SIZE) {
            increaseArraySize(personalList.length * 2);
        }
        personalList[order] = obj;
        order++;
    }

    @Override
    public void add(int index, T obj) {
        if (personalList.length == DEFAULT_SIZE) {
            increaseArraySize(personalList.length * 2);
        }
        for (int j = order - 1; j >= index; j--) {
            personalList[j + 1] = personalList[j];
        }
        personalList[index] = obj;
    }

    @Override
    public void remove() {
        Object[] newPersonalList = new Object[order - 1];
        System.arraycopy(personalList, 0, newPersonalList, 0, order - 1);
        personalList = newPersonalList;
        order--;
    }

    @Override
    public void remove(int index) {
        for (int j = index; j != order; j++) {
            personalList[j] = personalList[j + 1];
        }
        Object[] newPersonalList = new Object[order - 1];
        System.arraycopy(personalList, 0, newPersonalList, 0, order - 1);
        personalList = newPersonalList;
        order--;
    }

    @Override
    public void sort() {
        Arrays.sort(personalList, 0, order);
    }

    @Override
    public void sort(Comparator comparator) {
        Arrays.sort(personalList, 0, order, comparator);
    }

    public void increaseArraySize(int newArraySize) {
        Object[] newPersonalList = new Object[newArraySize];
        System.arraycopy(personalList, 0, newPersonalList, 0, personalList.length);
        personalList = newPersonalList;
    }

    public Integer size() {
        return personalList.length;
    }

    public void print() {
        for (int i = 0; i < personalList.length; i++) {
            if (personalList[i] != null) {
                System.out.println(personalList[i]);
            }
        }
    }
}
