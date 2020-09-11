import java.util.*;
public class employeeWageMonthWorkingHours
{
        public static void main(String args[])
        {
		int fullTime=1;	
		int partTime=2;
                int wagePerHour=20;
                int empHrs;
		int totalWage =0;
                int empCheck;
		int dailyWage;
		int workingDay = 0;
		int workingHours = 0;
                Random rand=new Random();
		while(workingDay<20 && workingHours<100)
		{
                	empCheck=rand.nextInt(3);
                	if(empCheck == 1)
                	{
				empHrs=8;
                	}
                	else if ( empCheck == 2 )
                	{
				empHrs=4;
                	}
			else
			{
				empHrs=0;
				workingDay--;
			}
			dailyWage=wagePerHour*empHrs;
			workingDay++;
			totalWage=totalWage+dailyWage;
			workingHours=workingHours+empHrs;
		
		}
		System.out.println("Monthly wage is  "  + totalWage );
		System.out.println(" Total working day is " + workingDay);
		System.out.println("Total working hours are " + workingHours);
        }
}
