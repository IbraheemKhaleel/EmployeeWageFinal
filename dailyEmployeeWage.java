import java.util.*;
public class dailyEmployeeWage
{
	public static void main(String args[])
	{
		int wagePerHour=20;
		int fullDayHour=8;
		int empCheck;
		Random rand=new Random();
		empCheck=rand.nextInt(2);
		if(empCheck == 1)
		{
			int dailyWage=wagePerHour*fullDayHour;
			System.out.println("Employee is Present, daily wage is :" + dailyWage);
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}
}
