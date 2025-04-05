package week2.day1;

public class Library {
	
	
	public String addBook(String bookTitle) {
		
		System.out.println(bookTitle);
	
		return bookTitle;
		
	}
	
		public void issueBook() {
		
			System.out.println("Book issued sucessfully");
	
}
	public static void main(String[] args) {
		
		Library books= new Library();
		books.addBook("Book added sucessfully");
		books.issueBook();
		
	}

}
