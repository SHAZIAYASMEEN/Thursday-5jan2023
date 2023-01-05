package jan3;
class Userr
{
	int id;
	String name;
	String address;
	void SetData(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println("Id:"+id+" name:"+name+" address:"+address);
	}
}
class Emp extends Userr
{
	int salary;
	public Emp(int salary)
	{
		this.salary=salary;
			}
	int calculateGross()
	{
		return salary*12;
	}
}
public class SingleInheritance1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Emp emp=new Emp(40000);
			emp.SetData(1,"shazia","hyderabad");
			emp.display();
		System.out.println("Gross Salary: "+emp.calculateGross());
		
		}
	
}


}
