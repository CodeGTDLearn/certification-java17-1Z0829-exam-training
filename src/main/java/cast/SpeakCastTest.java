package cast;

public class SpeakCastTest {
  public static void main(String[] args) {

    SpeakCastTest s = new GoodSpeakCastTest();

    ((GoodSpeakCastTest) s).up();
    ((Tone) s).up();
  }
}

class GoodSpeakCastTest extends SpeakCastTest implements Tone {
  public void up() {

    System.out.println("UP UP UP");
  }
}

interface Tone {
  void up();
}