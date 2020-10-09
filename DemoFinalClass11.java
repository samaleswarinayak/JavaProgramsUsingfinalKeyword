/*use of final class in Java, Compile the code and read the error message for clear understanding*/


final class TestFinalMethod11
{
	void show1()
	{
		System.out.println("Base class");
	}
}
class ChildFinal11 extends TestFinalMethod11//Not allowed
{
	void show2()
	{
		System.out.println("Derived class");
	}
}
class DemoFinalClass11
{
	public static void main(String args[])
	{
		ChildFinal11 ob = new ChildFinal11();
		ob.show1();//Derived class
		ob.show2();//Base class
	}
}