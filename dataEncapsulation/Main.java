package dataEncapsulation;

public class Main {

	public static void main(String[] args) {
		
		schoolBag myBag=new schoolBag();
		myBag.setBooks("Math");
		myBag.setPencil("Apsara");
		
		 System.out.println("Book : " + myBag.getBooks());
		 System.out.println("Pencil : " + myBag.getPencil());
		
	}

}
