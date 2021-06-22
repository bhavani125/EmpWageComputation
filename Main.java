public class Main {
    //constant variables
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;
    //instance variable
    private final String company;
    private final int wagePerHr;
    private final int totalWorkingDays;
    private final int maxHrsPerMonth;

    //we have instance variables so we are defining the constructor
    public Main(String company, int wagePerHr, int totalWorkingDays, int maxHrsPerMonth) {
        this.company = company;
        this.wagePerHr = wagePerHr;
        this.totalWorkingDays = totalWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void CalculatingEmpWages() {
        // local variables
        int workingHrs;
        int numberOfWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= maxHrsPerMonth && numberOfWorkingDays < totalWorkingDays) {
            int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
            numberOfWorkingDays++;
            switch (empCheck) {
                case isFullTime:
                    workingHrs = 8;
                    break;
                case isPartTime:
                    workingHrs = 4;
                    break;
                default:
                    workingHrs = 0;
            }
            totalEmpHrs += workingHrs;
            System.out.println(" employee : Day " + numberOfWorkingDays + " he worked for " + workingHrs + " hours ");
        }
        int totalEmpWage = totalEmpHrs * wagePerHr;
        System.out.println(" Total employee wage for a company " + totalEmpWage);
    }
}