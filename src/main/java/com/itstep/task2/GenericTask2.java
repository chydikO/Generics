package com.itstep.task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class GenericTask2 <T>  {
    private T[] elements;
    private int elementSize;

    public GenericTask2(T[] elements, int elementSize) {
        this.elements = elements;
        this.elementSize = elementSize;
    }

    public GenericTask2(T[] elements) {
        this(elements, elements.length);
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public int getElementSize() {
        return elementSize;
    }

    public void setElementSize(int newElementSize) {
        if (getElementSize() >= newElementSize ) {
            System.out.println("Invalid new elementSize");
            return;
        }
        T[] temp = (T[]) Array.newInstance(elements.getClass().getComponentType(), newElementSize);
        System.arraycopy(elements, 0, temp, 0, elementSize);
        elements = temp;
        elementSize = newElementSize;
    }

    public <T extends Comparable<T>> T getMinElement() {
        T min = (T) elements[0];
        for(Object obj : elements) {
            if (obj == null) continue;
            if (min.compareTo((T) obj) > 0) {
                min = (T) obj;
            }
        }
        return min;
    }

    public <T extends Comparable<T>> T getMaxElement() {
        T max = (T) elements[0];
        for(Object obj : elements) {
            if (obj == null) continue;
            if (max.compareTo((T) obj) < 0) {
                max = (T) obj;
            }
        }
        return max;
    }

    public <T extends Comparable<T>> T getAverengeElement() {
        Object[] sorted = Stream.of(elements)
                .filter(s -> s != null)
                .sorted()
                .toArray(Object[]::new);
        return (T) sorted[Math.round(sorted.length) / 2];
    }

    @Override
    public String toString() {
        return "GenericTask2{" +
                "elements= " + Arrays.toString(elements) +
                ", elementSize= " + elementSize +
                '}';
    }
}
