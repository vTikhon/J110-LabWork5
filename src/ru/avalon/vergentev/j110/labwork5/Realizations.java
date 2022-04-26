package ru.avalon.vergentev.j110.labwork5;

public class Realizations {
    double a, b, c, d, intervals, deltaX, deltaY, midPointX, midPointY, square, integral, x1, x2, y1, y2;

    public Realizations(double a, double b, double intervals) {
        this.a = a;
        this.b = b;
        this.intervals = intervals;
    }
    public Realizations(double a, double b, double c, double d, double intervals) {
        this(a, b, intervals);
        this.c = c;
        this.d = d;
    }

    //метод половинного деления
    public void halfDivision (FunctionBehaviour functionBehaviour) {
        do {
            if (functionBehaviour.y(a)*functionBehaviour.y((a+b)/2) < 0) {
                b = (a+b)/2;
            } else if (functionBehaviour.y((a+b)/2)*functionBehaviour.y(b) < 0) {
                a = (a+b)/2;
            }
        } while (Math.abs((a-(a+b)/2)) > intervals || Math.abs((b-(a+b)/2)) > intervals);
        System.out.println("The decision of equation is: " + (a+b)/2);
    }

    //метод вычисления интеграла под кривой
    void calculatingSquare (FunctionBehaviour functionBehaviour) {
        integral = 0;
        deltaX = (b - a)/intervals;
        x1 = a;
        x2 = x1 + deltaX;
        do {
            midPointX = (x2 + x1)/2;
            square = (deltaX)*(Math.abs(functionBehaviour.y(midPointX)));
            integral = integral + square;
            x1 = x1 + deltaX;
            x2 = x2 + deltaX;
        } while ((Math.abs(b-x2) > Math.abs(deltaX)));
        System.out.println("The square under the curve is: " + integral);
    }

    //метод вычисления интеграла под поверхностью
    void calculatingSurface (FunctionalBehaviour2 functionalBehaviour) {
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


    //формируем вложенные классы для лабы 5.1
    public static class Equation1 implements FunctionBehaviour {
        @Override
        public double y(double x) {
            return (Math.exp(-x) - 0.5);
        }
    }

    public static class Equation2 implements FunctionBehaviour {
        @Override
        public double y(double x) {
            return (Math.sin(x)-0.75);
        }
    }

    public static class Equation3 implements FunctionBehaviour {
        @Override
        public double y(double x) {
            return (Math.log(x*x*x)-2);
        }
    }

    public static class Equation4 implements FunctionBehaviour {
        @Override
        public double y(double x) {
            return (Math.tan(x));
        }
    }

    public static class Equation5 implements FunctionBehaviour {
        @Override
        public double y(double x) {
            return (x*x*x - 8*x + 2);
        }
    }

}
