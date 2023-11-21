package interface12;

public interface Two {
	public void method2();
	default void m1() {
		System.out.println("Hii i am default method ");
		
	}
	static void m3() {
		System.out.println("i am static method");
	}
	
}
