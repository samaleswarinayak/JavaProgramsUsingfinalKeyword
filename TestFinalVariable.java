/*USe of final keyword for variable, Compile the code and read the error message for clear understanding*/

class TestFinalVariable
{
	final int no = 70;
	/*TestFinal()
	{
		no = 50;
	}*/
	public static void main(String args[])
	{
		TestFinal ob = new TestFinal();
		ob.no = 50;//Not allowed
		System.out.println("After modification Value of number is = "+ob.no);
	}
}