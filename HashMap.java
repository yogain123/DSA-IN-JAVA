import java.util.*;
import java.io.*;
class Book
{
	String bookName, authorName;
	public Book(String bookName, String authorName)
	{
		this.bookName = bookName;
		this.authorName = authorName;

	}
}

class check
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Book b1 = new Book("half girlfriend","chatan");
		Book b2 = new Book("full girlfriend","yogendra");

		HashMap<Integer,Book> hm = new HashMap<Integer,Book>();
		hm.put(1,b1);
		hm.put(2,b2);
		for(Map.Entry<Integer,Book> e : hm.entrySet())
		{
			int key = e.getKey();
			Book b = e.getValue();
			System.out.println(key+" "+b.bookName+" "+b.authorName);
		}
	}
}
