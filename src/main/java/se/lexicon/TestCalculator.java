package se.lexicon;

public class TestCalculator {


        public static double addition(double n1, double n2){
        return n1 + n2;
        }
    public static double subtraction(double n1, double n2){
        return n1 - n2;
    }

    public static double multiplication(double n1, double n2){
        return n1 * n2;
    }

    public static double divison(double n1, double n2){
        return n1 / n2;
    }

    public static void displayMenu() {
        System.out.println("Welcome to my first Java Assignment");
        System.out.println("+ Addition");
        System.out.println("- Subtraction");
        System.out.println("* Multiplication");
        System.out.println("/ Division");
    }


}



