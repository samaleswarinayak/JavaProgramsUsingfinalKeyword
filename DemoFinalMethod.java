/*Use of final method in java, Compile the code and read the error message for clear understanding*/

class TestFinalMethod
{
	final void show()
	{
		System.out.println("Base class");
	}
}
class ChildFinal extends TestFinalMethod
{
	void show()//Method overriding Not allowed
	{
		System.out.println("Derived class");
	}
}
class DemoFinalMethod
{
	public static void main(String args[])
	{
		ChildFinal ob = new ChildFinal();
		ob.show();
		ob.show();
	}
}