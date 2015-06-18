package com.epam.textprocessing.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractComposite<E extends TextComponent> implements Composite<E> {
    private List<E> component = new ArrayList<E>();
}
