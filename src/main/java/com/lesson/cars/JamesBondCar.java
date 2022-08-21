package com.lesson.cars;

public class JamesBondCar extends Car{
    @Override
    public int drive(int howlong) {
        distance = howlong * 180;
        return super.drive(howlong);
    }
}
