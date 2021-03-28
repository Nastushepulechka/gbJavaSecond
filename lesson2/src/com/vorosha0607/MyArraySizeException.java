package com.vorosha0607;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    private int length;

    public MyArraySizeException(int length) {
        this.length = length;
    }

    public MyArraySizeException(int index, int length) {
        super(index);
        this.length = length;
    }
}
