import java.util.*;
public class employeeWageCompanyWithObject
{
    int fullTime=1;
    int partTime=2;
    int wagePerHour=20;
    int empHrs;
    int empCheck;
    int dailyWage;
    int totalWorkingDay;
    int totalWorkingTime;
    int totalWage;
    int workingDay;
    int workingTime;
    String name = "";
    public employeeWageCompanyWithObject(String a, int x, int y, int z) 
    {
    	this.name=a;
    	this.wagePerHour=x;
    	this.totalWorkingTime=y;
    	this.totalWorkingDay=z;
    }
    public void empCheck()
    {
    	 Random rand=new Random();
         while(workingDay<totalWorkingDay && workingTime<totalWorkingTime)
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
                 dailyWage=wagePerHour*empHrs;
                 totalWage=totalWage+dailyWage;
                 workingTime=workingTime+empHrs;         
                 workingDay++;
                 System.out.println("Total working hours is  "+ workingTime + " Total working days are "+ workingDay);
                 System.out.println("Total daily wage is " + totalWage);
         }
    }
}


