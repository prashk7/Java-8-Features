package LambdaVSInnerClass;

public class Test {

	int x = 10;

	public void m2() {

		int y = 20;
		Interf1 i = () -> {
			// y = 30; local method variables accessed in lambda expressions will be
			// declared as final variable
			System.out.println("x = " + x);
			System.err.println("y = " + y);
		};

		i.m1();
	}

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.m2();
	}

}
