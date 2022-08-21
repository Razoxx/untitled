package com.lesson.caard;

public class TemperatureConverter {


    public int converterTemp(int temperature, char convertTo){
        switch (convertTo) {
            case 'C':
                temperature = temperature + 273;
                break;
            case 'F':
                temperature = temperature - 273;
                break;
            default:
                System.out.println("Data error");
                break;
        }
        return temperature;
    }

    public static void main(String[] args){
        TemperatureConverter myTemp = new TemperatureConverter();
        int tempnow = myTemp.converterTemp(56, 'F');
        System.out.println(tempnow);
    }
}







