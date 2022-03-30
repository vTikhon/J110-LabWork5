package ru.avalon.vergentev.j110.labwork5_1;

public class Realization2 {
    Equation1 eq1 = new Equation1(0.01, 2, 0.00001);
    Equation2 eq2 = new Equation2(2, 3, 0.00001);
    Equation3 eq3 = new Equation3(1, 3, 0.00001);
    Equation4 eq4 = new Equation4(2, 4, 0.00001);
    Equation5 eq5 = new Equation5(1, 5, 0.00001);

    public static class Equation1 {
        double a, b, accuracy;

        public Equation1(double a, double b, double accuracy) {
            this.a = a;
            this.b = b;
            this.accuracy = accuracy;
        }

        public double y(double x) {
            return (Math.exp(-x) - 0.5);
        }
        public void halfDivision2 () {
            do {
                if (y(a)*y((a+b)/2) < 0) {
                    b = (a+b)/2;
                } else if (y((a+b)/2)*y(b) < 0) {
                    a = (a+b)/2;
                }
            } while (Math.abs((a-(a+b)/2)) > accuracy || Math.abs((b-(a+b)/2)) > accuracy);
            System.out.println("The decision of equation is: " + (a+b)/2);
        }
        public static void halfDivisionStatic2 (Equation1 y) {
            y.halfDivision2();
        }
    }


    public static class Equation2 {
        double a, b, accuracy;

        public Equation2(double a, double b, double accuracy) {
            this.a = a;
            this.b = b;
            this.accuracy = accuracy;
        }

        public double y(double x) {
            return (Math.sin(x)-0.75);
        }
        public void halfDivision2 () {
            do {
                if (y(a)*y((a+b)/2) < 0) {
                    b = (a+b)/2;
                } else if (y((a+b)/2)*y(b) < 0) {
                    a = (a+b)/2;
                }
            } while (Math.abs((a-(a+b)/2)) > accuracy || Math.abs((b-(a+b)/2)) > accuracy);
            System.out.println("The decision of equation is: " + (a+b)/2);
        }
        public static void halfDivisionStatic2 (Equation2 y) {
            y.halfDivision2();
        }
    }


    public static class Equation3 {
        double a, b, accuracy;

        public Equation3(double a, double b, double accuracy) {
            this.a = a;
            this.b = b;
            this.accuracy = accuracy;
        }

        public double y(double x) {
            return (Math.log(x*x*x)-2);
        }
        public void halfDivision2 () {
            do {
                if (y(a)*y((a+b)/2) < 0) {
                    b = (a+b)/2;
                } else if (y((a+b)/2)*y(b) < 0) {
                    a = (a+b)/2;
                }
            } while (Math.abs((a-(a+b)/2)) > accuracy || Math.abs((b-(a+b)/2)) > accuracy);
            System.out.println("The decision of equation is: " + (a+b)/2);
        }
        public static void halfDivisionStatic2 (Equation3 y) {
            y.halfDivision2();
        }
    }


    public static class Equation4 {
        double a, b, accuracy;

        public Equation4(double a, double b, double accuracy) {
            this.a = a;
            this.b = b;
            this.accuracy = accuracy;
        }

        public double y(double x) {
            return (Math.tan(x));
        }
        public void halfDivision2 () {
            do {
                if (y(a)*y((a+b)/2) < 0) {
                    b = (a+b)/2;
                } else if (y((a+b)/2)*y(b) < 0) {
                    a = (a+b)/2;
                }
            } while (Math.abs((a-(a+b)/2)) > accuracy || Math.abs((b-(a+b)/2)) > accuracy);
            System.out.println("The decision of equation is: " + (a+b)/2);
        }
        public static void halfDivisionStatic2 (Equation4 y) {
            y.halfDivision2();
        }
    }


    public static class Equation5 {
        double a, b, accuracy;

        public Equation5(double a, double b, double accuracy) {
            this.a = a;
            this.b = b;
            this.accuracy = accuracy;
        }

        public double y(double x) {
            return (x*x*x - 8*x + 2);
        }
        public void halfDivision2 () {
            do {
                if (y(a)*y((a+b)/2) < 0) {
                    b = (a+b)/2;
                } else if (y((a+b)/2)*y(b) < 0) {
                    a = (a+b)/2;
                }
            } while (Math.abs((a-(a+b)/2)) > accuracy || Math.abs((b-(a+b)/2)) > accuracy);
            System.out.println("The decision of equation is: " + (a+b)/2);
        }
        public static void halfDivisionStatic2 (Equation5 y) {
            y.halfDivision2();
        }
    }

}
