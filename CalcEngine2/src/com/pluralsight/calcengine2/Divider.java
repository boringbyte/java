package com.pluralsight.calcengine2;

public class Divider extends CalculateBase{
    @Override
    public void calculate() {
        double value = getLeftVal() != 0 ? getLeftVal() / getRightVal() : 0.0d;
        setResult(value);
    }
}
