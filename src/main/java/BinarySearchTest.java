import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

  public static void main(String[] args) {

    List<String> letters = new ArrayList<String>();
    letters.addAll(List.of("a", "c", "b"));

    Collections.sort(letters);
    System.out.println(letters);
    System.out.println(Collections.binarySearch(letters, "c"));

    Collections.reverse(letters);
    System.out.println(letters);
    System.out.println(Collections.binarySearch(letters, "c"));
  }

}