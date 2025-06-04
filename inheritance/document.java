package inheritance;

public class document implements printable,showable{
	
	public void print() {
        System.out.println("Printing document");
    }

    public void show() {
        System.out.println("Showing document");
    }
	
}
