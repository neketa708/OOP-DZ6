package org.example.model;

public abstract class Znac implements Number {
    /*
    Входящие данные
     */
    private String num1;
    private String num2;

    public Znac(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }
}