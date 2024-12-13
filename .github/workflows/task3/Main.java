package org.example;

public class Main {
  public static void main(String[] args) {
    CustomArrayList<String> customList = new CustomArrayList<>();

    customList.add("Элемент 1");
    customList.add("Элемент 2");
    customList.add("Элемент 3");
    System.out.println("Список после добавления элементов:");
    for (int i = 0; i < customList.size(); ++i) {
      System.out.println(customList.get(i));
    }

    System.out.println("\nЭлемент по индексу 1: " + customList.get(1));

    System.out.println("\nУдаляем элемент по индексу 1: " + customList.remove(1));
    System.out.println("Список после удаления элемента:");
    for (int i = 0; i < customList.size(); ++i) {
      System.out.println(customList.get(i));
    }

    System.out.println("\nСписок пуст? " + customList.isEmpty());
  }
}