package dateTime;
//import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class LocalDateTime{
public static void main(String[] args) {
	Localdate l=new Localdate();
	Localtime lt=new Localtime();
}}


class Localdate{
	public Localdate(){
		LocalDate date = LocalDate.now();
		System.out.println("Current Time is " + date);
		Month month = date.getMonth();
		System.out.println("Current month is " + month);
		int d = (int) date.getDayOfMonth();
		System.out.println("Day of the Month is "+d);
		DayOfWeek dow = date.getDayOfWeek();
		System.out.println("Day of week is " +dow);
		
}
}

class Localtime{
	public Localtime() {
		LocalTime time = LocalTime.now();
		System.out.println("Current time is " + time);
	}		

}