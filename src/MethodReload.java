public class MethodReload {
  public static double max(double num1, double num2) {
    if (num1 > num2) {
      return num1;
    } else {
      return num2;
    }
  }

  public static int max(int num1, int num2) {
    if (num1 > num2) {
      return num1;
    } else {
      return num2;
    }
  }

  public static void main(String[] args) {
    int num1 = (int) (Math.random() * 10);
    int num2 = (int) (Math.random() * 10);

    int max = max(num1, num2);

    System.out.println("max value is:" + max);
  }
}
