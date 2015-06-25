package com.epam.textprocessing.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractComposite<E extends TextComponent> implements Composite<E> {
    private List<E> components = new ArrayList<E>();

    public AbstractComposite() {
    }

    public AbstractComposite(List<E> components) {
        this.components = components;
    }

    public List<E> getComponents() {
        return components;
    }

    public void setComponents(List<E> components) {
        this.components = components;
    }

    @Override
    public void add(E e) {
        components.add(e);
    }

    @Override
    public E get(int index) {
        return components.get(index);
    }
}
