import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListArayListTest {
  public static void main(String[] args) {

    ArrayList<String> arListStr = new ArrayList<>();
    arListStr.add("b");
    arListStr.add("c");
    arListStr.add("a");
//    arListStr.sort();
    arListStr.sort(null);
    arListStr.sort(Comparator.naturalOrder());

    System.out.println(arListStr.toString());

    List<String> listStr = new ArrayList<>();
    listStr.add("bb");
    listStr.add("cc");
    listStr.add("aa");
//    listStr.sort();
    listStr.sort(null);
    listStr.sort(Comparator.naturalOrder());
    System.out.println(listStr.toString());



  }


}