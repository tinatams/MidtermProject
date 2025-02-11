/**
	Player class that has fields of name and health points. Has the method takeDamage, which makes the player take damage
	
	@author Martina Amale M. Llamas (242648); INSERT ZOE INFO
	@version February 11, 2025
	
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


public class Player {
    private int healthPoints;
    private String name;


    /** 
    Constructor method, that takes in a String parameter called name. 
    this is then assigned to the classes field, 
    healthPoints are instanciated at 100. 
    **/
    public Player(String name){
        this.name = name;
        healthPoints = 100; //temporary number
    }

    /** 
    Constructor method, that takes in a String parameter called name. 
    this is then assigned to the classes field, 
    healthPoints are instanciated at 100. 
    **/
    public void takeDamage(int amount){
        healthPoints -= amount; 
    }

}