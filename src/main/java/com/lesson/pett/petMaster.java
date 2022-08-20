package com.lesson.pett;

public class petMaster {
    public static void main(String[] args) {
        String petReaction;

        Pet myPet = new Pet();
        Fish myFish = new Fish();
        myPet.eat();
        myPet.sleep();
        myFish.say("Привет");
        petReaction = myPet.say("Чик чирик");
        System.out.println(petReaction);
        myFish.dive(2);
        myFish.dive(3);
        myFish.dive(myFish.currentDepth);
        myFish.sleep();






    }
}
