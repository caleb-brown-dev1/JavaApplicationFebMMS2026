public class TypeCasting {//class has been created
	public static void main(String[] args){// main method
		//Variable created
		double price = 765;
		
		System.out.println("The price of fuel is " + price);
		//Variable created 
		double quantity = 632.50;
		int convertedQuantity = (int)quantity;
		
		System.out.printf("Ordered %d loaves of bread yesterday%n",convertedQuantity);
	}
}