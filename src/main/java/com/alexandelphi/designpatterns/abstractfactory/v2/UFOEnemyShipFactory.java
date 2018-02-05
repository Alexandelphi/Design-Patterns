package com.alexandelphi.designpatterns.abstractfactory.v2;

public class UFOEnemyShipFactory implements EnemyShipFactory {

  @Override
  public ESWeapon addESGun() {
    return new ESUFOGun();
  }

  @Override
  public ESEngine addESEngine() {
    return new ESUFOEngine();
  }
}
