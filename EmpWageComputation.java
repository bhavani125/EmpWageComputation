public class EmpWageComputation
{
  public static void main(String[] args)
     {
	 System.out.println("Welcome to employee Wage Computation Program");
     int isFullTime=1;
     int isPartTime=2;
     int DailyWage;
     int WagePerHr=20;
     int WorkingHrs;
     double empcheck = Math.floor(Math.random() * 10) % 3;
     if(empcheck == isFullTime)
     {
       System.out.println("Employee is present");
       WorkingHrs=8;
     }
     else if(empcheck == isPartTime)
     {
        System.out.println("Employee is present for PartTime");
        WorkingHrs=4;
     }
     else
      {
        System.out.println("Employee is Absent");
        WorkingHrs=0;
      }
     DailyWage=WorkingHrs * WagePerHr;
     System.out.println("Daily wage of employee is " + DailyWage);
	 }
}