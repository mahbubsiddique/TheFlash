package collections;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String name = "CareerHack";
		
		String reverse="";
		
		//System.out.println(name.length());
		
		for(int i = name.length()-1; i>=0; i--) {
			
			reverse = reverse+name.charAt(i);
			
		}

		System.out.println(reverse);
	}

}
