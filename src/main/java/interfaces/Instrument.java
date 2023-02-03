package interfaces;

interface Instrument {
  default void reset() {

    System.out.println("In Instrument");
  }
}

class Debt implements Instrument {
}

class Bond extends Debt {
  public void reset() {

    super.reset();
    System.out.println("In Bond");
  }
}

class ZCBond extends Bond {
  ZCBond() {

    reset();
  }

  public void reset() {

    super.reset();
    System.out.println("In ZCBond");
  }

  public static void main(String args[]) {

    Instrument i = new ZCBond();
  }
}