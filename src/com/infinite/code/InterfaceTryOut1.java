package com.infinite.code;
class Dog1 {

    public String cuddle() {
        return "Purring sounds";
    }

    public void eat() {
        System.out.println("Eating stereotypical bones");

    }

}

class Cat1 {

    public String cuddle() {
        return "Yawning sounds";
    }

    public void eat() {
        System.out.println("Eating stereotypical fish");

    }
}
class PetAdoptionCenter1 {

    public static void adoptPet(Dog1 pet) {
        System.out.println("You have successfully adopted the dog.");
    }

    public static void adoptPet(Cat1 pet) {
        System.out.println("You have successfully adopted the cat.");
    }

    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        adoptPet(dog1);

        Cat1 cat1 = new Cat1();
        adoptPet(cat1);
    }
}
public class InterfaceTryOut1 {

}
