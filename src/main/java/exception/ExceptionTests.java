package exception;

public class ExceptionTests {

  public static void main(String[] args) {
    parseFloat("0.0f");
  }

  public static float parseFloat(String s) {

    float f = 0.0f;
    try {
      f = Float.valueOf(s)
               .floatValue();
      System.out.println("enter in Try");
      return f;
    }
    catch (NumberFormatException nfe) {
      f = Float.NaN;
      System.out.println("enter in Catch");
      return f;
    }
    finally {
      System.out.println("enter in Finally");
      f = 10.0f;
      return f;
    }
  }
}