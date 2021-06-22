
public class EmpWageComputation {

    public static void main(String[] args) {
        
        System.out.println("Welcome to employee wage computation problem");
        
        
        //creating an object for companies this part we can say function also
        
        Main HappiestMinds = new Main("HappiestMinds",20,30,100);
        //calling the method here
        HappiestMinds.CalculatingEmpWages();
        Main BridgeLabz = new Main("BridgeLabz",25,28,150);
        ///calling the method
        BridgeLabz.CalculatingEmpWages();
        Main Accenture = new Main("Accenture", 30, 20,120);
        //calling the method
        Accenture.CalculatingEmpWages();
    }


}