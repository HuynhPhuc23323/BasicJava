package milliwatt.phuc.ungdungdahinh;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long l = 123456789L;
		double k = 1234567.890123;
		
		Locale locale = new Locale("vi", "VN");
		NumberFormat format = NumberFormat.getInstance(locale);
		format.setMaximumFractionDigits(4); // toi da bao nhieu so sau dau phay
		format.setMinimumFractionDigits(0);
		
		//format.setMaximumIntegerDigits(2);
		format.setRoundingMode(RoundingMode.HALF_UP);// lam tron len
		
		
		System.out.println(format.format(l));
		System.out.println(format.format(k));
		
		//Ngoai ra co the dung thu vien khac 
		
		//String pattern = "###,###.##";//999,999.99
		//DecimalFormat decimalFormat = new DecimalFormat(pattern);
		DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(locale);
		//decimalFormat.setMaximumFractionDigits(4);
		
		//dung gach - de tach phan ngan
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
		decimalFormatSymbols.setGroupingSeparator('-');//phan tach phan ngan
		decimalFormatSymbols.setDecimalSeparator(',');// phan tach phan thap phan
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		
		System.out.println(decimalFormat.format(l));
		System.out.println(decimalFormat.format(k));
		
	}

}
