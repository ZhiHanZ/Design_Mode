package iterator;

public class IteratorTestor {

	public static void main(String[] args) {
		BookShelf booklist = new BookShelf();
		booklist.appendBook(new Book("Hamlet"));
		booklist.appendBook(new Book("CS229"));
		booklist.appendBook(new Book("jcz"));
		booklist.appendBook(new Book("¾Â²Ëºï×Ó"));
		Iterator iterator = booklist.iterator();
		while(iterator.hasNext())
		{
			Book candidate = (Book)iterator.next();
			System.out.println(candidate.getName() + " ");
		}
	}

}
