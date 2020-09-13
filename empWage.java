public class empWage {
	 public final String company;
	 public final int totalWorkingTime;
	 public final int totalWorkingDay;
	 public final int wagePerHour;
	 public int totalEmpWage;
	
	 public empWage(String a, int x, int y, int z) 
	    {
	    	this.company=a;
	    	this.wagePerHour=x;
	    	this.totalWorkingTime=y;
	    	this.totalWorkingDay=z;
	    }
	 public void setTotalEmployeeWage(int totalEmpWage)
	 {
		 this.totalEmpWage=totalEmpWage;
	 }
	 public String toString()
	 {
		 return "\n\nTotal employee wage for the company " + company + "  is " + totalEmpWage+ "\n\n " ;
	 }
}
