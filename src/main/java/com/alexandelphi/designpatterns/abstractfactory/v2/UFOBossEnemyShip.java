package com.alexandelphi.designpatterns.abstractfactory.v2;

public class UFOBossEnemyShip extends EnemyShip {

  EnemyShipFactory shipFactory;

  public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
    this.shipFactory = shipFactory;
  }

  @Override
  void makeShip() {
    System.out.println("Making enemy ship " + getName());

    weapon = shipFactory.addESGun();
    engine = shipFactory.addESEngine();
  }
}
