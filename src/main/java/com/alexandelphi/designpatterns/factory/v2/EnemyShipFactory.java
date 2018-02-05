package com.alexandelphi.designpatterns.factory.v2;

import java.util.Scanner;

public class EnemyShipFactory {

  public EnemyShip makeEnemyShip(String newShipType) {
    EnemyShip newShip = null;
    if (newShipType.equals("U")) {
      newShip = new UFOEnemyShip();
    } else if (newShipType.equals("R")) {
      newShip = new RocketEnemyShip();
    } else if (newShipType.equals("B")) {
      newShip = new BigUFOEnemyShip();
    } else {
      return null;
    }
    return newShip;
  }

}
