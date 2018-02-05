package com.alexandelphi.designpatterns.abstractfactory.v2;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

  @Override
  public ESWeapon addESGun() {
    return new ESUFOBossGun();
  }

  @Override
  public ESEngine addESEngine() {
    return new ESUFOBossEngine();
  }
}
