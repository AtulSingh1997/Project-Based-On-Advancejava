package interface12;

public class Three implements One,Two {
	public void method1() {
		System.out.println("method one call");
	}
	public void method2() {
		System.out.println("method two call");
	}
	public static void main (String [] args) {
		Two th= new Three();
		Three th1= new Three ();
		th1.method1();
		th.method2();
	}

}
