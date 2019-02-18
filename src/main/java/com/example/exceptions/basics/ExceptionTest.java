package com.example.exceptions.basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class ExceptionTest {

    public static void hello(long id) throws MyException {
        throw new IdNotFoundException(id);
    }

    public static void main(String[] args) throws MyException, IOException {
        try {


            if (new Random().nextBoolean()) {
                hello(222L);
            }
            Files.newInputStream(Paths.get("/tmpppp"), StandardOpenOption.CREATE);
        } catch (IdNotFoundException ex) {
            System.out.println("id not found: " + ex.getId());
        } catch (MyException | IOException ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            System.out.println("finally");
        }
    }
}
