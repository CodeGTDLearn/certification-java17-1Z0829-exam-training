package forLoopTests;

public class ForTests {

  private static void show(String text) {

    System.out.println(text);
  }

  public static void main(String[] args) {

    int INT1 = 1, INT2 = 4;


    INT1 = 1;
    INT2 = 4;
    for (var i = INT1; i < INT2; i++) {
      show("Refer: "+i);
    }
    show("\n");

    INT1 = 1;
    INT2 = 4;
    for (int i = INT1; i < INT2; show("1-Loop" + ++ i)) ;
    show("\n");

    INT1 = 1;
    INT2 = 4;
    for (int i = INT1; i++ < INT2; show("2-Loop" + i)) ;
    show("\n");

    INT1 = 1;
    INT2 = 4;
    int i = INT1;
    while (i++ < INT2) {
      show("3-Loop" + i);
    }
    show("\n");

    INT1 = 1;
    INT2 = 4;
    i=INT1;
    do {
      show("4-Loop" + i);
    } while (i++ < INT2);
    show("\n");

  }
}