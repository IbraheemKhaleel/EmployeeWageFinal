import java.util.*;
public class multipleCompaniesWageArray
	{
	    int fullTime=1;
	    int partTime=2,empCheck;
	    private int numOfCompanies=0;
	    private empWage[] empWageArray;
	    public multipleCompaniesWageArray()
	    {
	    	empWageArray = new empWage[5];
	    }
	    private void addCompanyArray(String company, int wagePerHour, int totalWorkingTime, int totalWorkingDays) 
	    {
	    	empWageArray[numOfCompanies] = new empWage(company,wagePerHour,totalWorkingTime,totalWorkingDays);
	    	numOfCompanies++;
	    }
	    private void computeEmpWage()
	    {
	    	for(int i=0; i<numOfCompanies; i++)
	    	{
	    		empWageArray[i].setTotalEmployeeWage(this.computeEmpWage(empWageArray[i]));
	    		System.out.println(empWageArray[i]);
	    	}
	    }
	    private int computeEmpWage(empWage EmpWage)
	    {
	    	int empHrs=0,workingDay=0,workingTime=0,empCheck;
	    	Random rand=new Random();
	         while(workingDay<EmpWage.totalWorkingDay && workingTime<EmpWage.totalWorkingTime)
	         {
	                 empCheck=rand.nextInt(3);
	                 if(empCheck == 1)
	                 {
	                     empHrs=8;
	                     System.out.println("Employee is Full day Present");
	                 }
	                 else if ( empCheck == 2 )
	                 {
	                	 empHrs=4;
	                     System.out.println(" Employee is Part time");
	                 }
	                 else
	                 {
	                         System.out.println(" Employee is absent ");
	                         empHrs=0;
	                         workingDay--;
	                 }
	                 workingDay++;
	                 workingTime+=empHrs;
	                 System.out.println("Day # " + workingDay + " working Hours is " + empHrs);
	         }
	         return workingTime * EmpWage.wagePerHour;
	    }
	public static void main(String[] args) {
		multipleCompaniesWageArray empWageBuilder = new  multipleCompaniesWageArray();
		empWageBuilder.addCompanyArray("Reliance", 20, 100, 20);
		empWageBuilder.addCompanyArray("dMart", 30, 150, 30);
		empWageBuilder.computeEmpWage();
	}

}
