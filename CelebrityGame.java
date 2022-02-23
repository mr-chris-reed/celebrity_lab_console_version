import java.util.ArrayList;
import java.util.Scanner;

/**
 * The framework for the Celebrity Game project
 * 
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
	/**
	 * A reference to a Celebrity or subclass instance.
	 */

	/**
	 * The ArrayList of Celebrity values that make up the game
	 */

  /**
   * Scanner to get input from users
   */

  /**
   * To keep score of correct guesses
   */

  // constructor
	public CelebrityGame()
	{
	}

	/**
	 * Prepares the game by initializing the celebrities list.
	 */
	public void prepareGame()
	{
	}

	/**
	 * Determines if the supplied guess is correct.
	 * 
	 * @param guess
	 *            The supplied String
	 * @return Whether it matches regardless of case or extraneous external
	 *         spaces.
	 */
	public boolean processGuess(String guess)
	{
		return false;
	}

	/**
	 * Asserts that the list is initialized and contains at least one Celebrity.
	 * Sets the current celebrity as the first item in the list. Opens the game
	 * play screen.
	 */
	public void play()
	{
		
	}

	/**
	 * Adds a Celebrity of specified type to the game list
	 * 
	 * @param name
	 *            The name of the celebrity
	 * @param guess
	 *            The clue(s) for the celebrity
	 * @param type
	 *            What type of celebrity
	 */
	public void addCelebrity(String name, String guess, String type)
	{
		
	}

	/**
	 * Validates the name of the celebrity. It must have at least 4 characters.
	 * @param name The name of the Celebrity
	 * @return If the supplied Celebrity is valid
	 */
	public boolean validateCelebrity(String name)
	{
		return false;
	}

	/**
	 * Checks that the supplied clue has at least 10 characters or is a series of clues
	 * This method would be expanded based on your subclass of Celebrity.
	 * @param clue The text of the clue(s)
	 * @param type Supports a subclass of Celebrity 
	 * @return If the clue is valid.
	 */
	public boolean validateClue(String clue, String type)
	{
		return false;
	}

  /**
   * Method to get input from user from console.
   */
  public void getUserInput()
  {
    
  }

  /**
   * Method to display message to user to console.
   */
  public void printMessage(String message)
  {
    
  }
}