package string;

import java.util.Arrays;

public class varargsTest {

  public static void main(String[] args) {

    // VAR-ARGS "CONVERT" ITEMS GIVEN, IN AN "ARRAY"
    varArgsTestOverload("1-a", "b", "c");

    final String[] myStringArray = {"2-X", "Y", "Z"};

    System.out.println(myStringArray.hashCode());
    varArgsTestOverload(myStringArray);
    varArgsTestOverload(new String[]{"3-1","2"});

    arrayTest(new String[]{"4-x","y"});
   // arrayTest("a", "b", "c"); - COMPILE-ERROR

    stringTest("5-d","e");
    varArgsTestOverload("5-d","e");
  }

  public static void varArgsTestOverload(String... varargsConvertFromItemsToArray) {

    System.out.println(varargsConvertFromItemsToArray.hashCode());

    Arrays
         .stream(varargsConvertFromItemsToArray)
         .peek(System.out::println)
         .toList();
  }

  public static void varArgsTestOverload(String str1, String str2) {

    System.out.println("""
                            
                            My Strings are: %s, %s
                            """.formatted(str1,str2));
  }

  public static void arrayTest(String[] myArray) {

    Arrays
         .stream(myArray)
         .peek(System.out::println)
         .toList();

  }

  public static void stringTest(String str1, String str2) {

    System.out.println("""
                            
                            My Strings are: %s, %s
                            """.formatted(str1,str2));

  }

}