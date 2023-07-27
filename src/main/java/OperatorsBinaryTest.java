public class OperatorsBinaryTest {

  public static void main(String[] args) {

    int x = - 1;
    int y = ~ x;
    int z = x ^ y;
    System.out.println("--------------------" + "\nx: " + x); // -1
    System.out.println("~ x: " + y); // 0
    System.out.println("x ^ (~ x): " + z + "\n"); // 1

    x = y = z = 0;
    x = 0;
    y = ~ x;
    z = x ^ y;
    System.out.println("--------------------" + "\nx: " + x); // 0
    System.out.println("~ x: " + y); // -1
    System.out.println("x ^ (~ x): " + z + "\n"); // -1

    x = y = z = 0;
    x = 1;
    y = ~ x;
    z = x ^ y;
    System.out.println("--------------------" + "\nx: " + x); // 1
    System.out.println("~ x: " + y); // -2
    System.out.println("x ^ (~ x): " + z + "\n"); // -3

    x = y = z = 0;
    x = 2;
    y = ~ x;
    z = x ^ y;
    System.out.println("--------------------" + "\nx: " + x); // 2
    System.out.println("~ x: " + y); // -3
    System.out.println("x ^ (~ x): " + z + "\n"); // -1

    x = y = z = 0;
    x = 3;
    y = ~ x;
    z = x ^ y;
    System.out.println("--------------------" + "\nx: " + x); // 3
    System.out.println("~ x: " + y); // -4
    System.out.println("x ^ (~ x): " + z + "\n"); // -5

    x = y = z = 0;
    x = 4;
    y = ~ x;
    z = x ^ y;
    System.out.println("--------------------" + "\nx: " + x); // 4
    System.out.println("~ x: " + y); // -5
    System.out.println("x ^ (~ x) ): " + z + "\n"); // -1

    x = y = z = 0;
    x = 5;
    y = ~ x;
    z = x ^ y;
    System.out.println("--------------------" + "\nx: " + x); // 4
    System.out.println("~ x: " + y); // -5
    System.out.println("x ^ (~ x): " + z + "\n"); // -1
  }
}