package com.example.collections;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class WordStat {
    public static void main(String[] args) {

        Path p = Path.of("/Users/martfer/Documents/Takarékinfo/java/javasefizel/src/main/resources/nemzeti_dal.txt");


        try (Scanner scanner = new Scanner(p, UTF_8)/*.useDelimiter("[\\s.,;!?-]+")*/) {
            while( scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
