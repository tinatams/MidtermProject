/**
    Contains the main method of the program. Instantiates a SceneFrame object and calls
	the setUpGUI() method.
 
	@author Martina Amale M. Llamas (242648); Zoe Angeli G. Uy (246707)
	@version March 3, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

public class SceneStarter{
    static SceneFrame a;
	/**
        Instantiates a new SceneFrame object, and calls setUpGUI() method
    **/
    public static void main(String[] args) throws Exception{
        a = new SceneFrame();
        a.setUpGUI();
    }
}