package jan2;
class Addition
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
float add(int a,float b)
	{
		return a+b;
	}
	
float add(float a,int b)
{
	return a+b;
}
}
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition obj=new Addition();
System.out.println(obj.add(12,20,30));
//System.out.println(obj.add(12,4f,50));
	}

}
