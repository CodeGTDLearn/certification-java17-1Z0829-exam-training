package contitionals;

public class For_conditional_2 {
  public static void main(String args[]) {

    var sum = 0;
    for (int i = 0, j = 10; sum > 20; ++ i, -- j) // compile
    {
      sum = sum + i + j;   // "compile" BUt UNREACHABLE
    }
    System.out.println("Sum = " + sum);

    var myBool = false;
    for (int i = 0, j = 10; myBool; ++ i, -- j) // compile
    {
      sum = sum + i + j;   // "compile" BUt UNREACHABLE
    }
    System.out.println("Sum = " + sum);
  }
}