package pack1;

public class Test implements Left,Right{
	
	public void method1(int a, int b) {
		System.out.println(a+" "+b);
	}
	public void method2(String s,String y) {
		System.out.println(s+" "+y);
	}
	public void method3(int b, int a) {
		System.out.println(b +" "+a);
}
	public static void main(String[] args) {
		Test ts= new Test();
		ts.method1(10,20);
		ts.method2("pathan","DaDA ");
		ts.method3(19,20);
	}

}
                        