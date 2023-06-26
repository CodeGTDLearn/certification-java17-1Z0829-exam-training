package interfaces;

public class InterfaceAddressing implements IInt {
  public static void main(String[] args) {

    InterfaceAddressing s = new InterfaceAddressing();
    int j = s.thevalue;
    int k = IInt.thevalue;
    int l = thevalue;
    //int ll = this.thevalue;
  }
}

interface IInt {
  int thevalue = 0;
}