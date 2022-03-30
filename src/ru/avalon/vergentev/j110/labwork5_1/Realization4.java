package ru.avalon.vergentev.j110.labwork5_1;

public class Realization4 {
    FunctionBehaviour functionBehaviour;
//    Realization4 eqs;
//    Realization4 [] eqs = new Equation[];
    double a, b, accuracy;

//    public Realization4() {
//    }

    public Realization4(double a, double b, double accuracy) {
        this.a = a;
        this.b = b;
        this.accuracy = accuracy;
    }

    public void halfDivision4 (FunctionBehaviour functionBehaviour) {
        do {
            if (functionBehaviour.y(a)*functionBehaviour.y((a+b)/2) < 0) {
                b = (a+b)/2;
            } else if (functionBehaviour.y((a+b)/2)*functionBehaviour.y(b) < 0) {
                a = (a+b)/2;
            }
        } while (Math.abs((a-(a+b)/2)) > accuracy || Math.abs((b-(a+b)/2)) > accuracy);
        System.out.println("The decision of equation is: " + (a+b)/2);
    }

//    public static void halfDivisionStatic4 (Realization4 [] y) {
//        for (int i = 0; i < y.length; i++) {
//            if (i == 0) {
//                i.halfDivision4(functionBehaviour);
//            }
//
//        }
//        y.halfDivision4(new Realization4.Equation1());
//        y.halfDivision4(new Realization4.Equation2());
//        y.halfDivision4(new Realization4.Equation3());
//        y.halfDivision4(new Realization4.Equation4());
//        y.halfDivision4(new Realization4.Equation5());
//    }


    public static class Equation1 implements FunctionBehaviour{
        @Override
        public double y(double x) {
            return (Math.exp(-x) - 0.5);
        }
    }

    public static class Equation2 implements FunctionBehaviour{
        @Override
        public double y(double x) {
            return (Math.sin(x)-0.75);
        }
    }

    public static class Equation3 implements FunctionBehaviour{
        @Override
        public double y(double x) {
            return (Math.log(x*x*x)-2);
        }
    }

    public static class Equation4 implements FunctionBehaviour{
        @Override
        public double y(double x) {
            return (Math.tan(x));
        }
    }

    public static class Equation5 implements FunctionBehaviour{
        @Override
        public double y(double x) {
            return (x*x*x - 8*x + 2);
        }
    }
}
