package ru.avalon.vergentev.j110.labwork5;

public class Main {
    public static void main(String[] args) {
        //лаба 5.1 через вложенные классы
        System.out.println("(Nested class) Instance method reference: ");
        new Realizations(0.01, 2, 0.00001).halfDivision(new Realizations.Equation1());
        new Realizations(2, 3, 0.00001).halfDivision(new Realizations.Equation2());
        new Realizations(1, 3, 0.00001).halfDivision(new Realizations.Equation3());
        new Realizations(2, 4, 0.00001).halfDivision(new Realizations.Equation4());
        new Realizations(1, 5, 0.00001).halfDivision(new Realizations.Equation5());
        System.out.print('\n');

        //лаба 5.1 через анонимные классы:
        System.out.println("(Anonymous class) Instance method reference: ");
        new Realizations(0.01, 2, 0.00001).halfDivision(new FunctionBehaviour() {
            @Override
            public double y(double x) {
                return (Math.exp(-x) - 0.5);
            }
        });
        new Realizations(2, 3, 0.00001).halfDivision(new FunctionBehaviour() {
            @Override
            public double y(double x) {
                return (Math.sin(x)-0.75);
            }
        });
        new Realizations(1, 3, 0.00001).halfDivision(new FunctionBehaviour() {
            @Override
            public double y(double x) {
                return (Math.log(x*x*x)-2);
            }
        });
        new Realizations(2, 4, 0.00001).halfDivision(new FunctionBehaviour() {
            @Override
            public double y(double x) {
                return (Math.tan(x));
            }
        });
        new Realizations(1, 5, 0.00001).halfDivision(new FunctionBehaviour() {
            @Override
            public double y(double x) {
                return (x*x*x - 8*x + 2);
            }
        });
        System.out.print('\n');


        //лаба 5.1 через лямбда выражения
        System.out.println("(Lambda) Curves: ");
        new Realizations(0.01, 2, 0.00001).halfDivision((x) -> (Math.exp(-x) - 0.5));
        new Realizations(2, 3, 0.00001).halfDivision((x) -> (Math.sin(x)-0.75));
        new Realizations(1, 3, 0.00001).halfDivision((x) -> (Math.log(x*x*x)-2));
        new Realizations(2, 4, 0.00001).halfDivision((x) -> (Math.tan(x)));
        new Realizations(1, 5, 0.00001).halfDivision((x) -> (x*x*x - 8*x + 2));
        System.out.print('\n');

        //лаба 5.2 через лямбда выражения
        System.out.println("(Lambda) Squares: ");
        new Realization2(2, 5, 100).calculatingSquare(((x) -> (Math.log(x))));
        new Realization2(3, 4, 100).calculatingSquare(((x) -> (x*x + x)));
        new Realization2(0.01, 2, 100).calculatingSquare(((x) -> (Math.exp(-x))));
        new Realization2(1, 3, 100).calculatingSquare(((x) -> (x*x)));
        new Realization2(0, 1, 100).calculatingSquare(((x) -> (x*Math.sin(x))));
        System.out.print('\n');

        //лаба 5.3 через лямбда выражения
        System.out.println("(Lambda) Surfaces: ");
        new Realization3(1, 3, 1, 3, 100).calculatingSurface(((x, y) -> (x*y)));
        new Realization3(3, 4, 7, 10,  100).calculatingSurface(((x, y) -> (x*x + x)*(2*y+1)));
        new Realization3(0.01, 2, 0.5, 4, 100).calculatingSurface(((x, y) -> (Math.exp(-x*y))));
        new Realization3(1, 3, 1, 2, 100).calculatingSurface(((x, y) -> (x*x +y*y*y)));
        new Realization3(0, 1, 0, 1, 100).calculatingSurface(((x, y) -> (x*y*Math.sin(x*y))));
        System.out.print('\n');
    }
}
