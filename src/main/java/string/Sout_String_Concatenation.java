package string;

public class Sout_String_Concatenation {
  public static void main(String[] args) {

    //    System.out.println(null); // DIRECT 'NULL' IS NOT ALLOWED

    //Encapsulating NULL in any Object
    String myNullStoragedString = null;
    System.out.println(myNullStoragedString);

    Object myNullStoragedObject = null;
    System.out.println(myNullStoragedObject);

    String newStringConcat = "myStringConcat";
    //    newStringConcat.concat(myNullStoragedString); // NOT ALLOWED


    System.out.println("stage 01" + null + true);
    System.out.println(true);
//    System.out.println(null + true + "stage 01.1"); // COMPILE-ERROR
//    System.out.println(null + null + "stage 01.1"); // COMPILE-ERROR
//    System.out.println(true + false + "stage 01.1"); // COMPILE-ERROR
    System.out.println("stage 02" + null + true);
    System.out.println("stage 02" + null);
    System.out.println("stage 03" + true);
    System.out.println(true + " - stage 03.1");
    System.out.println(null + " - stage 03.2");
    System.out.println(false + " - stage 04 - " + true);
    System.out.println(false + " - stage 04 - " + true + true);
    System.out.println(false + " - stage 04 - " + true + true + null);
    System.out.println(null + " - stage 05 - " + null);
    System.out.println(null + " - stage 05 - " + null + null);
    System.out.println(null + " - stage 05 - " + null + null + null);
    System.out.println(null + " - stage 06 - " + true + " - stage 06 - ");
    System.out.println(true + " - stage 07 - " + null + " - stage 07 - ");
//    System.out.println(null + true + " - stage 08 - " + true);// COMPILE-ERROR
//    System.out.println(null + null + " - stage 08 - " + true);// COMPILE-ERROR
//    System.out.println(false + null + " - stage 08 - " + true);// COMPILE-ERROR
//    System.out.println(false + false + " - stage 08 - " + true);// COMPILE-ERROR
  }
}