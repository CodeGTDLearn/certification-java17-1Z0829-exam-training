package poliphorm_hibrids.hibrid;

interface emptyInterface {
}

class Father implements emptyInterface {

  public String fatherInstanceVariable = "fatherInstanceVariable";
  public static String fatherStaticField = "fatherStaticField";

  public String toString() {

    return "toString -> in FatherClass";
  }

  public String fatherInstanceMethod() {

    return "in fatherInstanceMethod";
  }

  public String overridingCommonMethod() {

    return "Father overridingCommonMethod";
  }

  public static String fatherStaticMethod() {

    return "in fatherStaticClassMethod";
  }
}

class Child extends Father {

  public String ChildInstanceVariable = "ChildInstanceVariable";

  public String toString() {

    return "toString -> in ChildClass";
  }

  public String childInstanceMethod() {

    return "in childInstanceMethod";
  }

  @Override
  public String overridingCommonMethod() {

    return "Child overridingCommonMethod";
  }
}



public class HibridObjects {

  public static void main(String[] args) {

    // 1) Empty-Interface NO access to nothing
    emptyInterface emptyInt = new Child();


    // 2) Casting to FatherClass - access to father Elements
    final String var1 = ((Father) emptyInt).fatherInstanceVariable;
    final String var2 = ((Father) emptyInt).fatherInstanceMethod();
    final String var3 = ((Father) emptyInt).toString();


    // 3) Casting to ChildClass - access to Child Elements
    final String var4 = ((Child) emptyInt).fatherInstanceMethod();
    final String var5 = ((Child) emptyInt).childInstanceMethod();
    final String var6 = ((Child) emptyInt).fatherInstanceVariable;
    final String var7 = ((Child) emptyInt).ChildInstanceVariable;
    final String var8 = ((Child) emptyInt).toString();


    // 4) Hibrid Object
    Father hibrid = new Child();
    Object hibridObject = new Child();


    final String myPanel = """
         1) Hibrid: %s
         2) Hibrid toString: %s
         3) Hibrid InstanceVariable: %s
         4) Hibrid InstanceMethod: %s
         5) Hibrid overridingCommonMethod: %s
         6) Hibrid Cast(Child) overridingCommonMethod: %s
         7) Hibrid Object overridingCommonMethod: %s
         """.formatted(hibrid,
                       hibrid.toString(),
                       hibrid.fatherInstanceVariable,
                       hibrid.fatherInstanceMethod(),
                       hibrid.overridingCommonMethod(),
                       ((Child) hibrid).overridingCommonMethod(),
                       hibridObject.toString()
    );
    System.out.println(myPanel);
  }
}