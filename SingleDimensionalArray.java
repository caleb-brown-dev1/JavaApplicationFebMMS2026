import java.util.Scanner;

public class SingleDimensionalArray {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[20];
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Enter any number: ");
			numbers[i] = scan.nextInt();
			
		}
		if (numbers[0] >= numbers [15]) {
			System.out.println("Preye you must understand this oh!");
			
		} else {
			System.out.println("You must receive an extra assignment");
		}
	}
}