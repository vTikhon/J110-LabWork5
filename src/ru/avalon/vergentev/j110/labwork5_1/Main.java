package ru.avalon.vergentev.j110.labwork5_1;

public class Main {
    public static void main(String[] args) {
        //через вложенные классы
        Realization [] equationsNestedClass = new Realization[5];
        equationsNestedClass[0] =  new Realization(0.01, 2, 0.00001);
        equationsNestedClass[1] =  new Realization(2, 3, 0.00001);
        equationsNestedClass[2] =  new Realization(1, 3, 0.00001);
        equationsNestedClass[3] =  new Realization(2, 4, 0.00001);
        equationsNestedClass[4] =  new Realization(1, 5, 0.00001);
        System.out.print('\n');
        //вызываем методы через вложенный класс
        System.out.println("(Nested class) Instance method reference: ");
        equationsNestedClass[0].halfDivision(new Realization.Equation1());
        equationsNestedClass[1].halfDivision(new Realization.Equation2());
        equationsNestedClass[2].halfDivision(new Realization.Equation3());
        equationsNestedClass[3].halfDivision(new Realization.Equation4());
        equationsNestedClass[4].halfDivision(new Realization.Equation5());
        System.out.print('\n');




        //формируем анонимные классы (with class Realization):
        Realization [] equationsAmonClass = new Realization[5];
        equationsAmonClass[0] = new Realization(0.01, 2, 0.00001) {
            public double y(double x) {
                return (Math.exp(-x) - 0.5);
            }
        };
        equationsAmonClass[1] = new Realization(2, 3, 0.00001) {
            public double y(double x) {
                return (Math.sin(x)-0.75);
            }
        };
        equationsAmonClass[2] = new Realization(1, 3, 0.00001) {
            public double y(double x) {
                return (Math.log(x*x*x)-2);
            }
        };
        equationsAmonClass[3] = new Realization(2, 4, 0.00001) {
            public double y(double x) {
                return (Math.tan(x));
            }
        };
        equationsAmonClass[4] = new Realization(1, 5, 0.00001) {
            public double y(double x) {
                return (x*x*x - 8*x + 2);
            }
        };

        //вызываем методы анонимных классов ссыла€сь на экземпл€р класса
        System.out.println("(Anonymous class) Instance method reference: ");
        equationsAmonClass[0].halfDivision(new Realization.Equation1());
        equationsAmonClass[1].halfDivision(new Realization.Equation2());
        equationsAmonClass[2].halfDivision(new Realization.Equation3());
        equationsAmonClass[3].halfDivision(new Realization.Equation4());
        equationsAmonClass[4].halfDivision(new Realization.Equation5());
        System.out.print('\n');





        //используем л€мбда выражени€ и сначала задаЄм интерфейсы (with class Realisation3)
        System.out.println("Lambda equations: ");
        //вызываем методы
        new Realization(0.01, 2, 0.00001).halfDivision((x) -> (Math.exp(-x) - 0.5));
        new Realization(2, 3, 0.00001).halfDivision((x) -> (Math.sin(x)-0.75));
        new Realization(1, 3, 0.00001).halfDivision((x) -> (Math.log(x*x*x)-2));
        new Realization(2, 4, 0.00001).halfDivision((x) -> (Math.tan(x)));
        new Realization(1, 5, 0.00001).halfDivision((x) -> (x*x*x - 8*x + 2));

        //вызываем статичный метод
//        Realization3.halfDivisionStatic3(functions);


    }
}
