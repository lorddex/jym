package org.ldlabs.jym.patterns.creational.abstractfactory;

import org.ldlabs.jym.maze.impl.Maze;

/**
 * Interface that must be implemented by the different Maze builders.
 * @author Francesco Apollonio
 *
 */
public interface MazeFactoryInterface {

	/**
	 * Creates a new Maze selecting the type using the {@code type} parameter.
	 * 
	 * @return The created Maze.
	 * 
	 */
	public abstract Maze createMaze();
	
}
