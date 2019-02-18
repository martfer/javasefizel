package com.example.basics;

import java.text.Normalizer;


public class UnicodeCharsDemo
{
    public static void main( String[] args )
    {

        String kv = "caffé";
        String kvDecomp = "caff\u0065\u0301";

        System.out.println("length of \"" + kv + "\" is " + kv.length());
        System.out.println("length of \"" + kvDecomp+ "\" is " + kvDecomp.length());


        String normalized = Normalizer.normalize(kvDecomp, Normalizer.Form.NFC);
        System.out.println("kv equals to normalized " + kv.equals(normalized));


    }
}
