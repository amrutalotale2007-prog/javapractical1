package practical2a;

abstract class MathOperation {
    abstract double calculate(double a, double b);

    void displayResult(String operation, double result) {
        System.out.println(operation + " Result: " + result);
    }
}

class Addition extends MathOperation {
    @Override
    double calculate(double a, double b) {
        return a + b;
    }
}

class Subtraction extends MathOperation {
    @Override
    double calculate(double a, double b) {
        return a - b;
    }
}

class Multiplication extends MathOperation {
    @Override
    double calculate(double a, double b) {
        return a * b;
    }
}

class Division extends MathOperation {
    @Override
    double calculate(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

public class Practical2a {
    public static void main(String[] args) {
        MathOperation add = new Addition();
        MathOperation subtract = new Subtraction();
        MathOperation multiply = new Multiplication();
        MathOperation divide = new Division();

        double a = 20;
        double b = 10;

        add.displayResult("Addition", add.calculate(a, b));
        subtract.displayResult("Subtraction", subtract.calculate(a, b));
        multiply.displayResult("Multiplication", multiply.calculate(a, b));
        divide.displayResult("Division", divide.calculate(a, b));
    }
}