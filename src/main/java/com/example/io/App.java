package com.example.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {


        App app = new App();

        app.doIt();


        Path p = Path.of("adoszamok.txt");
//        System.out.println(p.toAbsolutePath());
//        System.out.println(System.getProperty("user.dir"));

        FileReader fr = new FileReader(p.toFile(), Charset.forName("ISO-8859-2"));
        BufferedReader br = new BufferedReader(fr);

//        br  = Files.newBufferedReader(p, StandardCharsets.UTF_8);

        String line = br.readLine();

        while( line  != null ) {
            System.out.println(line);
            line = br.readLine();
        }

        br.close();


//        Scanner lineScanner = new Scanner(p);

//        String adoszam = lineScanner.next();
//        System.out.println(lineScanner.next());
//        System.out.println(lineScanner.next());

//        while(lineScanner.hasNextLine()) {
//            String adoszam = lineScanner.nextLine();
//            System.out.print(adoszam + "\t");
//            boolean validTaxNumber = app.isValidTaxNumber(adoszam);
//            System.out.println( "'" + (validTaxNumber ? "OK" : "-") );
//
////            if ( app.isValidTaxNumber(adoszam) ) {
////                System.out.println("OK");
////            } else {
////                System.out.println("-");
////            }
//        }

//        Scanner scanner = new Scanner(adoszam).useDelimiter("-");
//        System.out.println(scanner.next());
//        System.out.println(scanner.next());
//        System.out.println(scanner.next());


    }

    public boolean isValidTaxNumber(String taxNumber) {
        Scanner scanner = new Scanner(taxNumber).useDelimiter("-");
        String identifier = scanner.next();
        if(identifier.length() != 8 ) {
            return false;
        }
        for (int i = 0; i < identifier.length() ; i++) {
            if( !Character.isDigit(identifier.charAt(i)) ) {
//            char c = identifier.charAt(i);
//            if( ! ( (c >= '0') && (c <= '9') ) ) {
                return false;
            }
        }

        return true;
    }

    public void doIt()  {
        try {
            BufferedReader br  = Files.newBufferedReader(Path.of("valami.txt"), StandardCharsets.UTF_8);
            throw new RuntimeException("new runtimexception");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            // runtime
        }
    }
}
