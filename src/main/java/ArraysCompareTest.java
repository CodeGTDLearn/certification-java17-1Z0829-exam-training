import java.util.Arrays;

public class ArraysCompareTest {

  public static void main(String[] args) {
/*
    2) ARRAYS COM MESMO LENGHT()
    2.1) FIND O "MISMATCH" (PRIMEIRO DIVERGENTE)
    2.2) NO INDEX 'MISMATCH':
    * NO "ia1"         MISMATCH MAIOR    = +1
    * "ia1"  /  "ia2"  IGUAIS            = 0
    * NO "ia2"         MISMATCH MAIOR    = -1*/
    int[] ia1 = {0, 2, 3};
    int[] ia2 = {0, 2, 1};
    System.out.println("MESMO LENGHT(): " + Arrays.compare(ia1, ia2));


/*
     3) UM ARRAY E' "TOTALMENTE IDENTICO" AO "RADICAL DOUTRO" + LENGHT DIFERENTE
     3.1) SUBTRAIR OS ARRAYS-LENGHT's*/
    int[] ia11 = {0, 2, 1, 15, 28, 101};  // RADICAL NESSE CASO: 0, 2, 1,
    int[] ia22 = {0, 2, 1};
    System.out.println("RADICAL IDENTICO + LENGHT DIFERENTE: " + Arrays.compare(ia11, ia22));


/*
    4) UM ARRAY E' "DIFERENTE" DO "RADICAL DOUTRO" + LENGHT DIFERENTE
    4.1) FIND O "MISMATCH" (PRIMEIRO DIVERGENTE)
    4.2) NO INDEX 'MISMATCH':
    * NO "ia1"         MISMATCH MAIOR    = +1
    * "ia1"  /  "ia2"           IGUAIS   = CAIRA NA SITUACAO ACIMA
    * NO "ia2"         MISMATCH MAIOR    = -1*/
    int[] ia111 = {0, 22,  1, 15, 28};
    int[] ia222 = {0, 2 , 1};
    System.out.println(
         "UM ARRAY E' \"DIFERENTE\" DO \"RADICAL DOUTRO\" + LENGHT DIFERENTE: " +
         Arrays.compare(ia111, ia222));


/*
    4) ARRAYS DE STRING / CHAR
    4.1) FIND O 'MISMATCH'
    4.2) LEXICOGRAFIA
    * 1° letra 'DIFERENTE' DO 'MISMATCH', no "s1",  for MAIOR:
      *  subtracao entre as letras, usando incl+excl - ADICIONA SINAL POSITIVO
    * 1° letra 'DIFERENTE' DO 'MISMATCH', no "s2",  for MAIOR:
      *  subtracao entre as letras, usando incl+excl - ADICIONA SINAL NEGATIVO*/
    String[] s1 = new String[]{"a", "aac", "cc", "XX", "e"};
    String[] s2 = new String[]{"a", "aed", "cc", "DD", "e", "f"};
    System.out.println("1) ARRAYS DE STRING: " + Arrays.compare(s1, s2));

    String[] s11 = new String[]{"a", "b",  "acc", "cc"};
    String[] s22 = new String[]{"a", "b",  "aed", "cc", "DD"};
    System.out.println("2) ARRAYS DE STRING: " + Arrays.compare(s11, s22));

    Character[] c1 = new Character[]{'a', 'a', 'c', 'X', 'e'};
    Character[] c2 = new Character[]{'a', 'b', 'c', 'D', 'e', 'f'};
    System.out.println("1) ARRAYS DE CHAR: " + Arrays.compare(c1, c2));

    Character[] c11 = new Character[]{'a', 'b',  'a', 'c'};
    Character[] c22 = new Character[]{'a', 'b',  'a', 'c', 'D'};
    System.out.println("2) ARRAYS DE CHAR: " + Arrays.compare(c11, c22));

    Character[] c122 = new Character[]{};
    Character[] c222 = new Character[]{'a', 'b',  'a', 'c', 'D'};
    System.out.println("3) ARRAYS DE CHAR: " + Arrays.compare(c122, c222));

    Character[] c1222 = new Character[]{'a', 'b',  'a', 'c', 'D'};
    Character[] c2222 = new Character[]{};
    System.out.println("4) ARRAYS DE CHAR: " + Arrays.compare(c1222, c2222));

  }
}