package dataEncapsulation;

public class schoolBag {
	
	private String books;
	private String pencil;// private variables or contents of the bag that anybody else cannot access


	//Public setters to put items in bag
	public void setBooks(String Book) {
		this.books=Book;
	}
	
	public void setPencil(String Pencil) {
		this.pencil=Pencil;
	}


	//Public getters to access items from the bag
	public String getBooks() {
		return books;
	}
	
	public String getPencil() {
		return pencil;
	}
}
