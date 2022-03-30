package ru.avalon.vergentev.j110.labwork5_1;

public class Realization3 {
    FunctionBehaviour functionBehaviour;
    double a, b, accuracy;

    public Realization3(double a, double b, double accuracy) {
        this.a = a;
        this.b = b;
        this.accuracy = accuracy;
    }

    public void halfDivision3 (FunctionBehaviour functionBehaviour) {
        do {
            if (functionBehaviour.y(a)*functionBehaviour.y((a+b)/2) < 0) {
                b = (a+b)/2;
            } else if (functionBehaviour.y((a+b)/2)*functionBehaviour.y(b) < 0) {
                a = (a+b)/2;
            }
        } while (Math.abs((a-(a+b)/2)) > accuracy || Math.abs((b-(a+b)/2)) > accuracy);
        System.out.println("The decision of equation is: " + (a+b)/2);
    }

//    public static void halfDivisionStatic3 (Realization3 functions) {
//        functions.halfDivision3();
//    }

}

