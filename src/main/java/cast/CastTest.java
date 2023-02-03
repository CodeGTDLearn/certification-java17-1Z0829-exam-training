package cast;

public class CastTest {
  public static void main(String[] args) {
    byte by = 10;

// CAST ONLY BY-VARIABLE
    var o1 = ( (long) by ) / 10.0 * 3;
    checkType(o1);

    var o4 = (long) by / 10.0 * 3;
    checkType(o4);

// CAST ONLY WHOLE-EXPRESSION
    var o2 = (long) (by / 10.0 * 3);
    checkType(o2);

    var o3 = (short) (by / 10.0 * 3);
    checkType(o3);
  }

  private static void checkType(Object o2) {

    System.out.println((Object) o2.getClass().getName());
  }
}