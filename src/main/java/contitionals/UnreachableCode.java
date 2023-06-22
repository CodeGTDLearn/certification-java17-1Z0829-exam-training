package contitionals;

import static java.lang.System.out;

public class UnreachableCode {

  public static void main(String[] args) {

    /*╔═══════════════════════════════════════════════╗
      ║ UNREACHABLE CODE inside loops - COMPILE ERROR ║
      ╚═══════════════════════════════════════════════╝*/
    var x = 0;
    //for (int i = 0; false; i++) x = 3;
    //for (int i = 0; 10 < 0; i++) x = 3;
    //for (int i = 0; 0 > 20; i++) x = 3;
    //while (false) x = 3;


    /*╔═══════════════════════════════════════════════╗
      ║ UNREACHABLE CODE inside loops - COMPILE OK    ║
      ╚═══════════════════════════════════════════════╝*/
    var sum = 0;
    for (int i = 0; sum > 20; i++) {
      out.println("test looping");
      out.println(x = 3);
    }

    boolean bVar = false;
    for (int i = 0; bVar; i++) {
      bVar = true;
      out.println("loooping" + bVar);
    }

    if (false) {
      out.println("test if");
    }

    /*╔════════════════════════════╗
      ║ LOOP 'INFINITO' DE 1 CICLO ║
      ╚════════════════════════════╝*/
    var i = 0;
    for (i = 0; ; i++) break;

    /*╔════════════════════════════╗
      ║ LOOP INFINITO, MAS COMPILA ║
      ╚════════════════════════════╝*/
    //    var ff = 0;
    //    for (ff = 0; ; ff++) ;

  }
}