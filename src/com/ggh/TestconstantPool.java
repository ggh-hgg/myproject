package com.ggh;

public class TestconstantPool {
    public static void main(String[] args) {
        String name = "Hello";

        String str2 = "Hello";

        String str3 ="hello";
        System.out.println(name==str2);

        System.out.println(name==str3);

        int i = str2.indexOf("HE");
        System.out.println(i);

        String str4 = "   I am HGG,this is my test project     ";
        System.out.println(str4);
        System.out.println(str4.trim());
        System.out.println(str4.trim().toUpperCase());
        System.out.println(str4.trim().toLowerCase());

    }
}
