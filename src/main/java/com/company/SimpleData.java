package com.company;

/* Объект с полями примитивных и ссылочных типов*/
public class SimpleData {
    private int intData;
    private byte byteData;
    ReferenceCheck referenceCheck = new ReferenceCheck();
    //private long longData;
    private Object objectData;
    public String stringData;

    public SimpleData() {

    }

    public SimpleData(int intData, byte byteData, Object objectData, String stringData) {
        this.intData = intData;
        this.byteData = byteData;
        this.objectData = objectData;
        this.stringData = stringData;
    }

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public byte getByteData() {
        return byteData;
    }

    public void setByteData(byte byteData) {
        this.byteData = byteData;
    }

    public Object getObjectData() {
        return objectData;
    }

    public void setObjectData(Object objectData) {
        this.objectData = objectData;
    }

    /*public void setLongData(long longData) {
        this.longData = longData;
    }*/
}
