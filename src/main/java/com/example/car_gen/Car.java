package com.example.car_gen;

public class Car {
    boolean isElectric;
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;

    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int accelerateSpeed() {
        int newSpeed = speed + 5;
        if (newSpeed > maxSpeed) {
            newSpeed = maxSpeed;
        }
        speed = newSpeed;
        return speed;
    }

    public int decelerateSpeed() {
        int newSpeed = speed - 5;
        if (newSpeed < 0) {
            newSpeed = 0;
        }
        speed = newSpeed;
        return speed;
    }

    public boolean convertToElectric() {
        if (isElectric) {
            System.out.println("The car is already electric");
        } else {
            isElectric = true;
        }
        return isElectric;
    }
}
