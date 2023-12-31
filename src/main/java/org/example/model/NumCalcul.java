package org.example.model;

public class NumCalcul extends Znac{
    private double znac1;
    private double znac2;

    public NumCalcul(String num1, String num2) {
        super(num1, num2);
        this.znac1 = Double.parseDouble(num1);
        this.znac2 = Double.parseDouble(num2);
    }


    @Override
    public String sum() {
        double sum = znac1+znac2;
        return Double.toString(sum);
    }

    @Override
    public String sub() {
        double sub = znac1-znac2;
        return Double.toString(sub);
    }

    @Override
    public String multi() {
        double mul = znac1*znac2;
        return Double.toString(mul);
    }

    @Override
    public String divide() {
        double div = znac1/znac2;
        return Double.toString(div);
    }
}
