
/**
 * The Course Title and Course Number 
 *
 * @author Shazaib Choudhry 
 * @version (1)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String courseNumber;
    private String courseTitle;
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseNumber,String courseTitle)
    {
        // initialise instance variables
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
    }

    /**
     * Print out and returns a students course number and course title 
     */
    public void printCourse()
    {
        // put your code here
        System.out.println("Course Number:" + courseNumber);
        System.out.println("Course Title:" + courseTitle);
    }
}
