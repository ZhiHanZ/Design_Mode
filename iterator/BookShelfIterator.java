package iterator;

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;
	public BookShelfIterator(BookShelf bookShelf) {
		// TODO Auto-generated constructor stub
		this.bookShelf = bookShelf;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		return (index < bookShelf.getSize())? true: false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Book book = bookShelf.getBookAt(index);
		index += 1;
		return book;
	}

}
