package com.company;

public class NumberGeneric<T extends Number> implements GenericInterface<T> {


    private T in;
    private T db;
    private T fl;

    public T getIn() {
        return in;
    }
    public void setIn(T in) {
        this.in = in;
    }
    public T getDb() {
        return db;
    }
    public void setDb(T db) {
        this.db = db;
    }
    public T getFl() {
        return fl;
    }
    public void setFl(T fl) {
        this.fl = fl;
    }

    @Override
    public T print(T t) {
        return t;
    }
}
