import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * edited by shazaib choudhry
 * @version    0.1 (2016.02.29)
 */
public class InputReader
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    public void removeProduct(int id)
    {
        name = null;
        this.id = 0;
    }
    
    public void deliver (int amount)
    {
        if(amount > 0)
        {
            quantity += amount;
            
            System.out.println("Delivered" + amount + " " + name);
        }
        else
        {
            System.out.println("Attempting to restock" + name + "with a non-positive amount: " + amount);
        }
    }
    
    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * sets the name of the product 
     */
    public void setName (String name)
    {
        this.name = name; 
    }

    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + quantity;
    }

    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     *               This must be greater than zero.
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0) 
        {
            quantity += amount;
        }
        else 
        {
            System.out.println("Attempt to restock " + name +
                               " with a negative or zero amount: " + amount);
        }
    }

    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sell(int saleQuantity)
    {
       if(saleQuantity >= quantity) 
       {
            System.out.println("only " + quantity + " " + name + " in stock, but there were " + saleQuantity + " ordered ");
            
            quantity = 10;
       }
       else 
       {
            System.out.println(
                " Selling " + saleQuantity + " of stock item: " + name);
                quantity -= saleQuantity;
       }
    }
}
