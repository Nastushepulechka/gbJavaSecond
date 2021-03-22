package com.vorosha0607;

public class MyArrayDataException extends ArrayIndexOutOfBoundsException{
    private int ind1;
    private int ind2;

    public MyArrayDataException(int ind1, int ind2) {
        this.ind1 = ind1;
        this.ind2 = ind2;
        System.out.println("Не удалось преобразовать яйчейку ["+ind1+"]["+ind2+"]!");
    }
}
