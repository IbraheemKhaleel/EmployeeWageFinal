import java.util.*;

public class employeeWageCompany
{
    int fullTime=1;
    int partTime=2;
    public static void empCheck(String company, int ratePerHrs,int maxHrsPerMonth, int maxDaysPerMonth)
    {
	int empHrs,empCheck,dailyWage=0;
	int totalWage=0;
	int workingDay=0,workingTime=0;

    	 Random rand=new Random();
         while(workingDay<maxDaysPerMonth && workingTime<maxHrsPerMonth)
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
                 dailyWage=ratePerHrs*empHrs;
                 totalWage=totalWage+dailyWage;
                 workingTime=workingTime+empHrs;
                 workingDay++;
                 System.out.println("Total working hours is  "+ workingTime + " Total working days are "+ workingDay);
                 System.out.println("Total daily wage is " + totalWage);
         }
    }
	public static void main(String args[])
	{
		System.out.println("The employee details of Reliance company is \n\n ");
		empCheck("Reliance", 20,100,25);
		System.out.println("\n\nThe employee details of dMart company is \n\n ");
		empCheck("dMart", 30, 100 , 30);
	}
}
