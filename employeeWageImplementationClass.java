public class employeeWageImplementationClass {

	public static void main(String[] args) {
		employeeWageCompany reliance = new  employeeWageCompany("Reliance",20,100,20);
		employeeWageCompany dMart = new  employeeWageCompany("dMart", 30,50,30);
		System.out.println("Name of the company is " + reliance.name);
		reliance.empCheck();
		System.out.println("\n\n Name of the company is " +dMart.name + "\n\n");
		dMart.empCheck();

	}

}
