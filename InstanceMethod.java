public class InstanceMethod{
	
	public static void main(String[] args){
		InstanceMethod objl = new InstanceMethod();
		objl.Clap("Precious", "Female");
		
		InstanceMethod obj2 = new InstanceMethod();
		obj2.Clap("Martins", "Female");
		
		InstanceMethod obj3 = new InstanceMethod();
		obj3.Clap("Williams", "Female");
		
	}
	public void Clap(String name, String gender){
		if(gender.equals("Male")){
			System.out.println(name + "clapping his hands");
		}
		else{
			System.out.println(name + "is clapping her hands");
		}
	}
}