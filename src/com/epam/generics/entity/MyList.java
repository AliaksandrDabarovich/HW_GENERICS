package com.epam.generics.entity;

import java.util.Comparator;

public interface MyList<T> {
    void add(T obj);
    void add(int index, T obj);
    void remove();
    void remove(int index);
    void sort();
    void sort(Comparator<T> comparator);
}
