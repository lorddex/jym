package org.ldlabs.jym.maze.shared;

/**
 * Exception thrown if an error occurs during the Maze exploration.
 * 
 * @author Francesco Apollonio
 *
 */
public class MazeException extends Exception {

	/**
	 * The generated Serial Version UID.
	 */
	private static final long serialVersionUID = -6533613426826702768L;
	
	/**
	 * A constructor with a message.
	 * 
	 * @param message the message.
	 */
	public MazeException(String message)
	{
		super(message);
	}

}
