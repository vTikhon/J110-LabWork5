package ru.avalon.vergentev.j110.labwork5;

public class Realization2 {
    double a, b, intervals, delta, midPoint, square, integral, x1, x2;

    public Realization2(double a, double b, double intervals) {
        this.a = a;
        this.b = b;
        this.intervals = intervals;
    }

    void calculatingSquare (FunctionalBehaviour2 functionBehaviour) {
        integral = 0;
        delta = (b - a)/intervals;
        x1 = a;
        x2 = x1 + delta;
        do {
            midPoint = (x2 + x1)/2;
            square = (delta)*(Math.abs(functionBehaviour.y(midPoint)));
            integral = integral + square;
            x1 = x1 + delta;
            x2 = x2 + delta;
        } while ((Math.abs(b-x2) > Math.abs(delta)));
        System.out.println("The square under the curve is: " + integral);
    }


}
