package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("files/names.txt").getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get("files/dd.txt"))){

            fileLines.forEach(System.out:: println);

        } catch (IOException e) {
            System.out.println("Oh no, error: " + e);
        } finally {
            System.out.println("You can always try again!");
        }
    }
}
