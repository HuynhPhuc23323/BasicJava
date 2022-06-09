package milliwatt.phuc.ungdungdahinh;

import java.util.Calendar;
import java.util.Date;

public class CachDungNgayVaGio {

	public static void main(String[] args) {

		Date now = new Date();

		System.out.println(now);

		Date now2 = new Date();

		if (now.equals(now2)) {
			System.out.println("bang nhau");
		}
		if (now.before(now2)) {

		}

		if (now.after(now2)) {

		}

		// now.getTime(); // mili giay
		// now.setTime(181818181818L);

		// Dung calendar de cong tru ngay gio de hon Date
		Calendar cal = Calendar.getInstance();

		System.out.println(cal.getTime());

		cal.add(cal.HOUR, -1);
		cal.add(cal.DATE, -1);
		System.out.println(cal.getTime());

	}

}
