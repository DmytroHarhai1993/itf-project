package com.example.m02;

public class NameEncoderDecoder {
    public static void main(String[] args) {
        System.out.println(encode("europe"));
        System.out.println(encode("Crab"));
        System.out.println(decode("Cr5b"));

    }

    public static String encode(String name) {
        name = name.replace("e", "1").replace("u", "2").replace("i", "3").replace("o", "4").replace("a", "5");
        final String preName = "NOTFORYOU";
        final String afterName = "YESISNOTFORYOU";
        return preName + name + afterName;
    }

    public static String decode(String name) {
        return name.replace("1", "e").replace("2", "u").replace("3", "1").replace("4", "0").replace("5", "a");
    }
}













