package polymorph;

public class PCMain {
	
	public static void getPc(Parent parent) {
		parent.showNum();
	}
	
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Parent p1 = new Parent();
		getPc(c1);
		
	}
}
