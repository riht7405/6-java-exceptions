package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {

        try {
            System.out.println(getSeason(-5));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new MyException(
                    "monthNumber " + monthNumber + " is invalid, month number should be between 1..12"
            );
        }

        if (monthNumber == 12 || monthNumber <= 2) return "зима";
        if (monthNumber <= 5) return "весна";
        if (monthNumber <= 8) return "лето";
        return "осень";
    }
}