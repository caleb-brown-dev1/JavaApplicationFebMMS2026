import java.time.LocalDateTime;

public class UsingLocalDateTime{
	public static void main(String[] args){
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime todaysDate = LocalDateTime.of(2026, 10, 22, 1, 0);
		
		
		System.out.printf("Today's date and time is %s%n", currentDateTime);
		System.out.printf("The time for today is %s%n", todaysDate);
	}
}