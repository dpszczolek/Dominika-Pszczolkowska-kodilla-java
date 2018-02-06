package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ProbableValuesException {
        try {
            if (x >= 2 || x < 1 || y == 1.5)
                throw new ProbableValuesException();
        } catch (ProbableValuesException e) {
            System.out.println("Your x must be between 1 and 2 (excluded).");
            System.out.println("Your y must be different than 1.5");
        } finally {
            System.out.println("Verification ended.");
        }
        return "Done!";
    }

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(1.5, 1.5);
        } catch (ProbableValuesException e) {
        }
    }
}
