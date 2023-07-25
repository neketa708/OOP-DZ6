package org.example.model;

public class BinaryCalcul extends Znac{
    private int decimal1;
    private int decimal2;

    public BinaryCalcul(String num1, String num2) {
        super(num1, num2);
        this.decimal1 = Integer.parseInt(num1,2);
        this.decimal2 = Integer.parseInt(num2,2);
    }

    @Override
    public String sum() {
        int sumDecimal = decimal1+decimal2;
        return Integer.toBinaryString(sumDecimal);
    }

    @Override
    public String sub() {
        int subDecimal = decimal1-decimal2;
        return Integer.toBinaryString(subDecimal);
    }

    @Override
    public String multi() {
        int mulDecimal = decimal1*decimal2;
        return Integer.toBinaryString(mulDecimal);
    }

    @Override
    public String divide() {
        int divDecimal = decimal1/decimal2;
        return Integer.toBinaryString(divDecimal);
    }
}
