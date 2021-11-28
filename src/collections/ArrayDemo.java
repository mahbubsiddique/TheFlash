package collections;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int [] x = {-100000, -20, -30, -400, -50, -60, -70};
		
		//length = 7
		//min index = 0; max index = length - 1
		
		//System.out.println(x[x.length-1]);
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<x.length; i++) {
			
			if(max<x[i])
				max = x[i];
		}
		
		System.out.println(max);

	}

}
