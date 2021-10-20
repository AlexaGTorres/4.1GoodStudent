import java.text.DecimalFormat;

public class GoodStudent
{
    //1) Instance variables
    private String firstName;
    private String lastName;
    private int id;
    private double gpa;
    private boolean csStudent;

    //2) Constructors
    public GoodStudent (String newFirstName, String newLastName, int newID, double newGPA, boolean newCSStudent)
    {
        firstName = newFirstName;
        lastName = newLastName;
        id = newID;
        gpa = newGPA;
        csStudent = newCSStudent;
    }//End GoodStudent constructor

    public GoodStudent (String newFirstName, String newLastName, boolean newCSStudent)
    {
        firstName = newFirstName;
        lastName = newLastName;
        csStudent = newCSStudent;
    }//End constructor

    public GoodStudent ()
    {
        firstName = "Unknown";
        lastName = "Unknown";
        id = 0;
        gpa = 0.0;
        csStudent = false;
    }//End default constructor

    //4) Getters
    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public int getID(){return id;}

    public double getGpa(){return gpa;}

    public boolean getCSStudent(){return csStudent;}

    //5) Setters
    public void setFirstName(String newFirstName){firstName = newFirstName;}

    public void setLastName(String newLastName){lastName = newLastName;}

    public void setID(int newID){id = newID;}

    public void setGPA(double newGpa){gpa = newGpa;}

    public void setCsStudent(boolean newCSStudent){csStudent = newCSStudent;}

    //6) Brain Methods
    private String CreateID()
    {
        String s = Integer.toString(id);
        return firstName.substring(0,1) + lastName + s.substring(s.length() - 3);
    }//End CreateID

    public String csGPA()
    {
        DecimalFormat df = new DecimalFormat("0.0");
        String dec = "";

        double result = 0.0;

        if (csStudent == true)
        {
            result = gpa * 1.15;
            dec = df.format(result);
        }
        else
        {
            dec = "Not CS Student";
        }
        return dec;
    }//End csGPA

    //7) toString
    public String toString()
    {
        String output = "First Name: " + firstName;
        output += "\nLast Name: " + lastName;
        output += "\nID: " + id;
        output += "\nGPA: " + gpa;
        output += "\nCS Student: " + csStudent;
        return output;
    }//End toString
}//End GoodStudent
