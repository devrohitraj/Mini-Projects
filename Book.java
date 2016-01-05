package OOPSAssignment.Encapsulation;
import OOPSAssignment.Encapsulation.Author;

public class Book {
	
	private String name = "";
	private Author author = null;
	private double price = 0.0;
	private int qtyInStock = 0;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the qtyInStock
	 */
	public int getQtyInStock() {
		return qtyInStock;
	}

	/**
	 * @param qtyInStock the qtyInStock to set
	 */
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	/**
	 * @param name
	 * @param author
	 * @param price
	 * @param qtyInStock
	 */
	public Book(String name, Author author, double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author me = new Author("Rohit Raj", "rohit.rohitraj.info", 'M');
		
		Book aBook = new Book("Jobs - A Legend", me, 1000.0, 5);
		
		aBook.getName();
		aBook.getPrice();
		aBook.getQtyInStock();
		
		me.getAuthorname();
		me.getEmail();
		me.getGender();

	}

}
