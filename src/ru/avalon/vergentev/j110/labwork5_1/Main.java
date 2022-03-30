package ru.avalon.vergentev.j110.labwork5_1;

public class Main {
    public static void main(String[] args) {

        //��������� ��������� ������:
        UsualClass equation1 = new UsualClass(0.01, 2, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.exp(-x) - 0.5);
            }
        };
        UsualClass equation2 = new UsualClass(2, 3, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.sin(x)-0.75);
            }
        };
        UsualClass equation3 = new UsualClass(1, 3, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.log(x*x*x)-2);
            }
        };
        UsualClass equation4 = new UsualClass(2, 4, 0.00001) {
            @Override
            public double y(double x) {
                return (Math.tan(x));
            }
        };
        UsualClass equation5 = new UsualClass(1, 5, 0.00001) {
            @Override
            public double y(double x) {
                return (x*x*x - 8*x + 2);
            }
        };

        //�������� ������ ��������� ������� �������� �� ��������� ������
        System.out.println("Instance method reference: ");
        equation1.halfDivision();
        equation2.halfDivision();
        equation3.halfDivision();
        equation4.halfDivision();
        equation5.halfDivision();
        System.out.print('\n');

        //�������� ������ ��������� ������� ����� ����������� �����
        System.out.println("Static method reference: ");
        UsualClass.halfDivisionStatic(equation1);
        UsualClass.halfDivisionStatic(equation2);
        UsualClass.halfDivisionStatic(equation3);
        UsualClass.halfDivisionStatic(equation4);
        UsualClass.halfDivisionStatic(equation5);
        System.out.print('\n');

    }
}
