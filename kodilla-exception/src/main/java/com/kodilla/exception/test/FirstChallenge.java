package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        try {
          if (b==0)
              throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        } finally {
            System.out.println("Your result is: ");
            return a / b;
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main (String[ ] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
