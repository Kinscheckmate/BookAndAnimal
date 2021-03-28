public class BookListing {

    private Book book;
    private double cost;

    public BookListing(Book b, double c)
    {
        cost = c;
        book = b;
    }
    public void printDescription()
    {
        book.printBookInfo();
        System.out.print(", $" + cost);
    }
}
