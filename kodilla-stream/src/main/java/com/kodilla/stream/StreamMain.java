package com.kodilla.stream;

import com.kodilla.stream.beautifier.DifferentBeautifiers;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteExpression;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExecuteExpression expressionExecutor = new ExecuteExpression();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String s = "Sentence to be changed";
        System.out.println("PoemBeautifiers with lambdas");
        poemBeautifier.beautify(s,text -> ("ABC" + text + "ABC"));
        poemBeautifier.beautify(s, text -> text.toUpperCase());
        poemBeautifier.beautify(s, text -> text.replace("e", "E"));
        poemBeautifier.beautify(s, text -> text.replace("e", "\n"));

        System.out.println("PoemBeautifiers with method references");
        poemBeautifier.beautify(s, DifferentBeautifiers::abcAdd);
        poemBeautifier.beautify(s, DifferentBeautifiers::capitalics);
        poemBeautifier.beautify(s, DifferentBeautifiers::lowEToUpCaseA);
        poemBeautifier.beautify(s, DifferentBeautifiers::splitedText);
    }
}
