package switchesTests;

import java.time.LocalDate;

import static java.time.DayOfWeek.SUNDAY;

public class SwitchTestsBraches {
  public static void main(String[] args) {

    var day = LocalDate.now()
                       .with(SUNDAY)
                       //                       .with(FRIDAY)
                       //                       .with(MONDAY)
                       //                       .with(SATURDAY)
                       .getDayOfWeek();

    System.out.println(
         switch (day) {
           case MONDAY, FRIDAY, SUNDAY -> 6;
           case TUESDAY -> 7;
           case THURSDAY, SATURDAY -> 8;
           case WEDNESDAY -> 9;
           default -> throw new IllegalStateException("Invalid day: " + day);
         }
    );


    switch (day) {
      case FRIDAY, SUNDAY -> {
        System.out.println("mult-stat 1");
        System.out.println("mult-stat 2");
      }
      default -> throw new
        IllegalStateException("Invalid" + day);
    }


  }
}