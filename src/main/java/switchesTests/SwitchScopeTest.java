package switchesTests;

public class SwitchScopeTest {
  public static void main(String[] args) {

    switch (Integer.parseInt(args[1])) {
      case 0:
        var a = 2;
        var b = false;
        break;
      case 1:
//        int a = 3; // Compilation-Error
        b = true;
        break;
    }

//    if (b) System.out.println(args[2]); // Compilation-Error
  }
}