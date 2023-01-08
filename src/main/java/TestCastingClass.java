interface Flyer {
  String getName();
}

class Bird implements Flyer {
  public String name;

  public Bird(String name) {

    this.name = name;
  }

  public String getName() {

    return name;
  }
}

class Eagle extends Bird {
  public Eagle(String name) {

    super(name);
  }
}

public class TestCastingClass {
  public static void main(String[] args) throws Exception {

    Flyer f = new Eagle("American Bald Eagle");

    System.out.println(f.getName());
    System.out.println(((Eagle)f).name);
    System.out.println(((Bird)f).getName());
    System.out.println(((Eagle)f).getName());
  }
}