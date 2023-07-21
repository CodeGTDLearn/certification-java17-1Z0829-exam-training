package interfaces;

interface MyInterface {
  void meuIntMetodo();


  default void myInstanceMetodo() {

    System.out.println("Meu metodo meuIntMetodo2");
  }


  static void meuStaticMetodo() {

    System.out.println("Meu metodo meuIntMetodo2");
  }
}

class MethodAddressStaticInstance implements MyInterface {
  @Override
  public void meuIntMetodo() {

    System.out.println("Chamando o método da interface");
  }

  @Override
  public void myInstanceMetodo() {

    System.out.println("ChamandomyInstanceMetodo da interface");
  }

  public void chamarMetodoDaInterface() {

    MyInterface.super.myInstanceMetodo();
    MyInterface.meuStaticMetodo();
    meuIntMetodo();
    myInstanceMetodo();


  }

  public static void main(String[] args) {

    MethodAddressStaticInstance methodAddressStaticInstance = new MethodAddressStaticInstance();
    methodAddressStaticInstance.chamarMetodoDaInterface();
  }
}