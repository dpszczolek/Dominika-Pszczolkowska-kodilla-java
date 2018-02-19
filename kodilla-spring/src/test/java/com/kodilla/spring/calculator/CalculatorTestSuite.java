package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testShowSum() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double test = calculator.add(3.0, 2.8);

        Assert.assertEquals(5.8, test, 0.001);
    }

    @Test
    public void testShowSub() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double test = calculator.sub(3.0, 2.8);

        Assert.assertEquals(0.2, test, 0.001);
    }

    @Test
    public void testShowMul() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double test = calculator.mul(3.0, 2.8);

        Assert.assertEquals(8.4, test, 0.001);
    }

    @Test
    public void testShowDiv() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double test = calculator.div(3.0, 2.8);

        Assert.assertEquals(1.07, test, 0.002);
    }
}
