package iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
	private ArrayList<Book> bookShelf;
	private int index = 0; //实际书本的长度
	public BookShelf() {
		// TODO Auto-generated constructor stub
		bookShelf = new ArrayList<>();
		index = 0;
	}
	//getBookAt
	public Book getBookAt(int ind)
	{
		assert ind < bookShelf.size();
		return bookShelf.get(ind);
	}
	//appendBook
	public void appendBook(Book book)
	{
		bookShelf.add(book);
		index += 1;
	}
	public int getSize() {
		return index;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}

}
