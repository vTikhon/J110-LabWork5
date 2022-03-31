package ru.avalon.vergentev.j110.labwork5_1;

public class Main {
    public static void main(String[] args) {
        //через вложенные классы
        System.out.println("(Nested class) Instance method reference: ");
        new Realization(0.01, 2, 0.00001).halfDivision(new Realization.Equation1());
        new Realization(2, 3, 0.00001).halfDivision(new Realization.Equation2());
        new Realization(1, 3, 0.00001).halfDivision(new Realization.Equation3());
        new Realization(2, 4, 0.00001).halfDivision(new Realization.Equation4());
        new Realization(1, 5, 0.00001).halfDivision(new Realization.Equation5());
        System.out.print('\n');




        //через анонимные классы:
        System.out.println("(Anonymous class) Instance method reference: ");
        new Realization(0.01, 2, 0.00001).halfDivision(new FunctionBehaviour() {
            @Override
            public double y(double x) {
                return (Math.exp(-x) - 0.5);
            }
        });
        new Realization(2, 3, 0.00001).halfDivision(new FunctionBehaviour() {
            @Override
            public double y(double x) {
                return (Math.sin(x)-0.75);
            }
        });
        new Realization(1, 3, 0.00001).halfDivision(new FunctionBehaviour() {
            @Override
            public double y(double x) {
                return (Math.log(x*x*x)-2);
            }
        });
        new Realization(2, 4, 0.00001).halfDivision(new FunctionBehaviour() {
            @Override
            public double y(double x) {
                return (Math.tan(x));
            }
        });
        new Realization(1, 5, 0.00001).halfDivision(new FunctionBehaviour() {
            @Override
            public double y(double x) {
                return (x*x*x - 8*x + 2);
            }
        });
        System.out.print('\n');





        //через лямбда выражения
        System.out.println("(Lambda) Instance method reference: ");
        new Realization(0.01, 2, 0.00001).halfDivision((x) -> (Math.exp(-x) - 0.5));
        new Realization(2, 3, 0.00001).halfDivision((x) -> (Math.sin(x)-0.75));
        new Realization(1, 3, 0.00001).halfDivision((x) -> (Math.log(x*x*x)-2));
        new Realization(2, 4, 0.00001).halfDivision((x) -> (Math.tan(x)));
        new Realization(1, 5, 0.00001).halfDivision((x) -> (x*x*x - 8*x + 2));
        System.out.print('\n');


        //вызываем статичный метод
//        Realization.halfDivisionStatic();


    }
}
