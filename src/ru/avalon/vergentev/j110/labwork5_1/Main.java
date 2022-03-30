package ru.avalon.vergentev.j110.labwork5_1;

public class Main {
    public static void main(String[] args) {

        UsualClass y1 = new FirstEquation(0.01, 2, 0.00001);
        UsualClass y2 = new SecondEquation(2, 3, 0.00001);
        UsualClass y3 = new ThirdEquation(1, 3, 0.00001);
        UsualClass y4 = new FourthEquation(2, 4, 0.00001);
        UsualClass y5 = new FifthEquation(1, 5, 0.00001);

        y1.halfDivision();
        y2.halfDivision();
        y3.halfDivision();
        y4.halfDivision();
        y5.halfDivision();









    }
}
