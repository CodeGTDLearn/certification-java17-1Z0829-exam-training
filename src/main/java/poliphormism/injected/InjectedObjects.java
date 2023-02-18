package poliphormism.injected;

interface emptyInterface {
}

class Father implements emptyInterface {

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

  public String overridingCommonMethod() {

    return "in fatherInstanceMethod";
  }
}

class Child extends Father {

  public String ChildInstanceVariable = "ChildInstanceVariable";

  public String toString() {

    return "in ChildClass";
  }

  public String childInstanceMethod() {

    return "in childInstanceMethod";
  }

  public String overridingCommonMethod() {

    return "in childInstanceMethod";
  }
}


public class InjectedObjects {

  public static void main(String[] args) {

    Child child = new Child();
    Father injected = child;
    emptyInterface emptyInterface = injected;

    System.out.println(
         """
              1.0) emptyInterface: %s
              1.1) emptyInterface: InstanceVariable

              FATHER-HIBRID-CLASS - ONLY STATE+CLASS-VARIABLES
              2.0) injected Behaviour Overriding: %s
              2.1) injected Behaviour exclusive do Father: %s
              2.2) injected fatherInstanceVariable: %s
              2.3) injected fatherStaticField: %s
              2.4) injected ORIGINALLY DOES NOT ANY INSTANCE-BEHAVIOUR
              2.5) injected ORIGINALLY DOES NOT HAVE ChildInstanceVariable
              2.6) injected overridingCommonMethod: %s

              FATHER-HIBRID-CLASS CASTED-WITH-CHILD - ACCESS CHILD-STATE/BEHAVIOUR
              3.0) (ChildClass) injected Behaviour: %s
              3.1) (ChildClass) injected.ChildInstanceVariable: %s
              3.1) (ChildClass) injected.overridingCommonMethod: %s

              4.0) child: %s
              4.1) child INSTANCE-VARIABLE-STATE: %s
              4.2) child INSTANCE-VARIABLE-METHOD: %s
              4.2) child overridingCommonMethod: %s
              4.3) child FATHER-INSTANCE-METHOD INHERITED: %s
              4.4) child FATHER-INSTANCE-VARIABLE INHERITED: %s
              """
              .formatted(
                   emptyInterface,
                   injected,
                   injected.fatherInstanceMethod(),
                   injected.fatherInstanceVariable,
                   Father.fatherStaticField,
                   injected.overridingCommonMethod(),
                   ((Child) injected),
                   ((Child) injected).ChildInstanceVariable,
                   ((Child) injected).overridingCommonMethod(),
                   child,
                   child.ChildInstanceVariable,
                   child.childInstanceMethod(),
                   child.overridingCommonMethod(),
                   child.fatherInstanceVariable,
                   child.fatherInstanceMethod()
              ));


  }
}