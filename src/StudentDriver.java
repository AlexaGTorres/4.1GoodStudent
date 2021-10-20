public class StudentDriver
{
    public static void main (String [] args)
    {
        GoodStudent turing = new GoodStudent();
        GoodStudent nightingale = new GoodStudent("Florance", "Nightingale", 182010, 3.89, false);
        GoodStudent hopper = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);

        //toString
        System.out.println(turing.toString());

        //Setters and Getters
        System.out.println (nightingale.toString() + "\n");
        nightingale.setID(95266);
        nightingale.setGPA(3.92);
        System.out.println("Florence ID: " + nightingale.getID() + ". Florence GPA: " + nightingale.getGpa());

        System.out.println (hopper.getFirstName() + hopper.getCSStudent());

        //CreateID
        
        //CSGPA
    }//ENd main class
}//End StudentDriver
