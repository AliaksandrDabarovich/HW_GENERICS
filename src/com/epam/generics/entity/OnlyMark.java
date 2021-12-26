package com.epam.generics.entity;

import java.util.Objects;

public class OnlyMark<T extends Number> implements Comparable<OnlyMark<T>> {
    private T value;

    public OnlyMark(T value) {
        this.value = value;
    }

    public OnlyMark() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlyMark)) return false;
        OnlyMark<?> onlyMark = (OnlyMark<?>) o;
        return Objects.equals(getValue(), onlyMark.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "OnlyMark{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(OnlyMark<T> o) {
        double m1 = value.doubleValue();
        double m2 = o.getValue().doubleValue();
        return (int) (m1 - m2);
    }
}
