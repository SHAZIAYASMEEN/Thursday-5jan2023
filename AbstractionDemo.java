package Day5_01_2023;

abstract class Bank
{
	void method()
	{
		System.out.println("method 1");
	}
	abstract void loanInterest();
}
class Hdfc extends Bank
{
	void loanInterest() {
		System.out.println("11%  interset will be given");
	}
}
class Boi extends Bank
{
	void loanInterest() {
		System.out.println("13%  interset will be given");
	}
	}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Boi b=new Boi();
b.loanInterest();b.method();
	}

}
