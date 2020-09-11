import java.util.*;
public class partTimeEmployeeWage
{
        public static void main(String args[])
        {
		int fullTime=1;	
		int partTime=2;
                int wagePerHour=20;
                int fullDayHour=8;
		int partTimeHour=4;
                int empCheck,dailyWage;
                Random rand=new Random();
                empCheck=rand.nextInt(3);
                if(empCheck == 1)
                {
                        dailyWage=wagePerHour*fullDayHour;
                        System.out.println("Employee is Present, daily wage is :  " + dailyWage);
                }
                else if ( empCheck == 2 )
                {
			dailyWage=wagePerHour*partTimeHour;
                        System.out.println("Employee is Part time , daily wage is "+ dailyWage);
                }
        }
}
