package abstractClass_Interf_diferences;

public interface InterfaceExample {
/*

"EIX-CI" -> ESTRATEGIA DE IMPLEMENTACAO EXTERNA - PARA CONSUMO INTERNO

1.0) IMPLEMENTO/CUSTOMIZO MEU METODO EXTERNAMENTE,
1.1) USANDO ESSA IMPLEMENTACAO DENTRO DOS METODOS DA MINHA INTERFACE/ABSTRACT-CLASS

2.0) NUMA INTERFACE:

2.1) "EIX-CI" E ADMITIDO EM METODO DEFAULT, POIS:
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
  default void DefaultMethod() {

    System.out.println(
         "this is my myIntDefaultMethod using: " + myIntSignature());
  }

  static void myStaticIntMethod(){
    // signatureMethod() -- not allowed because this method is static

    System.out.println("this is my myStaticIntMethod using: ");
  }


  String myIntSignature();
}

class myClassImplementsInterface implements InterfaceExample {

  @Override
  public String myIntSignature() {

    return "myIntSignature implemented";
  }
}

class myClassImplementsInterfaceDEfaultOverride implements InterfaceExample {

  @Override
  public String myIntSignature() {

    return "myIntSignature implemented";
  }

  @Override
  public void DefaultMethod() {
    System.out.println("this is my myClassImplementsInterfaceDEfaultOverride - myIntDefaultMethod using: ");
  }

}

class myInterfaceExecutionClass {
  public static void main(String[] args) {

    var myInstanceInterface = new myClassImplementsInterface();
    myInstanceInterface.DefaultMethod();

    var myInstanceInterface2 = new myClassImplementsInterfaceDEfaultOverride();
    myInstanceInterface2.DefaultMethod();
  }

}