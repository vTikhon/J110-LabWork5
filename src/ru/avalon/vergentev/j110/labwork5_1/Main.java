package ru.avalon.vergentev.j110.labwork5_1;

public class Main {
    public static void main(String[] args) {

//        формируем анонимные классы (with class Realization):
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
        System.out.println("(Anonymous class) Instance method reference: ");
        equation1.halfDivision();
        equation2.halfDivision();
        equation3.halfDivision();
        equation4.halfDivision();
        equation5.halfDivision();
        System.out.print('\n');
        //вызываем методы анонимных классов через статический метод
        System.out.println("(Anonymous class) Static method reference: ");
        Realization.halfDivisionStatic(equation1);
        Realization.halfDivisionStatic(equation2);
        Realization.halfDivisionStatic(equation3);
        Realization.halfDivisionStatic(equation4);
        Realization.halfDivisionStatic(equation5);
        System.out.print('\n');



        //используем вложенный класс (with class Realization2)
        Realization2 y1 = new Realization2();
        Realization2 y2 = new Realization2();
        Realization2 y3 = new Realization2();
        Realization2 y4 = new Realization2();
        Realization2 y5 = new Realization2();
        //вызываем методы через вложенный класс
        System.out.println("(Nested class) Instance method reference: ");
        y1.eq1.halfDivision2();
        y2.eq2.halfDivision2();
        y3.eq3.halfDivision2();
        y4.eq4.halfDivision2();
        y5.eq5.halfDivision2();
        System.out.print('\n');
//        вызываем методы через вложенный класс посредством статичного метода
        System.out.println("(Nested class) Static method reference: ");
        Realization2.Equation1.halfDivisionStatic2(y1.eq1);
        Realization2.Equation2.halfDivisionStatic2(y2.eq2);
        Realization2.Equation3.halfDivisionStatic2(y3.eq3);
        Realization2.Equation4.halfDivisionStatic2(y4.eq4);
        Realization2.Equation5.halfDivisionStatic2(y5.eq5);
        System.out.print('\n');



        //используем л€мбда выражени€ и сначала задаЄм интерфейсы (with class Realisation3)
        System.out.println("Lambda equations: ");
        Realization3 f1 = new Realization3(0.01, 2, 0.00001);
        Realization3 f2 = new Realization3(2, 3, 0.00001);
        Realization3 f3 = new Realization3(1, 3, 0.00001);
        Realization3 f4 = new Realization3(2, 4, 0.00001);
        Realization3 f5 = new Realization3(1, 5, 0.00001);
        FunctionBehaviour function1 = (x) -> (Math.exp(-x) - 0.5);
        FunctionBehaviour function2 = (x) -> (Math.sin(x)-0.75);
        FunctionBehaviour function3 = (x) -> (Math.log(x*x*x)-2);
        FunctionBehaviour function4 = (x) -> (Math.tan(x));
        FunctionBehaviour function5 = (x) -> (x*x*x - 8*x + 2);
        //вызываем методы
        f1.halfDivision3(function1);
        f2.halfDivision3(function2);
        f3.halfDivision3(function3);
        f4.halfDivision3(function4);
        f5.halfDivision3(function5);

    }
}
