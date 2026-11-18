import java.time.LocalDate;
import java.util.Scanner;

public class UsingLocalDate{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		LocalDate currentDate = LocalDate.now();
		LocalDate examDate = LocalDate.of(2026,11,18);
		
		System.out.print("Enter your date of Birth (YYYY-MM-DD): ");
		String birthDate = scan.nextLine();
		
		LocalDate userBirthDate = LocalDate.parse(birthDate);
		
		if (userBirthDate.isLeapYear()) {
			System.out.printf("%s is a leap year %n", userBirthDate);
			
		}else {
			System.out.printf("%s is not leap year %n", userBirthDate);
		}
		
		if (examDate.equals(currentDate)) {
			System.out.println("Today is my exam");
		}
		
		System.out.printf("Today's Date is %s%n", currentDate);
		System.out.printf("My Java exam is on %s%n", examDate);
		System.out.printf("Your date of birth is %s%n", userBirthDate);
		System.out.printf("The year of birth is %s%n", userBirthDate.getYear());
		System.out.println(examDate.plusDays(5));
		
	}
}