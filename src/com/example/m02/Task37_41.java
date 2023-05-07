package com.example.m02;

public class Task37_41 {
    public static void main(String[] args) {
        //todo use english only
        System.out.println("Equal the Strings TASK 37");
        System.out.println("public, public - equals " + areNamesEqual("public", "public"));
        System.out.println("public, static - equals " + areNamesEqual("public", "static"));

        System.out.println("\n " + "Full Name: TASK 38 ");
        System.out.println(makeFullName("Grace", "Virgil"));

        System.out.println("\n " + "Lucky Name TASK 39 ");
        System.out.println("Oath is lucky name - " + isNameLucky("Oath"));
        System.out.println("Igun is lucky name - " + isNameLucky("Igun"));
        System.out.println("\n" + "Short name: TASK 40 ");
        System.out.println(getNameCode("t"));
        System.out.println(getNameCode("Mara"));
        System.out.println("\n" + "Money name : TASK 41");
        System.out.println(isMoneyName("5sv5"));
        System.out.println(isMoneyName("price"));
        System.out.println(isMoneyName("gerazzo"));
        System.out.println(isMoneyName("ger23azzo"));
    }

    public static boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public static String makeFullName(String firstName, String lastName) {
        return firstName + "\n " + lastName;
    }

    public static boolean isNameLucky(String name) {
        return name.contains("O") || name.contains("o") || name.contains("A") || name.contains("a");
    }

    public static String getNameCode(String name) {
        if (name.length() == 1) {
            return String.valueOf(name.charAt(0)).toUpperCase();
        }
        char lastChar = name.charAt(name.length() - 1);
        String result = "" + name.charAt(0) + lastChar;
        return result.toUpperCase();
    }

    public static boolean isMoneyName(String name) {
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);
        boolean isDigit = (firstLetter >= '0' && firstLetter <= '9')
                && (lastLetter >= '0' && lastLetter <= '9');
        return isDigit;
    }
}