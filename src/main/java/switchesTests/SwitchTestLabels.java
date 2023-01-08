package switchesTests;

import java.time.LocalDate;

import static java.time.DayOfWeek.*;

public class SwitchTestLabels {
  public static void main(String[] args) {

    var day = LocalDate.now()
                       .with(SUNDAY)
//                       .with(FRIDAY)
//                       .with(MONDAY)
//                       .with(SATURDAY)
                       .getDayOfWeek();

    System.out.println(day);

    switch (day) {
      case MONDAY:
        TUESDAY:
        WEDNESDAY:
        THURSDAY:
        FRIDAY: System.out.println("working");
      case SATURDAY:
        SUNDAY:
        System.out.println("off");
    }

//    switch (day) {
//      case MONDAY:
//        TUESDAY:
//        WEDNESDAY:
//        THURSDAY: System.out.println("working");
//      case FRIDAY: System.out.println("friday");
//      case SATURDAY:
//        SUNDAY: System.out.println("off");
//    }
  }
}