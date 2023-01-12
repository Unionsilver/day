package org.example;

public class Main {
    public static void main(String[] args) {
        String [] dogBreed = {"Long haired dog", "Short haired dog"};
        for (String dog : dogBreed) {
            String result = switch (dog) {
                case "Long haired dog" -> "This is Long Hair Dog";
                case "Short haired dog" -> "This is Short Hair Dog";
                default -> "Unknown";

            };
            System.out.println(result);

        }
    }
}