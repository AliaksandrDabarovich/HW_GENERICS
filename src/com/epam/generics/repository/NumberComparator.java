package com.epam.generics.repository;

import com.epam.generics.entity.OnlyMark;

import java.util.Comparator;

public class NumberComparator<T extends OnlyMark<?>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        OnlyMark<?> o11 = o1;
        OnlyMark<?> o22 = o2;
        return (int) (o11.getValue().doubleValue() - o22.getValue().doubleValue());
    }
}
