public class PictureBook extends Book{

    private String illustrator; //name

    public PictureBook(String t, String a, String i)
    {
        super(t, a);
        illustrator = i;
    }

    public void printBookInfo()
    {
        super.printBookInfo();
        System.out.print(" and illustrated by "+ illustrator);
    }
}
