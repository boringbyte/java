package com.pluralsight.calcengine2;

public class Mulitplier extends CalculateBase{
    @Override
    public void calculate() {
        double value = getLeftVal() * getLeftVal();
        setResult(value);
    }
}
