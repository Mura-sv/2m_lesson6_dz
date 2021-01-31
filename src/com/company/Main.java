package com.company;

public class Main {

    public static void main(String[] args) {

        NumberGeneric<Integer> numberGenericInt = new NumberGeneric<>();
        numberGenericInt.setIn(10);

        NumberGeneric<Double> numberGenericDouble = new NumberGeneric<>();
        numberGenericDouble.setDb(5.5);

        NumberGeneric<Float> numberGenericFloat = new NumberGeneric<>();
        numberGenericFloat.setFl(12.123f);
    }
}
