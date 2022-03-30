package ru.avalon.vergentev.j110.labwork5_1;

public class ThirdEquation extends UsualClass {


    public ThirdEquation(double a, double b, double accuracy) {
        super(a, b, accuracy);
    }

    @Override
    public double y(double x) {
        return (Math.log(x*x*x)-2);
    }

}
