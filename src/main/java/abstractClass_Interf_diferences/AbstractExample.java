package abstractClass_Interf_diferences;

/*

"EIX-CI" -> ESTRATEGIA DE IMPLEMENTACAO EXTERNA - PARA CONSUMO INTERNO

1.0) IMPLEMENTO/CUSTOMIZO MEU METODO EXTERNAMENTE,
1.1) USANDO ESSA IMPLEMENTACAO DENTRO DOS METODOS DA MINHA INTERFACE/ABSTRACT-CLASS

2.0) NUMA INTERFACE:

2.1) "EIX-CI" E ADMITIDO SOMENTE EM METODO DEFAULT, POIS:
* METODO PRIVATE, NAO PODERA SER CONSUMIDO EXTERNAMENTE
* METHOD STATIC, STATIC-PRIVATE, NAO ADMITEM ESSA IMPLEMENTACAO EXTERNA,
POIS SAO ESTATICOS, E A IMPLEMENTACAO E DE INSTANCE-METHOD

2.2) NUM METHOD-DEFAULT, ESSE METODO PODERA SER "EXPANDIDO" EXTERNAMENTE
* TODAVIA, NAO CONSIGO TRAVAR-EXPANSAO CASO DESEJASSE,
* POIS INTERFACE NAO POSSUE MODIFIER/METODOS FINAL[TRAVA OVERRIDING]

3.0) NUMA CLASSE ABSTRACT:

3.1) "EIX-CI" E ADMITIDO, EM INSTANCE-METHODS + FINAL-METHODS (EXISTENTES EM ABSTRACT-CLASSES)

3.2) NUM INSTANCE-METHOD:
- ESSE METHOD PODERA SER EXPANDIDO/OVERRIDED, SE ASSIM FOR DESEJADO

3.3) NUM FINAL-METHOD:
- ESSE METODO PODERA SER "TRAVADO", IMPEDINDO OVERRIDING, SE ASSIM FOR DESEJADO
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