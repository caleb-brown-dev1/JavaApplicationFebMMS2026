import java.util.Scanner;

public class DoubleSelection{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Fullname: ");
		String fullName= scan.nextLine();
		
		System.out.print("Enter Username: ");
		String userName = scan.nextLine();
		
		System.out.print("Enter Password: ");
		String passWord = scan.nextLine();
		
		String username = "johnnydeep";
		String password = "12345";
		
		if(username.equals("johnnydeep") && password.equals("12345")){
			System.out.printf("Access Granted.%n");
			System.out.printf("%s, you are welcome.%n",username,password);
			
		}
		else{
			System.out.printf("Access Denied.%n",username,password);
		}
	}
}