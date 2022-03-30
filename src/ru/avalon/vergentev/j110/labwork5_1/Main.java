package ru.avalon.vergentev.j110.labwork5_1;

public class Main {
    public static void main(String[] args) {

//        формируем анонимные классы (with class Realization):
        Realization [] equations = new Realization[5];
        equations[0] = new Realization(0.01, 2, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.exp(-x) - 0.5);
            }
        };
        equations[1] = new Realization(2, 3, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.sin(x)-0.75);
            }
        };
        equations[2] = new Realization(1, 3, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.log(x*x*x)-2);
            }
        };
        equations[3] = new Realization(2, 4, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.tan(x));
            }
        };
        equations[4] = new Realization(1, 5, 0.00001) {
            @Override
            public double y(double x) {
                return (x*x*x - 8*x + 2);
            }
        };

        //вызываем методы анонимных классов ссыла€сь на экземпл€р класса
        System.out.println("(Anonymous class) Instance method reference: ");
        for (Realization i : equations) {
            i.halfDivision();
        }
        System.out.print('\n');

        //вызываем методы анонимных классов через статический метод
        System.out.println("(Anonymous class) Static method reference: ");
        Realization.halfDivisionStatic(equations);
        System.out.print('\n');



        //используем вложенный класс (with class Realization2)
        //вызываем методы через вложенный класс
        System.out.println("(Nested class) Instance method reference: ");
        new Realization2().eq1.halfDivision2();
        new Realization2().eq2.halfDivision2();
        new Realization2().eq3.halfDivision2();
        new Realization2().eq4.halfDivision2();
        new Realization2().eq5.halfDivision2();
        System.out.print('\n');

        //вызываем методы через вложенный класс посредством статичного метода
        System.out.println("(Nested class) Static method reference: ");
        Realization2.Equation1.halfDivisionStatic2(new Realization2().eq1);
        Realization2.Equation2.halfDivisionStatic2(new Realization2().eq2);
        Realization2.Equation3.halfDivisionStatic2(new Realization2().eq3);
        Realization2.Equation4.halfDivisionStatic2(new Realization2().eq4);
        Realization2.Equation5.halfDivisionStatic2(new Realization2().eq5);
        System.out.print('\n');



        //используем л€мбда выражени€ и сначала задаЄм интерфейсы (with class Realisation3)
        System.out.println("Lambda equations: ");
        //вызываем методы
        new Realization3(0.01, 2, 0.00001).halfDivision3((x) -> (Math.exp(-x) - 0.5));
        new Realization3(2, 3, 0.00001).halfDivision3((x) -> (Math.sin(x)-0.75));
        new Realization3(1, 3, 0.00001).halfDivision3((x) -> (Math.log(x*x*x)-2));
        new Realization3(2, 4, 0.00001).halfDivision3((x) -> (Math.tan(x)));
        new Realization3(1, 5, 0.00001).halfDivision3((x) -> (x*x*x - 8*x + 2));
        //вызываем статичный метод
//        Realization3.halfDivisionStatic3(functions);


        //используем вложенный класс (with class Realization4)
        Realization4 [] y = new Realization4[5];
        y[0] =  new Realization4(0.01, 2, 0.00001);
        y[1] =  new Realization4(2, 3, 0.00001);
        y[2] =  new Realization4(1, 3, 0.00001);
        y[3] =  new Realization4(2, 4, 0.00001);
        y[4] =  new Realization4(1, 5, 0.00001);
        System.out.print('\n');
        //вызываем методы через вложенный класс
        System.out.println("(Nested class) Instance method reference: ");
        y[0].halfDivision4(new Realization4.Equation1());
        y[1].halfDivision4(new Realization4.Equation2());
        y[2].halfDivision4(new Realization4.Equation3());
        y[3].halfDivision4(new Realization4.Equation4());
        y[4].halfDivision4(new Realization4.Equation5());
        System.out.print('\n');
        //вызываем методы через вложенный класс посредством статичного метода
//        System.out.println("(Nested class) Static method reference: ");
//        Realization4.halfDivisionStatic4(y);
//        System.out.print('\n');

    }
}
