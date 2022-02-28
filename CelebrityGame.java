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
    private Celebrity currentCeleb;
  
	/**
	 * The ArrayList of Celebrity values that make up the game
	 */
    private ArrayList<Celebrity> allCelebs;
  
  /**
   * Scanner to get input from users
   */
    private Scanner scanner;
  /**
   * To keep score of correct guesses
   */
    private int points;
  
  // constructor
	public CelebrityGame()
	{
    allCelebs = new ArrayList<Celebrity>();
    currentCeleb = null;
    scanner = new Scanner(System.in);
    points = 0;
	}

	/**
	 * Prepares the game by initializing the celebrities list.
	 */
	public void prepareGame()
	{
    int numOfCelebs = 0;
    do
      {
        String message = "Player 1, please input Celebrity names and hints.";
        printMessage(message);
        message = "Type the celebrity name: ";
        printMessage(message);
        String name = scanner.nextLine();
          
        if (!validateCelebrity(name))
        {
          System.out.println("Name is too short");
          while (!validateCelebrity(name))
          {
             printMessage(message);
             name = scanner.nextLine(); 
          }
        }
        message = "Type hint for celebrity: ";
        printMessage(message);
        String hint = scanner.nextLine();
        if (!validateClue(hint,""))
        {
          System.out.println("Hint is too short");
          while (!validateClue(hint,""))
          {
             printMessage(message);
             hint = scanner.nextLine(); 
          }
        }
        addCelebrity(name,hint);
        numOfCelebs++;
      } 
      while(numOfCelebs < 5);
      //System.out.println(allCelebs);
      play();
      restart();
	}

	/**
	 * Determines if the supplied guess is correct.
	 * 
	 * @param guess
	 *            The supplied String
	 * @return Whether it matches regardless of case or extraneous external
	 *         spaces.
	 */

  /** Index used in for loop to get celebrity **/
	public boolean processGuess(String guess, int index)
	{
    if (guess.equals(allCelebs.get(index).getName())){
      System.out.println("That is Correct!");
      points++;
      System.out.println(points);
      return true;
    }
    System.out.println("Incorrect");
		return false;
	}

	/**
	 * Asserts that the list is initialized and contains at least one Celebrity.
	 * Sets the current celebrity as the first item in the list. Opens the game
	 * play screen.
	 */
	public void play()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    for (int i = 0; i < allCelebs.size(); i++)
    {   
      System.out.println("Guess the celebrity based on this hint:");
      System.out.println(allCelebs.get(i).getHint());
    processGuess(scanner.nextLine(),i);
    }
    
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
	public void addCelebrity(String name, String guess /**String type**/)
	{
		allCelebs.add(new Celebrity(name,guess));
	}

	/**
	 * Validates the name of the celebrity. It must have at least 4 characters.
	 * @param name The name of the Celebrity
	 * @return If the supplied Celebrity is valid
	 */
	public boolean validateCelebrity(String name)
	{
    name = name.trim();
    if (name.length() >= 4)
    {
      return true;
    }
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
    clue = clue.trim();
    if (clue.length() >= 10)
    {
      return true;
    }
		return false;
	}

  /**
   * Method to get input from user from console.
   */
  public void getUserInput()
  {
    String guess = scanner.nextLine();
  }

  /**
   * Method to display message to user to console.
   */
  public void printMessage(String message)
  {
    System.out.println(message);
  }

  public void restart()
  {
    System.out.println("Do you want to play again?");
    if(scanner.nextLine().equals("yes")){
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      prepareGame();
    }
    else{
      System.out.println("Thanks for playing");
    }
  }
}