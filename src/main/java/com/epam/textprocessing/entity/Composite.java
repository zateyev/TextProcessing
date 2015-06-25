package com.epam.textprocessing.entity;

public interface Composite<E extends TextComponent> extends TextComponent {
    void add(E e);
    E get(int index);
    void remove(int index);
    void clear();
}
