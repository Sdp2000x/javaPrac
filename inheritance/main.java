package inheritance;

public class main {

	public static void main(String[] args) {
		
		car c=new car();
		c.start();
		c.stop();//single inheritance , one subclass inherits from one superclass
		
		System.out.println();
		
		artist a=new artist();
		a.eat();
		a.study();
		a.paint();//multilevel inheritance , a class derived from a class which in turn is derived from another class
		
		System.out.println();
		
		dog d = new dog();
        d.sleep();
        d.bark();

        cat ct = new cat();
        ct.sleep();
        ct.meow();//Hierarchical inheritance , multiple class inherit from a single parent
        
        System.out.println();
        
        document doc=new document();
        doc.print();
        doc.show();//multiple inheritance i.e subclass of multiple parents using interface
	}

}
