import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class totalWageQuerriedFinal implements interfaceMultipleCompanies
	{
	    int fullTime=1;
	    int partTime=2,empCheck;
	    private LinkedList<empWage> empWageList;
	    private Map<String,empWage> empWageMap;
	    public totalWageQuerriedFinal()
	    {
	    	empWageList = new LinkedList<>();
	    	empWageMap = new HashMap<>();
	    }
	    public void addCompanyArray(String company, int wagePerHour, int totalWorkingTime, int totalWorkingDays) 
	    {
	    	empWage EmpWage = new empWage(company,wagePerHour,totalWorkingTime,totalWorkingDays);
	    	empWageList.add(EmpWage);
	    	empWageMap.put(company, EmpWage);
	    }
	    public void computeEmpWage()
	    {
	    	for(int i=0; i<empWageList.size(); i++)
	    	{
	    		empWage EmpWage = empWageList.get(i);
	    		EmpWage.setTotalEmployeeWage(this.computeEmpWage(EmpWage));
	    		System.out.println(EmpWage);
	    	}
	    }
	    public int getTotalWage(String company)
	    {
	    	return empWageMap.get(company).totalEmpWage;
	    }
	    private int computeEmpWage(empWage EmpWage)
	    {
	    	int empHrs=0,workingDay=0,workingTime=0,empCheck,totalWage=0,dailyWage=0;
	    	
	    	Random rand=new Random();
	         while(workingDay<EmpWage.totalWorkingDay && workingTime<EmpWage.totalWorkingTime)
	         {
	                 empCheck=rand.nextInt(3);
	                 if(empCheck == 1)
	                 {
	                     if((workingTime+7) >=EmpWage.totalWorkingTime)
						{
	                    	empCheck=2;
							break;
						}
	                	 empHrs=8;
	                     System.out.println("Employee is Full day Present");
	                         
	                         
	                 }
	                 else if ( empCheck == 2 )
	                 {
	                	 if((workingTime+5) >=EmpWage.totalWorkingTime)
							{
								break;
							}
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
	                 dailyWage=empHrs*EmpWage.wagePerHour;
	                 totalWage+=dailyWage; 
	                 System.out.println("Day # " + workingDay + " working Hours is " + empHrs+ "  daily wage is  " + dailyWage);
	         }
	         System.out.println("Total working time is " + workingTime);
	         System.out.println("The total wage is " + totalWage);
	        
	         return workingTime * EmpWage.wagePerHour ;
	        
	    }
	  
	
	  	

	public static void main(String[] args) {
		interfaceMultipleCompanies empWageBuilder = new totalWageQuerriedFinal();
		empWageBuilder.addCompanyArray("Reliance", 20, 100, 20);
		empWageBuilder.addCompanyArray("dMart", 30, 150, 30);
		empWageBuilder.computeEmpWage();
		System.out.println("Total employee wage for dMart is "+ empWageBuilder.getTotalWage("dMart"));
		
		
	}

}
