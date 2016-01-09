package org.ldlabs.jym.patterns.creational.abstractfactory;


/**
 * Enum used to switch from a Maze with {@link org.ldlabs.jym.maze.impl.DoorNeedingWord} and {@link org.ldlabs.jym.maze.impl.Door}.
 * 
 * @author Francesco Apollonio
 *
 */
public enum MazeType {
	
	/**
	 * Maze with Magic Doors.
	 */
	WITH_MAGIC_DOOR,
	
	/**
	 * Maze without Magic Doors.
	 */
	WITHOUT_MAGIC_DOOR

}
