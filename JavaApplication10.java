package javaapplication10;
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class AgeChecker {
    public void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above.");
        } else if (age > 60) {
            throw new AgeException("Age should not exceed 60.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}

public class JavaApplication10 {    public static void main(String[] args) {
        AgeChecker checker = new AgeChecker();

        try {
            checker.checkAge(25);
            checker.checkAge(15);
            checker.checkAge(65);
        } catch (AgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}

  
