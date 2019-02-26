package com.example.lambda;

public class App {
    public static void main(String[] args) {

//        (String str) -> str.length();

        NoParam np = () -> 3;



        StringToIntMapper iface1 = new StringToIntMapper() {
            @Override
            public int map(String str) {
                return str.length();
            }
        };

        doIt(iface1);



        StringToIntMapper iface2 = str -> str.length();

        StringToIntMapper iface3 = (String str) -> (int)str.charAt(0);

        Other otherIf = (String str) -> str.length();

        doIt(iface3);

        doIt((String str) -> str.length());

//        doIt(new StringToIntMapper() {
//            @Override
//            public int map(String str) {
//                return str.length();
//            }
//        });

    }

    static void doIt(StringToIntMapper iface ) {
        System.out.println(iface.map("AHello World"));
    }

}
