
public class EmpWageComputation {
    //constant variables
    public static int isPresent = 1, isPartTime = 2, wagePerHr = 20, maxWorkingHours = 100, daysInMonth = 20;
    public static int dailyWageArray[] = new int[20];
    public static int workingHrs, totalWorkingHrs = 0, monthlyWage = 0;


    //creating main method
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation problem");
        //creating object
        EmpWageComputation wage= new EmpWageComputation();
        //calling the method  monthlyWage to the object we created
        wage.monthlyWage();
    }

    // creating a method to calculate monthly wages
    void monthlyWage() {
        for (int i=0; i<daysInMonth&& totalWorkingHrs<maxWorkingHours; i++) {
            int empAttendance= (int)(Math.floor(Math.random() * 10)) % 3;
            switch (empAttendance) {
                case 1 -> workingHrs = 8;
                case 2 -> workingHrs = 4;
                default -> workingHrs = 0;
            }
            totalWorkingHrs+= workingHrs;
            dailyWageArray[i] = workingHrs * wagePerHr;
        }
        for (int j=0; j<daysInMonth; j++) {
            int day = j+1;
            System.out.println(" employee Day " + day + " wage is " + dailyWageArray[j]);
            monthlyWage = monthlyWage + dailyWageArray[j];
        }
        System.out.println("\nMonthly wage of an employee is " + monthlyWage);
    }

}

