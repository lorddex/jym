package org.ldlabs.jym.patterns.creational.abstractfactory;

import org.ldlabs.jym.maze.impl.Maze;
import org.ldlabs.jym.maze.shared.MazeException;
import org.ldlabs.jym.patterns.shared.MazeType;

/**
 * Implementation of the AbstractFactory pattern for the Maze.
 * 
 * @author Francesco Apollonio
 *
 */
public abstract class MazeFactory {
	
	/**
	 * Creates a new Maze selecting the type using the {@code type} parameter.
	 * 
	 * @return The created Maze.
	 * 
	 */
	public abstract Maze createMaze();
	
	/**
	 * Creates a new MazeFactory of the type specified with the parameter {@code type}.
	 * 
	 * @param type The type of Maze.
	 * 
	 * @return a Factory of the Maze type.
	 * 
	 * @throws MazeException If the type is not valid.
	 */
	public static MazeFactory getMazeFactory(MazeType type) throws MazeException {
		
		if (type.equals(MazeType.WITH_MAGIC_DOOR))
		{
			return new MagicMazeFactory();
		}
		else if (type.equals(MazeType.WITHOUT_MAGIC_DOOR))
		{
			return new NormalMazeFactory();
		}
		
		throw new MazeException("Invalid Maze Type.");
			
	}

}
