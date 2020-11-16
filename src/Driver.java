
public class Driver {

	public static void main(String[] args) {
		Book[] bookArray = new Book[3];
		bookArray[0] = new Book("edu", "Rivas", "Pro", 1991, 10.0);
		bookArray[1] = new Book("edu", "Rivas", "Pro", 1991, 2.0);
		bookArray[2] = new Book("edu", "Rivas", "Pro", 1991, 11);
		printBooks(bookArray);
		bookArray[1].setTitle("pedro");
		bookArray[2].setFirstName("pro");
		System.out.println("\nUpdate value");
		printBooks(bookArray);
	}
	
	public static void printBooks(Book[] bookArray) {
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].getPrice() == -1) {
				System.out.println("Please write the price more than 0");
			} else {
				System.out.println("Title: " + bookArray[i].getTitle() + " " + bookArray[i].getFName() + " " + bookArray[i].getLName() + " " + bookArray[i].getYear() + " Price=" + bookArray[i].getPrice() + " TotalPrice=" + bookArray[i].getTotalPrice());
			}
		}
	}
}
