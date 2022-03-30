package ru.avalon.vergentev.j110.labwork5_1;

public class FourthEquation extends UsualClass {


    public FourthEquation(double a, double b, double accuracy) {
        super(a, b, accuracy);
    }

    @Override
    public double y(double x) {
        return (Math.tan(x));
    }

}
