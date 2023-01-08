package forLoopTests;

public class ForStatementTests {


  public static void main(String args[]) {

    var i = 0;
    for (i = 1; i < 5; i++)          continue;
    for (i = 0; ; i++)               break   ;


    i = 0;
    for (i = 1; i < 5; i++) {
      System.out.println("Enter in first For: " + i);
      continue;
    }

    for (i = 0; ; i++) {
      System.out.println("Enter in second For: " + i);
      break;
    }

//    for (; i == 5 ? false : true; ) {
//      System.out.println("Enter in ==5 For: " + i + (i == 5 ? false : true));
//    }

  }

}