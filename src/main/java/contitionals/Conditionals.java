package contitionals;

public class Conditionals {
  public static void main(String[] args) {

    var hasParams = (args == null ? false : true);
    if (hasParams) {
      System.out.println("has params");
    }
    {
      System.out.println("no params");
    }
  }
}