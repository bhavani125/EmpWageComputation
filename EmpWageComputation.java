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
     int empcheck = (int)(Math.floor(Math.random() * 10)) % 3;
     switch (empcheck)
     {
       case 1:
           System.out.println("Employee is present FullTime");
           WorkingHrs=8;
           break;
       case 2:
          System.out.println("Employee is present for PartTime");
          WorkingHrs=4;
          break;
       default:
        System.out.println("Employee is Absent");
        WorkingHrs=0;
      }
     DailyWage=WorkingHrs * WagePerHr;
     System.out.println("Daily wage of employee is " + DailyWage);
    }
}