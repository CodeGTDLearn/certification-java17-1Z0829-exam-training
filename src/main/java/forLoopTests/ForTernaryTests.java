package forLoopTests;

public class ForTernaryTests {
  public static void main(String args[]) {

    var i = 0;
    for (i = 1; i < 5 ? true : false; i++) {
      System.out.println("Enter in first For TERNARY: " + i);
    }

    System.out.println("\n");
    i = 0;
    for (i = 1; i < 5 ; i++) {
      System.out.println("Enter in second For TERNARY: " + i);
    }

    System.out.println("\n");
    i = 0;
    for (i = 1; i < 5 ? true : false ; i++)  System.out.println("Third TERNARY: " + i);

  }

}