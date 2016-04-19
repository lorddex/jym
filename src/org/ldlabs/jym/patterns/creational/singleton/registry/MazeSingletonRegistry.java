package org.ldlabs.jym.patterns.creational.singleton.registry;

import org.ldlabs.jym.maze.shared.MazeException;
import org.ldlabs.jym.patterns.creational.abstractfactory.MazeFactoryInterface;

/**
 * Interface that describes a Registry of Maze.<br>
 * 
 * This is a special Singleton implementation that can be used to allow an easy extension of the elements managed by the Singleton.
 * 
 * @author Francesco Apollonio
 *
 */
public interface MazeSingletonRegistry {

	/**
	 * Method used to register a new MazeFactoryInterface, binding it with a String {@code name}.
	 * 
	 * @param name	The name used to identify te MazeFactoryInterface.
	 * 
	 * @param factory The factory to bind with the name.
	 */
	public void register(String name, MazeFactoryInterface factory);
	
	/**
	 * Methods used to lookup a MazeFactoryInterface using the given {@code name}.
	 * 
	 * @param name	The name used for the registration of the factory.
	 * 
	 * @return A {@link MazeFactoryInterface} bound with the name.
	 * 
	 * @throws MazeException If an error occurs during the lookup (e.g. name not found, ...).
	 */
	public MazeFactoryInterface lookup(String name) throws MazeException;
	
}
