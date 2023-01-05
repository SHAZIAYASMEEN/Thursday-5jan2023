package jan4;

public class Employee {
long employeeId;
     String employeeName;
     String employeeAddress;
     long employeephone;
     double basicSalary;
     double specialAllowance=240.60;
     double hra=1000.30;
     
     public Employee() {
    	 super();
     }
     public Employee(long id,String name,String address,long phone) {
     this.employeeId=id;
     this.employeeName=name;
     this.employeeAddress=address;
     this.employeephone=phone;
}
void calculateSalary() {
	double salary=0.0;
	salary=basicSalary+(basicSalary*(specialAllowance/100));
	System.out.println("The "+ this.getClass().getSimpleName()+"salary is:+salary");
}
void calculatetransportAllowance() {
	double transportAllowance=0.0;
	transportAllowance=0.10*basicSalary;
	 double Salary=basicSalary-transportAllowance;
	System.out.println("The "+ this.getClass().getSimpleName()+"salary after transport");
}

}