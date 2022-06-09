package milliwatt.phuc.ungdungdahinh;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangTienTe {

	public static void main(String[] args) {
		double l = 123456789.67;
		
		Locale locale = new Locale("vi","VN");
		
		NumberFormat format = NumberFormat.getCurrencyInstance(locale);
		
		format.setRoundingMode(RoundingMode.HALF_UP);
		
		System.out.println(format.format(l));
		
		DecimalFormat format2 = (DecimalFormat)DecimalFormat.getCurrencyInstance(locale);
		
		DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols();
		formatSymbols.setGroupingSeparator('-');
		formatSymbols.setCurrencySymbol("vnd");
		
		format2.setDecimalFormatSymbols(formatSymbols);
		
		System.out.println(format2.format(l));
		
		//Format %
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		System.out.println(percentFormat.format(0.1));
		
		
	}
	
}
