
public class NumberUtilityClassapp {

	public static void main(String[] args) {
		
		double myTestNumber = 199.867;
		int myNum[]= {7,5,8,9,0,3,1,4,6,2};
		
		//NumberUtility myTestUtility = new NumberUtility();
		String result = NumberUtility.currencyFormat(myTestNumber);
		print(result);
		String result2 = NumberUtility.decimalFormat(myTestNumber,2);
		print(result2);
		String result3 = NumberUtility.percentFormats(myTestNumber,2);
		print(result3);
		String result4 = NumberUtility.randomNumber();
		print(result4);
		//String result5 = NumberUtility.maxNumber(int[] myNum);
		//print(result5);
		
	}
	
	private static void print(String s){
		System.out.println(s);
	}
}
