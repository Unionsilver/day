package org.daytime;

public class Main {
    public static void main(String[] args) {
        String [] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        getDayOfWeek(dayOfWeek[0]);
        getDayOfWeek(dayOfWeek [5]);

    }
    public static void getDayOfWeek (String weekDay){
        if (weekDay.equals( "Saturday") || weekDay.equals("Sunday" )) {
            System.out.print("Day off");
        }
        else if (weekDay.equals ("Monday") || weekDay.equals("Tuesday") || weekDay.equals ("Wednesday")
                || weekDay.equals("Thursday") || weekDay.equals("Friday") )  {
            System.out.println("Working day");
        }
        else {
            System.out.println("Unknown value");
        }
    }
}