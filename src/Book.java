public class Book {
	
	private static final double TAX = 0.20;
	
	private String title;
	private String fName;
	private String lName;
	private int year;
	private double price;
	
	public Book(String title, String firstName, String lastName, int year, double price) {
		this.title = title == "" || title == null ? "Unknown" : title;
		this.fName = firstName == "" || firstName == null ? "undefined" : firstName;
		this.lName = lastName == "" || lastName == null ? "undefined" : lastName;
		this.year = year < 1900 ? 1900 : year;
		this.price = price < 0 ? -1 : price;
	}
	// getter
	public String getTitle() {
		return this.title;
	}
	
	public String getFName() {
		return this.fName;
	}
	
	public String getLName() {
		return this.lName;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public double getPrice() {
		return this.price;
	}
	// Only get total value
	public double getTotalPrice() {
		return this.price * (TAX + 1);
	}
	// setter
	public void setTitle(String title) {
		this.title = title == "" || title == null ? "Unknown" : title;
	}
	
	public void setFirstName(String fName) {
		this.fName = fName == "" || fName == null ? "undefined" : fName;
	}
	
	public void setLastName(String lName) {
		this.lName = lName == "" || lName == null ? "undefined" : lName;
	}
	
	public void setYear(int year) {
		this.year = year < 1900 ? 1900 : year;
	}
	
	public void setPrice(double price) {
		this.price = price < 0 ? -1 : price;
	}
}