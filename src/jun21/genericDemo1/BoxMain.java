package jun21.genericDemo1;

public class BoxMain {
	public static void main(String[] args) {

		Box<String,Integer> b1 = new Box<>("Box1",10);
		System.out.println(b1);
		System.out.println();

		Box<Integer,String> b2 = new Box<>(10,"Box2");
		System.out.println(b2);
		System.out.println();

		Box<Double,Integer> b3 = new Box<>(10.25,25);
		System.out.println(b3);
		System.out.println();
		b3.setItem2(36);
		System.out.println(b3);
	}
}