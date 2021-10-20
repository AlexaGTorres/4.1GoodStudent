public class StudentDriver
{
    public static void main (String [] args)
    {
        GoodStudent turing = new GoodStudent();
        GoodStudent nightingale = new GoodStudent("Florance", "Nightingale", 182010, 3.89, false);
        GoodStudent hopper = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);

        //toString
        System.out.println(turing.toString());
        System.out.println(" ");

        System.out.println (nightingale.toString() + "\n");

        System.out.println (hopper.toString() + "\n");
        nightingale.setID(95266);
        nightingale.setGPA(3.92);
        System.out.println("Florence ID: " + nightingale.getID() + " Florence GPA: " + nightingale.getGpa());
        System.out.println (" ");

        System.out.println (hopper.getFirstName() + " " + hopper.getCSStudent());
        System.out.println (" ");

        //CreateID
        System.out.println ("Alan ID: " + turing.CreateID());
        System.out.println ("Florance ID: " + nightingale.CreateID());
        System.out.println ("Grace ID: " + hopper.CreateID());
        System.out.println (" ");

        //CSGPA
        System.out.println ("Alan CS Gpa: " + turing.csGPA());
        System.out.println ("Florance CS Gpa: " + nightingale.csGPA());
        System.out.println ("Grace CS Gpa: " + hopper.csGPA());
    }//ENd main class
}//End StudentDriver
