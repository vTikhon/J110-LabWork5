package ru.avalon.vergentev.j110.labwork5_1;

public class Realization {
    double a, b, accuracy;

    public Realization(double a, double b, double accuracy) {
        this.a = a;
        this.b = b;
        this.accuracy = accuracy;
    }

    public double y(double x) {
        return 0;
    }

    public void halfDivision () {
        do {
            if (y(a)*y((a+b)/2) < 0) {
                b = (a+b)/2;
            } else if (y((a+b)/2)*y(b) < 0) {
                a = (a+b)/2;
            }
        } while (Math.abs((a-(a+b)/2)) > accuracy || Math.abs((b-(a+b)/2)) > accuracy);
        System.out.println("The decision of equation is: " + (a+b)/2);
    }

    public static void halfDivisionStatic (Realization y) {
        y.halfDivision();
    }

}
