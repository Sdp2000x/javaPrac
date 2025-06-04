package Default;
import java.util.*;
import java.text.*;

interface Car{
	
	void brake();
	void accelerate();
	
} //interface defines what a car can do but not how , doesn't show the implementation

class Sedan implements Car{
	
	public void accelerate() {
        System.out.println("Sedan is accelerating using fuel injection system.");
    }

    public void brake() {
        System.out.println("Sedan is braking using hydraulic disc brakes.");
    }
    
} // Sedan class implements the functionality but hides the internal logic

public class Driver {

	public static void main(String[] args) {
		
		Car myCar=new Sedan(); // only sees the functionality 
		myCar.accelerate();
		myCar.brake();  
	}

}
