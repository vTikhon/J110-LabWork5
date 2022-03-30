package ru.avalon.vergentev.j110.labwork5_1;

public class Main {
    public static void main(String[] args) {

        //формируем анонимные классы:
        Realization equation1 = new Realization(0.01, 2, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.exp(-x) - 0.5);
            }
        };
        Realization equation2 = new Realization(2, 3, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.sin(x)-0.75);
            }
        };
        Realization equation3 = new Realization(1, 3, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.log(x*x*x)-2);
            }
        };
        Realization equation4 = new Realization(2, 4, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.tan(x));
            }
        };
        Realization equation5 = new Realization(1, 5, 0.00001) {
            @Override
            public double y(double x) {
                return (x*x*x - 8*x + 2);
            }
        };

        //вызываем методы анонимных классов ссыла€сь на экземпл€р класса
        System.out.println("Instance method reference: ");
        equation1.halfDivision();
        equation2.halfDivision();
        equation3.halfDivision();
        equation4.halfDivision();
        equation5.halfDivision();
        System.out.print('\n');

        //вызываем методы анонимных классов через статический метод
        System.out.println("Static method reference: ");
        Realization.halfDivisionStatic(equation1);
        Realization.halfDivisionStatic(equation2);
        Realization.halfDivisionStatic(equation3);
        Realization.halfDivisionStatic(equation4);
        Realization.halfDivisionStatic(equation5);
        System.out.print('\n');

    }
}
