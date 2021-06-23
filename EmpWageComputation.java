
public class EmpWageComputation {

    public static void main(String[] args) {
        
        System.out.println("Welcome to employee wage computation problem");
        
        
        //creating an object for companies this part we can say function also
        System.out.println("HappiestMinds");
        EmpWage HappiestMinds = new EmpWage("HappiestMinds",20,30,100);
        //calling the method here
        HappiestMinds.CalculatingEmpWages();
        System.out.println("BridgeLabz");
        EmpWage BridgeLabz = new EmpWage("BridgeLabz",25,28,150);
        ///calling the method
        BridgeLabz.CalculatingEmpWages();
        System.out.println("Accenture");
        EmpWage Accenture = new EmpWage("Accenture", 30, 20,120);
        //calling the method
        Accenture.CalculatingEmpWages();
        
    }


}