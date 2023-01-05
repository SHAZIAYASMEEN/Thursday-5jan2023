package jan4;
class Bank
{
int loanInterest()	

	{
	return 8;
}
}
class SBI extends Bank
{
	@Override
		int loanInterest()
		{
		return 7;
	  }
}
class AXIS extends Bank
{
	
		@Override
		int loanInterest()
		{
		return 10;
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI sbi=new SBI();
System.out.println(sbi.loanInterest()+"%");
AXIS axis=new AXIS();
System.out.println(axis.loanInterest()+"%");

	}

}
