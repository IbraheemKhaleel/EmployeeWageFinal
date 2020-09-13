public class employeeWageCompanyWithObjectImplementation {

	public static void main(String[] args) {
		employeeWageCompanyWithObject reliance = new  employeeWageCompanyWithObject("Reliance",20,100,20);
		employeeWageCompanyWithObject dMart = new  employeeWageCompanyWithObject("dMart", 30,50,30);
		System.out.println("Name of the company is " + reliance.name);
		reliance.empCheck();
		System.out.println("\n\n Name of the company is " +dMart.name + "\n\n");
		dMart.empCheck();

	}

}
