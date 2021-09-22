package org.howard.edu.lsp.assignment2;


public class Book {
	private String title; 
	private boolean borrowed; 

	// Creates a new Book 
	public Book(String bookTitle) {
		title = bookTitle;
		borrowed = false;
	} 
	// Marks the book as rented 
	public void borrowed() { borrowed = true;} 
	// Marks the book as not rented 
	public void returned() { borrowed = true;} 
	// Returns true if the book is rented, false otherwise public 
	public boolean isBorrowed() { return borrowed; } 
	// Returns the title of the book public 
	public String getTitle() { return title;}
	
	public void setBorrowed(boolean borrowed) {this.borrowed = borrowed;}
	
	public static void main(String[] args) {

        Book book= new Book("The Da Vinci Code");
        System.out.println("Title: "+book.getTitle());
        System.out.println("isBorrowed?: "+book.isBorrowed());
        book.borrowed();
        System.out.println("Borrowed?: "+book.isBorrowed());
        System.out.println("Returned?: "+(!book.isBorrowed()));
  }

		}
