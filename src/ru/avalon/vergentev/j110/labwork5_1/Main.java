package ru.avalon.vergentev.j110.labwork5_1;

public class Main {
    public static void main(String[] args) {

        UsualClass y1 = new FirstEquation(0.01, 2, 0.00001);
        UsualClass y2 = new SecondEquation(2, 3, 0.00001);
        UsualClass y3 = new ThirdEquation(1, 3, 0.00001);
        UsualClass y4 = new FourthEquation(2, 4, 0.00001);
        UsualClass y5 = new FifthEquation(1, 5, 0.00001);

        //вызов из классов наследников (ссылка на метод экземпл€ра)
        System.out.println("From Extends classes:");
        y1.halfDivision();
        y2.halfDivision();
        y3.halfDivision();
        y4.halfDivision();
        y5.halfDivision();
        System.out.print('\n');

        //вызов статического метода
        System.out.println("From Extends classes with static method:");
        UsualClass.halfDivisionStatic(y1);
        UsualClass.halfDivisionStatic(y2);
        UsualClass.halfDivisionStatic(y3);
        UsualClass.halfDivisionStatic(y4);
        UsualClass.halfDivisionStatic(y5);
        System.out.print('\n');


    }
}
