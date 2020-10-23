
/**
 * Write a description of class Ticket here.
 *
 * @Shazaib Choudhry
 * @ 22/10/2020
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private String destination;
    private int price;
    private String date;
    
    

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price, String date)
    {
        // initialise instance variables
        this.destination = destination;
        this.price = price;
        this.date = date;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getDestination()
    {
        return destination;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String getDate()
    {
        return date;
    }
}
