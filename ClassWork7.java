public class ClassWork7{
	public static void main(String[] args){
		
		EvenCountOddSum(2,11,13,8,6,4,9,17,3,10);
		EvenCountOddSum(3,16,9,5,8);
	
	}
	public static void EvenCountOddSum(int...numbers){
		int EvenCount = 0;
	    int OddSum = 0;
		
		for(int num : numbers){
			if (num % 2 == 0){
				EvenCount++;
			}
			else{
				OddSum += num;
			}
        }
        System.out.println("EvenCount: " + EvenCount);
	    System.out.println("OddSum: " + OddSum);		
	}
}