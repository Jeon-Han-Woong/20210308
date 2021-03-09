package copy;

public class Test {
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4};
		
		int [] b = {1,2,3,4};
		
		b[0] = 50;
		System.out.println(b[0]);
		System.out.println(a[0]);
	}

}
