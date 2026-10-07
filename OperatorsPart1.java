
public class OperatorsPart1{
	
	public static void main(String[] args){
		// Assignment Operator 
		int num = 100;
		System.out.println("Number is " + num);
		
		// Arithmetic operator(+, -, *, /, %)
		int num1 = 520;
		int num2 = 200;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		double division = (double) num1 / num2;
		int remainder = num1 % num2;
		
		//Compound assignment Operator(+=, -=, *=, /=, %=)
		int number1 = 20;
		int number2 = 2;
	    
		System.out.println("----------------Arithmetic output-----------------");
		
		System.out.printf("%d + %d = %d%n",num1,num2,addition);
		System.out.printf("%d - %d = %d%n",num1,num2,subtraction);
		System.out.printf("%d * %d = %d%n",num1,num2,multiplication);
		System.out.printf("%d / %d = %.2f%n",num1,num2,division);
		System.out.printf("%d %% %d = %d%n",num1,num2,remainder);
		System.out.println("---------------------------------------------------");
		
		System.out.println("----------------Arithmetic output-------------------");
		
		number1 += number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 -= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 *= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 /= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 %= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		System.out.println("-----------------------------------------------------");
		
		// Relational Operator(>, <, ==, >=, <=, !=)
		int X = 90;
		int Y = 51;
		
		boolean isGreaterThan = X > Y;
		boolean isLessThan = X < Y;
		boolean isGreaterOrEqualTo = X >= Y;
		boolean isLessOrEqualTo = X <= Y;
		boolean isEqualTo = X == Y;
		boolean notEqualTo = X != Y;
		
		System.out.printf("Is %d > %d = %b%n",X,Y,isGreaterThan);
		System.out.printf("Is %d < %d = %b%n",X,Y,isLessThan);
		System.out.printf("Is %d >= %d = %b%n",X,Y,isGreaterOrEqualTo);
		System.out.printf("Is %d <= %d = %b%n",X,Y,isLessOrEqualTo);
		System.out.printf("Is %d == %d = %b%n",X,Y,isEqualTo);
		System.out.printf("Is %d != %d = %b%n",X,Y,notEqualTo);
		
	}
}

