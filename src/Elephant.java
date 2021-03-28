public class Elephant extends Herbivore {

    private double tusklength;

    public Elephant(String n, double l)
    {
        super("elephant", n);
        tusklength = l;
    }
    public String toString()
    {
        return super.toString() + " with tusks "+ tusklength + " meters long";
    }
}
