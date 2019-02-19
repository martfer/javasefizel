package com.example.collections;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class WordStat {
    public static void main(String[] args) {

        Path p = Path.of("/Users/martfer/Documents/Takarékinfo/java/javasefizel/src/main/resources/nemzeti_dal.txt");

        Map<String, Integer> stat = new HashMap<>();

        try (Scanner scanner = new Scanner(p, UTF_8).useDelimiter("[\\s.,;!?-]+")) {
            while( scanner.hasNext()) {
                String word = scanner.next().toLowerCase();

                if (stat.get(word) == null) {
                    stat.put(word, 1); //Boxing 1 into Integer
                } else {
                    int num = stat.get(word);   //Unboxing Integer to int
                    stat.put(word, num + 1);    //Boxing int into Integer
                }
                // You can do it in one line
                //stat.put(word, stat.getOrDefault(word, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(stat);

        Set entrySet = stat.entrySet();
        List sorted = new LinkedList(entrySet);


        sorted.sort(new EntryComparator());

        for (int i = 0; i < 5; i++) {
            System.out.println(sorted.get(i));
        }
    }
}
