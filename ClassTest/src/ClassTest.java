
import java.time.LocalDate;
import java.util.Date;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date birthday = new Date();
		System.out.println(birthday.toString());
		
		LocalDate newYearEve = LocalDate.of(1999, 12, 31);
		LocalDate aThousandDayLater = newYearEve.plusDays(1000);
		
		System.out.println("Date now:");
		System.out.println(newYearEve.getYear());
		System.out.println(newYearEve.getMonth());
		System.out.println(newYearEve.getDayOfMonth());
		
		System.out.println("A thousand days layter:");
		System.out.println(aThousandDayLater.getYear());
		System.out.println(aThousandDayLater.getMonth());
		System.out.println(aThousandDayLater.getDayOfMonth());
		
	}

}
