package singleton;
class Class1 {
	private Class1()
	{
	}
	private static Class1 class1obj;
	public static Class1 getClass1Obj()
	{
		if(class1obj!=null)
		{
			class1obj = new Class1();
		}
		return class1obj;
	}
}
