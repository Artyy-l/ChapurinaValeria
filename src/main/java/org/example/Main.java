package org.example;

import animals.*;
import food.*;

public class Main {
  public static void main(String[] args) {
    Horse horse = new Horse("Лошадь1");
    horse.walk();
    horse.eat(new Grass());
    horse.setName("Крутая лошадь");
    System.out.println("====================================================\n");

    Tiger tiger = new Tiger("Тигр Петя");
    tiger.walk();
    tiger.eat(new Meat("Говядина"));
    System.out.println("====================================================\n");

    Eagle eagle = new Eagle("Орёл Вася");
    eagle.fly();
    eagle.eat(new Meat("Говядина"));
    eagle.eat(new Meat("Стейк"));
    System.out.println("====================================================\n");

    Dolphin dolphin = new Dolphin("Дельфин Макар");
    dolphin.swim();
    dolphin.eat(new Meat("Рыба"));
    System.out.println("====================================================\n");

    Camel camel = new Camel("Верблюд Илья");
    camel.walk();
    camel.eat(new Grass());
    camel.setName("Хороший верблюд");
    System.out.println("====================================================\n");

    System.out.println("Что будет, если передавать неправильные параметры:");

    // Во избежание копипаста можно написать вот так
    testAnimalAction(() -> {
      System.out.println("1. Дать тигру не говядину:");
      tiger.eat(new Meat("Какое-то мясо"));
    });

    testAnimalAction(() -> {
      System.out.println("2. Создать животное с именем \"\":");
      new Tiger("");
    });
  }

  /**
   * Пытается выполнить переданное действие. Если в процессе выполнения возникает ошибка,
   * выводит сообщение об исключении красным цветом в консоль, не прерывая выполнение программы.
   *
   * @param action действие, которое необходимо выполнить. Это должно быть лямбда-выражение или
   *               объект, реализующий интерфейс {@link Runnable}.
   * @throws NullPointerException если переданный параметр {@code action} равен {@code null}.
   */
  public static void testAnimalAction(Runnable action) {
    try {
      action.run();
    } catch (Exception ex) {
      // Выводим ошибку красным цветом для выразительности
      System.out.println("\u001B[31m" + ex.getMessage() + "\u001B[0m");
    }
  }
}
