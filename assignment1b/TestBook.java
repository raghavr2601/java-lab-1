import java.util.*;
import java.lang;

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
	private int qty = 0;
	public Book(String name, Author author, double price)
	{
		this.name = name;
		this.author = author;
		this.price = price;	
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
	Scanner input = new Scanner(System.in);
	static String bname,aname,email;
	static int qty,ch,bcount = 0,acount = 0, i = 0, flag = 0;
	static double price;
	static char gender, choice;
	Author A[] = new A[100];
	Author temp = new A();
	Book B[] = new B[100];
	public static void main(String args[])
	{
		do
		{
		System.out.println(" Menu ");
		System.out.println(" 1. Enter Author Details ");
		System.out.println(" 2. Enter Book Details ");
		System.out.println(" 3. Display Author Details ");
		System.out.println(" 4. Display Book Details ");
		System.out.println(" 5. Modify Author Details ( Email ) ");
		System.out.println(" 6. Modify Book Details ");
		System.out.println(" Enter your choice !");
		ch = in.nextInt();	
		if(ch == 1)
		{
			System.out.println(" Enter Name of Author: ");
			aname = in.next();
			System.out.println(" Enter Email of Author: ");
			email = in.next();
			System.out.println(" Enter Gender of Author ( M / F ): ");
			gender = in.next().charAt(0);
			A[acount](aname, email, gender);
			acount+=1;
		}
		else if (ch == 2)
		{
			System.out.println(" Enter Name of Book :");
			bname = in.next();
			System.out.println(" Enter Name of Author of Book: ");
			aname = in.next();
			System.out.println(" Enter Price of Book: ");
			price = in.nextDouble();
			System.out.println(" Do you wish to Enter Quantity of Book ( Y / N ) ?");
			choice = in.next().charAt(0);
			if(choice == 'Y')
			{
				System.out.println(" Enter Quantity of Book: ");
				qty = in.nextInt();
			}
			for(i=0;i<acount;i++)
			{
				if(A[i].getName().equals(aname))
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println(" No Authors matching with name entered found in database ");
				System.out.println(" Enter Details of New Author ");
				System.out.println(" Enter Name of Author: ");
				aname = in.next();
				System.out.println(" Enter Email of Author: ");
				email = in.next();
				System.out.println(" Enter Gender of Author ( M / F ): ");
				gender = in.next().charAt(0);
				A[acount](aname, email, gender);
				i = acount;
				acount+=1;
			}
			if( choice == 'Y')
			{
				B[bcount](bname,A[i],price,qty);
				bcount+=1;
			}
			else
			{
				B[bcount](bname,A[i],price);
				bcount+=1;
			}
		}
		else if(ch == 3)
		{
			System.out.println(" Enter name of Author to Display Details ");
			aname = in.next();
			for(i=0;i<acount;i++)
			{
				if(A[i].getName().equals(aname))
				{
					flag = 1;
					break;
				}
			}
			if(flag!=1)
			{
				System.out.println(" No record found with entered details ");
			}
			else
			{
				System.out.println(" Name of Author   : "+ A[i].getName());
				System.out.println(" Email of Author  : "+ A[i].getEmail());
				System.out.println(" Gender of Author : "+ A[i].getEmail());
			}
		}
		else if( ch == 4)
		{
			System.out.println(" Enter Name of Book to Display Details ");
			bname = in.next();
			for(i=0;i<bcount;b++)
			{
				if(B[i].getName().equals(bname))
				{
					flag = 1;
					break;
				}
			}
			if(flag!=0)
			{
				System.out.println(" No record found with entered details ");
			}
			else 
			{
				System.out.println(" Name of Book      : "+ B[i].getName());
				System.out.println(" Name of Author    : "+ B[i].author.getName());
				System.out.println(" Price of Book     : "+ B[i].getPrice());
				System.out.println(" Quantity of Book  : "+ B[i].getQty());
			}
		}
		else if( ch == 5)
		{
			System.out.println(" Enter name of Author to Display Details ");
			aname = in.next();
			for(i=0;i<acount;i++)
			{
				if(A[i].getName().equals(aname))
				{
					flag = 1;
					break;
				}
			}
			if(flag!=1)
			{
				System.out.println(" No record found with entered details ");
			}
			else
			{
				System.out.println(" Enter new email ");
				email = in.next();
				A[i].setEmail(email);
				System.out.println(" Email changed !");
			}
		}
		else if(ch == 6)
		{
			System.out.println(" Enter Name of Book to Display Details ");
			bname = in.next();
			for(i=0;i<bcount;b++)
			{
				if(B[i].getName().equals(bname))
				{
					flag = 1;
					break;
				}
			}
			if(flag!=0)
			{
				System.out.println(" No record found with entered details ");
			}
			else
			{
				System.out.println(" Modify ");
				System.out.println(" 1. Price ");
				System.out.println(" 2. Quantity ");
				ch = in.nextInt();
				if(ch == 1)
				{
					System.out.println(" Enter New Price ");
					price = in.nextDouble();
					setPrice(price);
				}
				else if(ch == 2)
				{
					System.out.println(" Enter New quantity ");
					qty = in.nextInt();
					setQty(qty);
				}
			}
		}
		System.out.println(" Do you want to run again ( 1. Yes / 2. No )");
		ch = in.nextInt();
		}while(ch==1);
	}
}


