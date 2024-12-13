package org.example;

/**
 * Реализация пользовательского списка на основе массива
 * @param <A> тип элементов, хранимых в списке
 */
public class CustomArrayList<A> implements CustomList<A> {
  private Object[] elements;
  private int size;

  /**
   * Конструктор создаёт пустой список с начальной ёмкостью 10
   */
  public CustomArrayList() {
    elements = new Object[10];
    size = 0;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void add(A element) {
    if (element == null) {
      throw new IllegalArgumentException("Null values are not allowed.");
    }
    if (size == elements.length) {
      resize();
    }
    elements[size++] = element;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public A get(int index) {
    validateIndex(index);
    return (A) elements[index];
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public A remove(int index) {
    validateIndex(index);
    A removedElement = (A) elements[index];
    shiftLeft(index);
    size--;
    return removedElement;
  }

  /**
   * Увеличивает размер внутреннего массива в два раза
   */
  private void resize() {
    Object[] newElements = new Object[elements.length * 2];
    System.arraycopy(elements, 0, newElements, 0, elements.length);
    elements = newElements;
  }

  /**
   * Проверяет, находится ли индекс в пределах допустимого диапазона
   * @param index индекс для проверки
   * @throws IndexOutOfBoundsException если индекс выходит за пределы размера списка
   */
  private void validateIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of range");
    }
  }

  /**
   * Сдвигает элементы массива влево, начиная с указанного индекса
   * @param startIndex индекс, с которого начинается сдвиг
   */
  private void shiftLeft(int startIndex) {
    for (int i = startIndex; i < size - 1; ++i) {
      elements[i] = elements[i + 1];
    }
  }

  /**
   * Возвращает текущий размер списка
   * @return количество элементов в списке
   */
  public int size() {
    return size;
  }

  /**
   * Проверяет, является ли список пустым
   * @return true, если список пуст, иначе false
   */
  public boolean isEmpty() {
    return size == 0;
  }
}
