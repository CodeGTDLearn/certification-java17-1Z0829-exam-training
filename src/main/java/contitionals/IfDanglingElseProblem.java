package contitionals;

public class IfDanglingElseProblem {
  public static void main(String[] args) {


    String myArray[] = new String[]{"close"};

    if (myArray[0].equals("open")) // IF 1
      if (myArray[0].equals("open")) // IF 2
        if (myArray[0].equals("open")) // IF 3
          System.out.println("Hello!");
        else System.out.println("Go away " + myArray[1]); // IF 3 (closer this else)
      else System.out.println("Go away " + myArray[1]); // IF 2 (closed this else)
  }
}