package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        Calculator math = new Calculator();

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        int sum = math.add(2, 5);
        if (sum == 7) {
            System.out.println("Sum OK");
        } else {
            System.out.println("Sum not right");
        }

        int ded = math.substract(6, 3);
        if (ded == 3) {
            System.out.println("Substract OK");
        } else {
            System.out.println("Susbtract not OK");
        }
    }
}

