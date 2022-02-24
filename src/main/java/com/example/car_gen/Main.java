package com.example.car_gen;

public class Main {
    public static void main(String[] args) {
        Honda civic = new Honda("black", 2003, 60, false);
        Lexus rx350 = new Lexus("gray", 2010, 40, true);
        Toyota supra = new Toyota("red", 2020, 50, false);
        System.out.println(civic.getColor());
        System.out.println(rx350.getYear());
        System.out.println(supra.getMaxSpeed());
        System.out.println(civic.accelerateSpeed());
        System.out.println(civic.accelerateSpeed());
        civic.setMaxSpeed(12);
        System.out.println(civic.accelerateSpeed());

    }
}
