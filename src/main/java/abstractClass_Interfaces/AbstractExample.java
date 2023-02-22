package abstractClass_Interfaces;

/*

ESTRATEGIA DE IMPLEMENTACAO EXTERNA - PARA CONSUMO DE METODO INTERNO

1.0) IMPLEMENTO MEU METODO EXTERNAMENTE
1.1) USANDO ESSA IMPLEMENTACAO EXTERNA
DENTRO DOS METODOS DA MINHA INTERFACE/ABSTRACT-CLASS - COMPLETANDO-OS

1.2) ESSES METODOS DA MINHA INTERFACE/ABSTRACT-CLASS SAO METODOS COMUNS/BASE,
PARA CLASSES-CLIENTES QUE USAM ESSA INTERFACE/ABSTRACT-CLASS

2.0) NUMA CLASSE ABSTRACT:
2.1) ISSO E ADMITIDO, TANTO EM INSTANCE-METHODS, COMO EM FINAL METHODS
- POIS ABSTRACT-CLASSES POSSUEM INSTANCE-METHODS E FINAL-METHODS

2.2) NUM INSTANCE-METHOD:
- ESSE METHOD PODERA SER EXPANDIDO/OVERRIDED, SE ASSIM FOR DESEJADO

2.3) NUM FINAL-METHOD:
- ESSE METODO PODERA SER "TRAVADO", IMPEDINDO OVERRIDING, SE ASSIM FOR DESEJADO

3.0) NUMA INTERFACE:
3.1) ISSO SO E ADMITIDO EM METODO DEFAULT, POIS:

3.2) METODO PRIVATE E STATIC-PRIVATE, NAO PODERA SER CONSUMIDO EXTERNAMENTE

3.3) METHOD STATIC E STATIC-PRIVATE, NAO ADMITIRAO ESSA IMPLEMENTACAO EXTERNA
POIS SAO ESTATICOS(PORTANTO, IMPLICITAMENTE 'FINAL', E FINAL-METHODS NAO ADMITEM
IMPLEMENTACAO-CONCRETA-EXTERNA POR NAO PODE SER 'HERDADOS'),

3.4) ESSA IMPLEMENTACAO OCORRE A PARTIR DE UM INSTANCE-METHOD/SIGNATURE
E TODA SIGNATURE E, EXPLICITA OU IMPLICITAMENTE ABSTRACT, PORTANTO NAO PODENDO
SER STATIC(QUE E IMPLICTAMENTE FINAL) OU EXPLICITAMENTE FINAL

3.2) NUM METHOD-DEFAULT, ESSE METODO PODERA SER "EXPANDIDO" EXTERNAMENTE
- TODAVIA, NAO CONSIGO TRAVAR ESSE METODO SE ASSIM DESEJASSE,
- POIS NAO POSSUO METODOS FINAL[TRAVA DE OVERRIDING] EM UMA INTERFACE

 */
public abstract class AbstractExample {

  public final void FinalBaseMethod() {

    System.out.println("this is my myAbstractFinalMethod using: " + signatureMethod());
  }

  public void InstanceBaseMethod() {

    System.out.println("this is my myAbstractCommonMethod using: " + signatureMethod());
  }

  public static void StaticBaseMethod() {
    // signatureMethod() -- not allowed because this method is static

    System.out.println("this is my StaticBaseMethod using: ");
  }


  abstract String signatureMethod();
}

class myClassImplemSimple extends AbstractExample {
  @Override
  String signatureMethod() {

    return "signature implemented in myClassImplemSimple";
  }

  @Override
  public void InstanceBaseMethod() {

    super.InstanceBaseMethod();
    System.out.println("My InstanceBaseMethod Overrided");
  }
}

class myExecutionClass {
  public static void main(String[] args) {

    var myInstance = new myClassImplemSimple();
    myInstance.FinalBaseMethod();
    myInstance.InstanceBaseMethod();

    myClassImplemSimple.StaticBaseMethod();
  }
}