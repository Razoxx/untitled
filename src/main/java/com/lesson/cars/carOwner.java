package com.lesson.cars;

public class carOwner {
    public static void main(String[] args) {
        JamesBondCar jbc = new JamesBondCar();
        Car myCar = new Car();
        myCar.drive(5);
        System.out.println(" я проехал " + myCar.distance + " km.");
        jbc.drive(14);
        System.out.println(" JamesBondCar проехал " + jbc.distance + " km.");
    }
}
