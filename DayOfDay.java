package org.day;

public class Main {
    public static void main(String[] args) {
        String [] day = {"Morning", "Afternoon", "Evening"};
        for (String days : day) {
            switch (days) {
                case "Morning" -> System.out.println("This is morning");
                case "Afternoon" -> System.out.println("This is afternoon");
                case "Evening" -> System.out.println("This is evening");
                default -> System.out.println("Unknown");

            }
        }
    }
}