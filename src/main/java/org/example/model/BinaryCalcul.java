package org.example.model;

public class BinaryCalcul implements Number{
    private String binary1;
    private String binary2;
    private int decimal1;
    private int decimal2;

    public BinaryCalcul(String binary1, String binary2) {
        this.binary1 = binary1;
        this.binary2 = binary2;
        this.decimal1 = Integer.parseInt(binary1,2);
        this.decimal2 = Integer.parseInt(binary2,2);
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
