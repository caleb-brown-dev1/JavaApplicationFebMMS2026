public class StudentResult {
	
	public static void main(String[] args){
		StudentResult student = new StudentResult();
		calculateResult(80);
		calculateResult(70, 80);
		calculateResult(70, 80, 90);
		calculateResult(85.5, 85.0);
				
	}
	public static void calculateResult(int score){
		System.out.printf("Single Score: %d%n", score);
	}
	public static void calculateResult(int score1, int score2){
		double average = (score1 + score2) / 2.0;
		System.out.printf("The Avergae of two scores: %.1f%n",average);
	}
	public static void calculateResult(int score1, int score2, int score3){
		double average = (score1 + score2 + score3) / 3.0;
		System.out.printf("The Avergae of three scores: %.1f%n",average);
	}
	public static void calculateResult(double score1, double score2) {
        double average = (score1 + score2) / 2.0;
        System.out.printf("Average of two decimal scores: %.2f%n", average);
    }	
	
