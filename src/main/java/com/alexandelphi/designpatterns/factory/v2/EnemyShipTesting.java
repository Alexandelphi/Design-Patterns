package com.alexandelphi.designpatterns.factory.v2;

import java.util.Scanner;

public class EnemyShipTesting {

  public static void main(String[] args) {
    EnemyShipFactory shipFactory = new EnemyShipFactory();

    EnemyShip theEnemy = null;
    Scanner userInput = new Scanner(System.in);
    System.out.println("What type of ship? (U / R / B )");

    if (userInput.hasNextLine()) {
      String typeOfShip = userInput.nextLine();
      theEnemy = shipFactory.makeEnemyShip(typeOfShip);
    }

    if (theEnemy != null) {
      doStuffEnemy(theEnemy);
    } else {
      System.out.println("Support only U / R / B types.");
    }
  }

  public static void doStuffEnemy(EnemyShip anEnemyShip) {
    anEnemyShip.displayEnemyShip();
    anEnemyShip.followHeroShip();
    anEnemyShip.enemyShipShoots();
  }
}
