package ru.avalon.vergentev.j110.labwork5_1;

public class SecondEquation extends UsualClass {


    public SecondEquation(double a, double b, double accuracy) {
        super(a, b, accuracy);
    }

    @Override
    public double y(double x) {
        return (Math.sin(x)-0.75);
    }

}
