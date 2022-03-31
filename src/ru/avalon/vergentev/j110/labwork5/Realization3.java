package ru.avalon.vergentev.j110.labwork5;

public class Realization3 {
    double a, b, c, d, intervals, deltaX, deltaY, midPointX, midPointY, square, integral, x1, x2, y1, y2;

    public Realization3(double a, double b, double c, double d, double intervals) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.intervals = intervals;
    }

    void calculatingSurface (FunctionalBehaviour3 functionalBehaviour) {
        integral = 0;
        deltaX = (b - a)/intervals;
        deltaY = (d - c)/intervals;
        x1 = a;
        x2 = x1 + deltaX;
        y1 = c;
        y2 = y1 + deltaY;
        do {
            midPointX = (x2 + x1)/2;
            midPointY = (y2 + y1)/2;
            square = (deltaX*deltaY)*(Math.abs(functionalBehaviour.f(midPointX, midPointY)));
            integral = integral + square;
            if (b-x2 > 0) {
                x1 = x1 + deltaX;
                x2 = x2 + deltaX;
            }
            if (d-y2 > 0) {
                y1 = y1 + deltaY;
                y2 = y2 + deltaY;
            }
        } while ((Math.abs(b-x2) > Math.abs(deltaX)) && (Math.abs(d-y2) > Math.abs(deltaY)));
        System.out.println("The square under the curve is: " + integral);
    }
}
