package com.example.io;

import java.io.*;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class IODemo {
    public static void main(String[] args) throws IOException, InterruptedException {

        Path p = Path.of("/Users/martfer/Documents/Takarékinfo/java/2nd_week/src/hu/takarekinfo/io/IODemo.java");
        Paths.get("/Users/martfer/Documents/Takarékinfo/java/2nd_week/src/hu/takarekinfo/io/IODemo.java");

        System.out.println(p);
        String s = new String(Files.readAllBytes(p), "UTF-8");
        System.out.println(s);
        // or since java 11
        s = Files.readString(p, StandardCharsets.UTF_8);
        s = Files.readString(p, Charset.forName("UTF-8"));


        FileInputStream fis = new FileInputStream(p.toFile());
        FileLock lock = fis.getChannel().lock(0L,Long.MAX_VALUE, true);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
        Thread.sleep(15000);
    }
}
