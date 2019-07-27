import java.util.*;

class Author
{
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender)
	{
		this.name   = name;
		this.email  = email;
		this.gender = gender;
	}
	String getName()
	{
		return name;
	}
	String getEmail()
	{
		return email;
	}
	void setEmail(String email)
	{
		this.email = email;
	}
	char getGender()
	{
		return gender;
	}
}

class Book
{
	private String name;
	private Author author;
	private double price;
	private int qty;
	public Book(String name, Author author, double price)
	{
		this.name = name;
		this.author = author;
		this.price = price;	
		this.qty = 0;
	}
	public Book(String name, Author author, double price, int qty)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	String getName()
	{
		return name;
	}
	Author getAuthor()
	{
		return author;
	}
	void setPrice( double price )
	{
		this.price = price;
	}
	double getPrice()
	{
		return price;
	}
	void setQty(int qty)
	{
		this.qty = qty;
	}
	int getQty()
	{
		return qty;
	}
}

public class TestBook
{
	static Scanner in = new Scanner(System.in);
	static String bname,aname,email;
	static int qty,ch;
	static double price;
	static char gender;
	public static void main (String args[])
	{
		System.out.println(" Testing Book Class ");
		System.out.println();
		System.out.println(" Enter Name of Book: ");
		bname = in.next();
		System.out.println(" Enter Author of Book: ");
		aname = in.next();
		System.out.println(" Enter Author Email: ");
		email = in.next();
		System.out.println(" Enter Author Gender ( M / F): ");
		gender = in.next().charAt(0);
		System.out.println(" Do you want to enter Quantity of Book ? (1. Yes / 2. No ) ");
		ch = in.nextInt();
		if(ch == 1)
		{
			System.out.println(" Enter Quantity of Book: ");
			qty = in.nextInt();
		}
		System.out.println(" Enter price of Book: ");
		price = in.nextDouble();
		System.out.println();
		System.out.println(" Initialising Author Class Object ");
		Author A = new Author(aname, email, gender);
		Book B;
		System.out.println();
		System.out.println(" Author Class Object Initialised ");
		System.out.println();
		System.out.println(" Initialising Book Class Object ");
		if(ch == 1)
		{
			B = new Book(bname, A, price, qty);
		}
		else
		{
			B = new Book(bname, A, price);
		}
		System.out.println();
		System.out.println(" Book Class Object Initialised ");
		System.out.println();
		System.out.println(" Testing setEmail() and getEmail() ");
		System.out.println();
		System.out.println(" Enter new mail of Author: ");
		email = in.next();
		B.getAuthor().setEmail(email);
		System.out.println(" New mail of Author: "+ B.getAuthor().getEmail());
		System.out.println();
		System.out.println(" Testing setPrice() and getPrice() ");
		System.out.println();
		System.out.println(" Enter new price of Book: ");
		price = in.nextDouble();
		B.setPrice(price);
		System.out.println(" New price of Book :"+ B.getPrice());
		System.out.println();
		System.out.println(" Testing setQty() and getQty() ");
		System.out.println();
		System.out.println(" Enter new quantity of Book: ");
		qty = in.nextInt();
		B.setQty(qty);
		System.out.println(" New Quantity of Book: "+ B.getQty());
	}
}

