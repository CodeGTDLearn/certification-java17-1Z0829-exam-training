package poliphormism;

public class Child extends Father {
  public String shadowInstanceVar = "Shadow Child InstanceVar";

  public void overridedInstanceMethod() {
    System.out.println("overridedInstanceMethod - Child");
  }


  public static void main(String[] args) throws Exception {

    System.out.println(
         """
              STATIC FATHER ELEMENTS
              * No Instance Declaration
              * No Object Creation""");
    System.out.println(Father.fatherStaticVar);
    Father.fatherStaticMethod();
    System.out.println();


    System.out.println(
         """
              INSTANCE FATHER ELEMENTS
              * Instance Father Declaration
              * Object Father Creation""");
    Father g1 = new Father();
    System.out.println(g1.fatherInstanceVar);
    g1.fatherInstanceMethod();
    g1.overridedInstanceMethod();
    System.out.println();

    System.out.println(
         """
              INSTANCE CHILD ELEMENTS
              * Instance Child Declaration
              * Object Child Creation""");
    Child c1 = new Child();
    System.out.println("->FATHER - INHERITATED - NOT COMMON ELEMENTS");
    System.out.println(c1.fatherInstanceVar);
    c1.fatherInstanceMethod();

    System.out.println("->OVERRIDES");
    c1.overridedInstanceMethod();
    System.out.println(c1.shadowInstanceVar);
    System.out.println();


    System.out.println(
         """
              INSTANCE HIBRID ELEMENTS
              * Instance Father Declaration
              * Object Child Creation""");
    Father hibrid = new Child();
    System.out.println("->FATHER - INHERITATED - NOT COMMON ELEMENTS");
    System.out.println(hibrid.fatherInstanceVar);
    hibrid.fatherInstanceMethod();

    System.out.println("->OVERRIDES - COMMON ELEMENTS FATHER/CHILD");
    System.out.println("* STATE: " + hibrid.shadowInstanceVar);
    System.out.print("* BEHAVIOUR: ");
    hibrid.overridedInstanceMethod();
    System.out.println();

    System.out.println(
         """
              CASTING - INSTANCE HIBRID ELEMENTS
              * Instance Father Declaration
              * Object Child Creation""");
    System.out.println("OVERRIDES - COMMON ELEMENTS FATHER/CHILD");
    System.out.println("* STATE - NO CAST: " + hibrid.shadowInstanceVar);
    System.out.println("* STATE - CAST-TO-CHILD: " + ((Child) hibrid).shadowInstanceVar);
    System.out.print("* BEHAVIOUR: ");
    hibrid.overridedInstanceMethod();
    ((Child) hibrid).overridedInstanceMethod();
    System.out.println();

  }
}

class Father {

  public static final String fatherStaticVar = "fatherStaticVar";
  public String fatherInstanceVar = "Father InstanceVar";
  public String shadowInstanceVar = "Shadow Father InstanceVar";

  public void fatherInstanceMethod() throws Exception {

    System.out.println("Father NO_OverridedInstanceMethod");
  }

  public void overridedInstanceMethod() throws Exception {

    System.out.println("Father overridedInstanceMethod");
  }

  static public void fatherStaticMethod() {

    System.out.println("Father StaticMethod");
  }
}