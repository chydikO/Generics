package com.itstep.task1;

public class Generic <T1,T2,T3>{
    T1 obj1;
    T2 obj2;
    T3 obj3;

    public Generic(T1 obj1, T2 obj2, T3 obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public Generic(T1 obj1, T2 obj2) {
        this(obj1, obj2, null);
    }

    public Generic(T1 obj1) {
        this(obj1, null, null);
    }

    public Generic() {
        this(null, null, null);
    }

    public T1 getObj1() {
        return obj1;
    }

    public void setObj1(T1 obj1) {
        this.obj1 = obj1;
    }

    public T2 getObj2() {
        return obj2;
    }

    public void setObj2(T2 obj2) {
        this.obj2 = obj2;
    }

    public T3 getObj3() {
        return obj3;
    }

    public void setObj3(T3 obj3) {
        this.obj3 = obj3;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("Type1:")
                .append(obj1.getClass().getName())
                .append("\t Value1: ")
                .append(obj1)
                .append("\nType2:")
                .append(obj2.getClass().getName())
                .append("\t Value2: ")
                .append(obj2)
                .append("\nType3:")
                .append(obj3.getClass().getName())
                .append("\t Value3: ")
                .append(obj3).toString();
    }
}
