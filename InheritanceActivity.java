package jan4;

public class InheritanceActivity {
public static void main(String[] args) {
		 Manager mb= new Manager(126524, "peter", "kerala", 335654, 85000);
         mb.calculateSalary();
         mb.calculateTransportAllowance();
         System.out.println(".....................................");
          Trainee tb= new Trainee(29846,"seven hills","Delhi",442085,45000);
		  tb.calculateSalary();
          tb.calculateTransportAllowance();
	}

}
