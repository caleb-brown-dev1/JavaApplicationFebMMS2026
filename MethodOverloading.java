import java.util.Scanner;

public class MethodOverloading {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=================================\n");
		System.out.println(" Calculate Perimeter Of A Shape");
		System.out.println("=================================\n")
		System.out.println("Enter 1. Circle");
		System.out.println("Enter 2. Square");
		System.out.println("Enter 3. Rectangle");
		System.out.println("Enter 0. EXit");
		System.out.println("=================================\n");
		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();
		switch(choice){
			case 1:
			        System.out.print("Enter radius");
			        double radius = scan.NextDouble();
					
					System.out.printf("The perimeter of circumference is %.2f%n", shape(radius));
			break;
			
			case 2:
			        System.out.print("Enter Length of square");
			        int length = scan.NextInt();
					
					System.out.printf("The perimeter of square is %d%n", shape(radius));
			break;
			
			case 3:
			        System.out.print("Enter Length of Rectangle");
			        int lengthOfReact = scan.NextInt();
					
					System.out.print("Enter Breath of Rectangle");
			        int breathOfReact = scan.NextInt();
					
					System.out.printf("The perimeter of square is %d%n", shape(lengthOfReact, breathOfReact));  
			break;
			
			default:
			System.out.println("Exciting program ------------- Good Bye");
		}
	}
	
	public static void double shape(double r){
		double perimeter = 2 * Math.PI * r;
		
		return perimeter;
	}
	public static void int shape(int l){
		int perimeter = 4 * l;
		
		return perimeter;
	}
	public static void int shape(int l, int b){
		int perimeter = 2*(l + b);
		
		return perimeter;
	}
}