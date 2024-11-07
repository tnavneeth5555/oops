public class Calculation {
    /*
    It refers to the ability of object-oriented programming languages
    to differentiate between entities with the same name efficiently.

    Three sum methods below are different from each other
    */

    public int sum(int x, int y)
    {
        return (x + y);
    }

    // Overloaded sum().
    // This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }

    // Overloaded sum().
    // This sum takes two double parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }
}
