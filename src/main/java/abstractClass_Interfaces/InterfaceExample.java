package abstractClass_Interfaces;

public interface InterfaceExample {
/*

ESTRATEGIA DE IMPLEMENTACAO EXTERNA - PARA CONSUMO DE METODO INTERNO
1.0) IMPLEMENTO MEU  METODO EXTERNAMENTE,
1.1) USANDO ESSA IMPLEMENTACAO DADA EXTERNAMENTE,
DENTRO DOS METODOS DA MINHA INTERFACE/ABSTRACT-CLASS

2.0) NUMA INTERFACE:
2.1) ISSO SO E ADMITIDO EM METODO DEFAULT, POIS:
METODO PRIVATE, NAO PODERA SER CONSUMIDO EXTERNAMENTE
METHOD STATIC, STATIC-PRIVATE, NAO ADMITIRAO ESSA IMPLEMENTACAO EXTERNA,
POIS SAO ESTATICOS, E A IMPLEMENTACAO E DE INSTANCE-METHOD

2.2) NUM METHOD-DEFAULT, ESSE METODO PODERA SER "EXPANDIDO" EXTERNAMENTE
- TODAVIA, NAO CONSIGO TRAVAR ESSE METODO SE ASSIM DESEJASSE,
- POIS NAO POSSUO METODOS FINAL[TRAVA OVERRIDING] EM UMA INTERFACE

3.0) NUMA CLASSE ABSTRACT:
3.1) ISSO E ADMITIDO, TANTO EM INSTANCE-METHODS, COMO EM FINAL METHODS
- POIS ABSTRACT-CLASSES POSSUEM INSTANCE-METHODS E FINAL-METHODS

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