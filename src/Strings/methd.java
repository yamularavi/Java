package Strings;
class A{
	static {
		System.out.println("static block");}
	A()
	{
		System.out.println("default method");}
	static void m2()
	{
		System.out.println("am a static method +x");
	}
	void m3()
	{
		System.out.println("method");
	}
	int k=m4();
	int m4()
	{
		m3();
		System.out.println("am m4");
		return 5;
	}
	{
		System.out.println("am ravi");
	}
}
public class methd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
A.m2();
	System.out.println("ravi");
	}

}
