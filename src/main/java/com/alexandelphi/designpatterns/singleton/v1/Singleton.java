package com.alexandelphi.designpatterns.singleton.v1;

// ThreadSafe singleton pattern
public class Singleton {

  private static volatile Singleton instance;

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}
