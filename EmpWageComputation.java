public class EmpWageComputation
{
  public static void main(String[] args)
     {
	 System.out.println("Welcome to employee Wage Computation Program");
     int isFullTime=1;
     double empcheck = Math.floor(Math.random() * 10) % 2;
     if(empcheck == isFullTime)
     {
       System.out.println("Employee is present");
     }
     else
        System.out.println("Employee is Absent");
	 }
}