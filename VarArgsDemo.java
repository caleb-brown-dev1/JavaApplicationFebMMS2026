public class VarArgsDemo{
	public static void main(String[] args){
		addition();
		addition(3,2,6);
		addition(8,5,3,2,1);
		addition(8,6);
		addition(5,2,1,4,5,7,9,1);
		addition(9,0,2,1,5,4);
	}
	
	public static void addition(int... numbers){
		int sum = 0;
		for(int num : numbers){
		    sum += num;
	    }
		
		System.out.println(sum);
	}
}