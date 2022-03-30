package ru.avalon.vergentev.j110.labwork5_1;

public class FifthEquation extends UsualClass {


    public FifthEquation(double a, double b, double accuracy) {
        super(a, b, accuracy);
    }

    @Override
    public double y(double x) {
        return (x*x*x - 8*x + 2);
    }

}
