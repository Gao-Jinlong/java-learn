public class GenericMethodTest {

  public static <E> void printArray(E[] inputArray) {
    for (E element : inputArray) {
      System.out.printf("%s", element);
    }
    System.out.println();
  }

  public static void main(String args[]) {
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

    System.out.println("Array integerArray contains:");
    printArray(intArray);

    System.out.println("\nArray doubleArray contains:");
    printArray(doubleArray);

    System.out.println("\nArray characterArray contains:");
    printArray(charArray);

    System.out.println(maximum(3, 4, 5));
    System.out.println(maximum(6.6, 8.8, 7.7));
    System.out.println(maximum("pear", "apple", "orange"));
  }

  /** 约束泛型的类型 */
  public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
    T max = x;
    if (y.compareTo(max) > 0) {
      max = y;
    }
    if (z.compareTo(max) > 0) {
      max = z;
    }
    return max;
  }
}