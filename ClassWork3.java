public class ClassWork3{
	public static void main(String[] args){
		int[] num = {8,2,5,12,6,7,11,13,4};
		int countOfEven = 0;
		int countOfOdd = 0;
		int sumOfOdd = 0;
		int sumOf2_6 = 0;
		int sumOf3_10 = 0;
		
		for (int j = 0; j < 10; j++) {
			
			if(num[j] % 2 == 0){
				countOfEven++;
			} else {
				countOfOdd++;
				sumOfOdd += num[j];
			}
			
			if(j >= 1 && j <= 4){
				sumOf2_6 += num[j];
		    }
			
			if (j > 2 && j <= 10){
				sumOf3_10 += num[j];
			}
		} 
		System.out.println("Find the count of even and odd numbers");
		System.out.println("=======================================\n");
		System.out.println("The count of even is", countOfEven);
		System.out.println("The count of odd is", countOfOdd);
		System.out.println("=======================================\n");
		
		
		
	}
}