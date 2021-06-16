public class EmpWageComputation
{
  public static void main(String[] args)
     {
	 System.out.println("Welcome to employee Wage Computation Program");
     int isFullTime=1;
     int isPartTime=2;
     int WagePerHr=20;
     int WorkingHrs;
     int TotalWorkingHrs=0;
     int DaysInMonth=20;
     int MaxWorkingHrs=100;
     int MonthlyTotalWage=0;
     int DailyWageArray[ ] = new int[20];
     for (int i=0; i<DaysInMonth &&  TotalWorkingHrs< MaxWorkingHrs; i++)
     {
     int empcheck = (int)(Math.floor(Math.random() * 10)) % 3;
     switch (empcheck)
     {
       case 1:
            WorkingHrs=8;
           break;
       case 2:
          WorkingHrs=4;
          break;
       default:
        WorkingHrs=0;
      }
      TotalWorkingHrs += WorkingHrs;
     DailyWageArray[i]=WorkingHrs*WagePerHr;
     }
     for (int j=0; j<DaysInMonth; j++)
     {
       int day = j+1;
     System.out.println("Day" +day+ "wage is" + DailyWageArray[j]);
     MonthlyTotalWage = MonthlyTotalWage + DailyWageArray[j];
     }
    System.out.println("\nMonthly wage is" +  MonthlyTotalWage );
  }
}