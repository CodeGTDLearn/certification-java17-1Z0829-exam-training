package String_sout;

public class TestSout {
  public static void main(String[] args) {

//    System.out.println(null); // NOT ALLOWED

    //Encapsulating NULL in any Object
    String myNullString = null;
    System.out.println(myNullString);

    Object myNullObject = null;
    System.out.println(myNullObject);

    String newStringConcat = "myStringConcat";
//    newStringConcat.concat(myNullString); // NOT ALLOWED
  }
}