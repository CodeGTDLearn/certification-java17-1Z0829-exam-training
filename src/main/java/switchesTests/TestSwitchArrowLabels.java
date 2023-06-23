package switchesTests;

public class TestSwitchArrowLabels {
  public static void main(String[] args) {

    calculate(2);
  }

  public static void calculate(int x) {

    String val = switch (x) {
      //      case 2 -> ;   // Compile-error
      //      case 2 ->     // Compile-error
      //      case 2 -> ""  // Compile-error
      case 2 -> "";
      default -> "def";
    };
    System.out.println(val);
  }
}