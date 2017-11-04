package JavaExercises;

public class Loops {

	public static void main(String[] args) {
		consolePrint();

	}
	public static void consolePrint() {
		for (int i = 0; i < 8 ; i++) {
			System.out.println(printHash(i));
		}
	}
	
		//System.out.println(printHash(1));
		//System.out.println(printHash(2));
		//System.out.println(printHash(3));
		//System.out.println(printHash(4));
		//System.out.println(printHash(5));
		//System.out.println(printHash(6));
		//System.out.println(printHash(7));
		//System.out.println(printHash(8));
	
	public static String makeShapeA() {
	String result = "";
		for (int i = 0; i < 8 ; i++) {
			result+=printHash(i);
			
		}return result;
			//System.out.println(printHash(i));
		}
	
	

	public static String printHash(final int count) {
		// final is used because it's not going to change and it's makes it
		// identifiable
		String hashResult = "";
		for (int i = 0; i < count; i++) {
			hashResult += "#";
		}
		return hashResult;
		
		
		/*
		 if(i==1){
		 return "#";
		 } else if (i==2){
		 return"##";
		 }
		 */
		

	}

}
