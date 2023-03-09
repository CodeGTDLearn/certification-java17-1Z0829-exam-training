package poliphorm_hibrids.hibrid;

class FatherNoInt {

  public String fatherInstanceVariable = "fatherInstanceVariable";
  public static String fatherStaticField = "fatherStaticField";

  public String testInstance() {

    return "-> in FatherNoInt";
  }

  public static String fatherStaticMethod() {

    return "in fatherStaticClassMethod";
  }
}

class ChildNoInt extends FatherNoInt {

  public String ChildInstanceVariable = "ChildInstanceVariable";

  @Override
  public String testInstance() {

    return "-> in ChildNoInt";
  }
}

public class HibridObjectsnoInt {

  public static void main(String[] args) {

    FatherNoInt hibrid;
    FatherNoInt father = new FatherNoInt();
    ChildNoInt child1 = new ChildNoInt();
    ChildNoInt child2;
    /*╔══════════════════════════════════════════════════════════╗
      ║             Filho Recebendo DownCast do Pai              ║
      ╠══════════════════════════════════════════════════════════╣
      ║ Runtime error: Father nao tem parentesco(herda) do filho ║
      ║          Logo, nao tem como 'DownCastear' o Pai          ║
      ║                                                          ║
      ║    O Father nao possui "o DNA de Child" que possa ser    ║
      ║                      DownCasteada                        ║
      ║                                                          ║
      ║       Embora... o 'filho' tenha parentesco(herde)        ║
      ║         com o Pai, permitindo 'UpCastear' o filho        ║
      ║                                                          ║
      ║                                                          ║
      ║ >>>>>>>>>>>>>    child = (ChildNoInt) father;            ║
      ╚══════════════════════════════════════════════════════════╝*/
     //child = (ChildNoInt) father;


    /*╔══════════════════════════════════════════════════════════╗
      ║              Pai Recebendo UpCast do Filho               ║
      ╠══════════════════════════════════════════════════════════╣
      ║              O 'filho' tem parentesco(herda)             ║
      ║          do Pai, permitindo 'UpCastear' o filho          ║
      ║                                                          ║
      ║      O Child possui "o DNA do Father" que possa ser      ║
      ║                        UpCasteada                        ║
      ║                                                          ║
      ║             hibrid = (FatherNoInt) child1;               ║
      ╚══════════════════════════════════════════════════════════╝*/
    hibrid = (FatherNoInt) child1;
    System.out.println("hibrid = (FatherNoInt) child1 " + hibrid.testInstance());

    hibrid = (ChildNoInt) child1;
    System.out.println("hibrid = (ChildNoInt)  child1 " + hibrid.testInstance());

    hibrid = child1;
    System.out.println("hibrid = child1: " + hibrid.testInstance());

    hibrid = father;
    System.out.println("hibrid = father: " + hibrid.testInstance());

    child2 = child1;
    System.out.println("child2 = child1: " + child2.testInstance());

    /*╔══════════════════════════════════════════════════════════╗
      ║             Filho Recebendo DownCast do Pai              ║
      ╠══════════════════════════════════════════════════════════╣
      ║ Runtime error: Father nao tem parentesco(herda) do filho ║
      ║          Logo, nao tem como 'DownCastear' o Pai          ║
      ║                                                          ║
      ║    O Father nao possui "o DNA de Child" que possa ser    ║
      ║                  DownCasteada                            ║
      ║                                                          ║
      ║       Embora... o 'filho' tenha parentesco(herde)        ║
      ║         com o Pai, permitindo 'UpCastear' o filho        ║
      ║                                                          ║
      ║                                                          ║
      ║ >>>>>>>>>>>>>    child = (ChildNoInt) father;            ║
      ╚══════════════════════════════════════════════════════════╝*/
    //child2 = (ChildNoInt) father;
    //System.out.println("child2 = (ChildNoInt) father " + hibrid.testInstance());
  }
}