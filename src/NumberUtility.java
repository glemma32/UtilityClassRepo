import java.text.NumberFormat;
import java.util.Random;

public class NumberUtility {
	double testNumber; 
	
	public static String currencyFormat(double testNumber){
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	String priceString = currency.format(testNumber);
	return priceString;
	}
	public static String decimalFormat(double testNumber, int places){
		NumberFormat decimalPlace = NumberFormat.getNumberInstance();
		decimalPlace.setMaximumFractionDigits(places);
		String milesString = decimalPlace.format(testNumber);
		return milesString;
	}
	public static String percentFormats(double testNumber, int places){
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(places);
		String majorityString = percent.format(testNumber);
		return majorityString;
			}
	public static String randomInteger(){
		Random r = new Random();
		int x = r.nextInt();
		int y = r.nextInt();
		int z = (x + y)/2;
		String result = Integer.toString(z);
		return result;
		}
	public static String randomDouble(){
		Random r = new Random();
		double x = 1+r.nextInt(10);
		double y =1+ r.nextInt(10);
		double z = (x + y)/2;
		String result = Double.toString(z);
		return result;
		}
	public static String maxNumber(int num[]){
		int max=num[0];
		String result;
		
		for(int i=0;i<10;i++){
			if(num[i]>max)
				max=num[i];
					}
		 result= Integer.toString(max);
		 return result;
	}
	public static String minNumber(int num[]){
		int min=num[0];
		String result;
		
		for(int i=0;i<10;i++){
			if(num[i]<min)
				min=num[i];
					}
		 result= Integer.toString(min);
		 return result;
	}

}
