import java.text.*;
import java.util.*;

public class DateDemo {
  public static void main(String[] args){
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String input = args.length == 0? "2023-12-12": args[0];

    System.out.println(input + "Parses as");

    Date t;

    try{
      t = format.parse(input);
      System.out.println(t);
    }catch (ParseException e){
      System.out.println("Unparsable using" + format);
    }

    Calendar calendar = Calendar.getInstance();
    calendar.set(2023, 11, 12);
    System.out.println("Setting the calendar to " + calendar.getTime());

    calendar.add(Calendar.DATE, 7); // 七天后
    System.out.println("year" + calendar.get(Calendar.YEAR));
    System.out.println("month" + calendar.get(Calendar.MONTH));
    System.out.println("day" + calendar.get(Calendar.DATE));
    System.out.println("hour" + calendar.get(Calendar.HOUR));
    System.out.println("minute" + calendar.get(Calendar.MINUTE));
    System.out.println("second" + calendar.get(Calendar.SECOND));
    
  }
}
