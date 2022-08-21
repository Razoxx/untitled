package com.lesson.pett;

public class Fish extends Pet {
    int currentDepth ;
    Fish (int currentDepth){
        this.currentDepth = currentDepth;
    }

    public Fish() {
        currentDepth = 0;
    }


    public int dive(int howDeep){
        currentDepth = currentDepth+howDeep;
        if (currentDepth > 100){
            System.out.println("Я маленькая рыбка"+
                    " и не могу плавать глубже 100 метров");
            currentDepth=currentDepth - howDeep;
        }else {
            System.out.println("Погружаюсь ещё на " + howDeep +
                    " метров");
            System.out.println("Я на глубине " + currentDepth +
                    " метров");
        }
        return currentDepth;
    }


    public String say(String something){
        return "Ты чё не знаешь, что рыбы не разговаривают?";
    }


}


