package com.lesson.pett;

public class Fish extends Pet {
    int currentDepth = 0;


    public int dive(int howDeep){
        currentDepth = currentDepth+howDeep;
        System.out.println("Ныряю на глубину " + howDeep + " метрa");
        System.out.println("Я на глубине "
                + currentDepth + " метров ниже уровня моря");
        return currentDepth;
    }

    @Override
    public String say(String something){
        return "Ты чё не знаешь, что рыбы не разговаривают?";
    }


}


