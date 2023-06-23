class SuperClass {
  public SuperClass(int m) {

  }

  public SuperClass() {

  }
}

public class ConstructorsTest extends SuperClass {
  int i, j, k;

  public ConstructorsTest(int m, int n) {

//    super(1);
    i = m;
    j = m;
  } //1

  public ConstructorsTest(int m) {

    super(m);
  }
}