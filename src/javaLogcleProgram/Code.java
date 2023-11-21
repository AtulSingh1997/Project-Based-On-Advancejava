package javaLogcleProgram;

public class Code {
	public static void main(String [] args) {
		Code c=new Code();
		c.main();
	}
	static void main() {
		try {
			System.out.println("A");
			int num=7/0;
			
			//throw new Exception();
			
		}
		catch(Exception e) {
			System.out.println("B");
		}
		finally {
			System.out.println("c");
			//int num=7/0;
			
			System.out.println("D");
		}
		System.out.println("E");
	}

}
