package poliphormism;

interface emptyInterface {
}

class FatherClass implements emptyInterface {

  public String fatherInstanceVariable = "fatherInstanceVariable";
  public  static String fatherStaticField = "fatherStaticField";

  public String toString() {

    return "in FatherClass";
  }

  public String fatherInstanceMethod() {

    return "in fatherInstanceMethod";
  }

  public static String fatherStaticMethod() {

    return "in fatherStaticClassMethod";
  }
}

class ChildClass extends FatherClass {

  public String ChildInstanceVariable = "ChildInstanceVariable";

  public String toString() {

    return "in ChildClass";
  }

  public String childInstanceMethod() {

    return "in childInstanceMethod";
  }
}


public class TestClass {

  public static void main(String[] args) {

    ChildClass childClass = new ChildClass();
    FatherClass fatherClassHibrid = childClass;
    emptyInterface emptyInterface = fatherClassHibrid;

    System.out.println(
         """
              1.0) emptyInterface: %s
              1.1) emptyInterface: InstanceVariable

              FATHER-HIBRID-CLASS - ONLY STATE+CLASS-VARIABLES
              2.0) fatherClassHibrid Behaviour Overriding: %s
              2.1) fatherClassHibrid Behaviour exclusive do Father: %s
              2.2) fatherClassHibrid fatherInstanceVariable: %s
              2.3) fatherClassHibrid fatherStaticField: %s
              2.4) fatherClassHibrid ORIGINALLY DOES NOT ANY INSTANCE-BEHAVIOUR
              2.5) fatherClassHibrid ORIGINALLY DOES NOT HAVE ChildInstanceVariable

              FATHER-HIBRID-CLASS CASTED-WITH-CHILD - ACCESS CHILD-STATE/BEHAVIOUR
              3.0) (ChildClass) fatherClassHibrid Behaviour: %s
              3.1) (ChildClass) fatherClassHibrid.ChildInstanceVariable: %s

              4.0) childClass: %s
              4.1) childClass STATE: %s
              4.2) childClass FATHER-INSTANCE-VARIABLE INHERITED: %s
              """
              .formatted(
                   emptyInterface,
                   fatherClassHibrid,
                   fatherClassHibrid.fatherInstanceMethod(),
                   fatherClassHibrid.fatherInstanceVariable,
                   FatherClass.fatherStaticField,
                   ((ChildClass) fatherClassHibrid),
                   ((ChildClass) fatherClassHibrid).ChildInstanceVariable,
                   childClass,
                   childClass.ChildInstanceVariable,
                   childClass.fatherInstanceVariable
              ));
  }
}