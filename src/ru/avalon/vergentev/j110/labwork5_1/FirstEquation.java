package ru.avalon.vergentev.j110.labwork5_1;

public class FirstEquation extends UsualClass {


    public FirstEquation(double a, double b, double accuracy) {
        super(a, b, accuracy);
    }

    @Override
    public double y(double x) {
        return (Math.exp(-x) - 0.5);
    }

}
