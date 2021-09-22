package org.howard.edu.lsp.assignment2;

public class Library {
	
    //Added private variables
    private static final String openingTime = "9am";
    private static final String closingTime = "5pm";
    //Instance variable to hold address of individual libraries
    private String address;
    private Book[] books = new Book[10];
    private int allBooks = 0;


	// Constructor – look it up
	public Library(String address) {
		// Implement the constructor
		   this.address = address;
	}

    public void addBook(Book book) {
        books[allBooks] = book;   
        allBooks++;  
    }
    
    public void printOpeningHours() {
        System.out.print("Libraries are open daily from "+ openingTime + " to " + closingTime + ".");
    }
    
    public void printAddress() {
        System.out.print(this.address);
    }
    
    public void borrowBook(String title) {
        boolean available = false; 
        boolean borrowed = false;   
        for (int i=0;i<allBooks;i++) {    
            if (books[i].getTitle().equals(title)) {    
                available = true;  
                if (books[i].isBorrowed()) {
                    borrowed = true;    
                } else {
                    books[i].setBorrowed(true); 
                    System.out.println("You successfully borrowed " + title);
                    return;
                }
            }
        }
        if (!available) {   
            System.out.println("Sorry, this book is not in our catalogue.");
            return;
        }
        if (available && borrowed) {    
            System.out.println("Sorry, this book is already borrowed.");
        }
    }
 
    public void printAvailableBooks() {
        if (allBooks==0) {    
            System.out.print("No book in catalogue");
            return;
        }
        for (int i=0;i<allBooks;i++) {   
            if (!books[i].isBorrowed()) {
                System.out.println(books[i].getTitle());
            }
        }
    }
    

    public void returnBook(String title) {
        for (int i=0 ; i<allBooks ; i++) {
            if (books[i].getTitle().equals(title)) {   
                books[i].setBorrowed(false);    
                System.out.println("You have successfully returned "+ title);
                return;
            }
        }
    }



    
    
    
    
    
    
    
    
    
    
    

	public static void main(String[] args) { 
	// Create two libraries 
	Library firstLibrary = new Library("10 Main St."); 
	Library secondLibrary = new Library("228 Liberty St."); 

	// Add four books to the first library 
	firstLibrary.addBook(new Book("The Da Vinci Code")); firstLibrary.addBook(new Book("Le Petit Prince")); 
	firstLibrary.addBook(new Book("A Tale of Two Cities")); firstLibrary.addBook(new Book("The Lord of the Rings")); 

	// Print opening hours and the addresses 
	System.out.println("Library hours:");
	firstLibrary.printOpeningHours();
	System.out.println(); 
	System.out.println(); 
	
	System.out.println("Library addresses:"); 
	firstLibrary.printAddress(); 
	System.out.println(); 
	secondLibrary.printAddress(); 
	System.out.println(); 
	System.out.println(); 


	// Try to borrow The Lords of the Rings from both libraries  firstLibrary.borrowBook("The Lord of the Rings"); 
	System.out.println("Borrowing The Lord of the Rings:");
	firstLibrary.borrowBook("The Lord of the Rings"); 
	firstLibrary.borrowBook("The Lord of the Rings"); 
	secondLibrary.borrowBook("The Lord of the Rings"); 
	System.out.println(); 
	// Print the titles of all available books from both libraries 
	
	System.out.println("Books available in the first library:"); 
	firstLibrary.printAvailableBooks(); 
	System.out.println(); 
	System.out.println("Books available in the second library:"); 
	secondLibrary.printAvailableBooks(); 
	System.out.println(); 
	System.out.println();

	// Return The Lords of the Rings to the first library 
	System.out.println("Returning The Lord of the Rings:"); 
	firstLibrary.returnBook("The Lord of the Rings"); 
	System.out.println(); 
	System.out.println("Books available in the first library:"); 
	firstLibrary.printAvailableBooks(); 
	   	 } 
}



