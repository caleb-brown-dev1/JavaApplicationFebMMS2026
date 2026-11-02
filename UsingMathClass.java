public class UsingMathClass{
	
	public static void main(String[] args){
		int absoulteNumber = Math.abs(-200);
		double maximumNumber = Math.max(12,3);
		double minimumNumber = Math.min(12,3);
		double squareRoot = Math.sqrt(64);
		double power = Math.pow(64,2);
		double randomNumber = Math.random();
		
		System.out.println("The value is " + absoulteNumber);
		System.out.println("The value is " + maximumNumber);
		System.out.println("The value is " + minimumNumber);
		System.out.println("The value is " + squareRoot);
		System.out.println("The value is " + power);
		System.out.printf("The value is %.2f%n",randomNumber);
	}
}