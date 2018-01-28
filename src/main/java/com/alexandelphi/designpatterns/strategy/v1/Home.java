package com.alexandelphi.designpatterns.strategy.v1;

public class Home {

  public static void main(String[] args) {
    Animal doggy = new Dog();
    Cat kitty = new Cat();

    doggy.setName("Jack");
    System.out.println(doggy.getName());
    System.out.println(doggy.getSound());
    ((Dog) doggy).digHole();

    kitty.setName("Samantha");
    System.out.println(kitty.getName());
    System.out.println(kitty.getSound());
    kitty.catchMouse();

    System.out.println("Doggy: " + doggy.tryToClimbTree());
    System.out.println("Kitty: " + kitty.tryToClimbTree());

    //set a climbing ability to the dog
    doggy.setClimbingTreeAbility(new CanClimb());
    System.out.println("Doggy: " + doggy.tryToClimbTree());
  }

}
