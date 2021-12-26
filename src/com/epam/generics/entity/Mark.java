package com.epam.generics.entity;

import java.io.Serializable;
import java.util.Objects;

public class Mark <T1, T2> implements Serializable {
    private T1 subject;
    private T2 markValue;

    public Mark(T1 subject, T2 markValue) {
        this.subject = subject;
        this.markValue = markValue;
    }

    public T1 getSubject() {
        return subject;
    }

    public void setSubject(T1 subject) {
        this.subject = subject;
    }

    public T2 getMarkValue() {
        return markValue;
    }

    public void setMarkValue(T2 markValue) {
        this.markValue = markValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mark)) return false;
        Mark<?, ?> mark = (Mark<?, ?>) o;
        return Objects.equals(getSubject(), mark.getSubject()) &&
                Objects.equals(getMarkValue(), mark.getMarkValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubject(), getMarkValue());
    }

    @Override
    public String toString() {
        return "Mark{" +
                "subject=" + subject +
                ", markValue=" + markValue +
                '}';
    }
}
