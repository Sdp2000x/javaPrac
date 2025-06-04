package polymorphism;

public class main {

	public static void main(String[] args) {
		
		calculator calc=new calculator();
		System.out.println(calc.add(2,3));
		System.out.println(calc.add(1,2,3));
		System.out.println(calc.add(1.6,1.8));
		
		//compile time polymorphism using method overloading
		
		animal a=new dog();
		a.sound();
		
		a=new cat();
		a.sound();
	}

}
