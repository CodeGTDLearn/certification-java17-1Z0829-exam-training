public class StringTrimEmptyBlank {
    public static void main(String args[]) {
      String myText = "xx";
      System.out.println("Blank: " + myText.isBlank());
      System.out.println("Empty: " + myText.isEmpty() + "\n");


      myText = "    ";
      System.out.println("4 Blank-spaces: " + myText.isBlank());
      System.out.print("Empty: " + myText.isEmpty() + " - " +myText.length() + "\n\n");

      myText = " ";
      System.out.println("1 Blank-space: " + myText.isBlank());
      System.out.println("Empty: " + myText.isEmpty() + "\n");

      myText = "";
      System.out.println("nothing - Blank: " + myText.isBlank());
      System.out.println("nothing - Empty: " + myText.isEmpty() + "\n");
    }
}