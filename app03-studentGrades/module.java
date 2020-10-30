
/**
 * Write a description of class module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class module
{
 private String title;
    
    
    private String codeNo;
    
    
    private int mark;
   
    

    /**
     * Constructor for objects of class Module
     */
    public void Module(String title, String codeNo)
    {
       this.title = title;
       this.codeNo = codeNo;
    }
    /**
     * This allows returns the value of mark allowing to be used in calculation methods
     */
    public int getMark()
    {
        return mark;
    }
    /**
    * This awards a valid mark, which does not let it go above 25 (the max per module)
    */
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 25))
    {
        this.mark = mark;
    }
    else
    {
         System.out.print("Invalid mark!!!");
    }
    }     
    /**
     * prints out the details of the course
     */
    public void print()
    {
        System.out.println("Module: " + codeNo + " " + title + " Mark = " + mark);
    }
}
