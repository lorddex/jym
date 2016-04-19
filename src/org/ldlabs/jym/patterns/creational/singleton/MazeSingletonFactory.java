package org.ldlabs.jym.patterns.creational.singleton;

import org.ldlabs.jym.maze.impl.Maze;
import org.ldlabs.jym.maze.shared.MazeException;
import org.ldlabs.jym.patterns.creational.abstractfactory.MazeFactoryInterface;
import org.ldlabs.jym.patterns.shared.MazeType;

/**
 * Implementation of the Singleton pattern for the Maze.
 * 
 * @author Francesco Apollonio
 *
 */
public abstract class MazeSingletonFactory {
	
	/**
	 * A reference to the already initialized NormalMazeFactory.
	 */
	private static NormalMazeSingletonFactory normalFactoryInstance = null;
	
	/**
	 * A reference to the already initialized MagicMazeFactory.
	 */
	private static MagicMazeSingletonFactory magicFactoryInstance = null;
	
	/**
	 * Default Protected Constructor.
	 */
	protected MazeSingletonFactory() {
		super();
	};
	
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
	public static MazeFactoryInterface getMazeFactory(MazeType type) throws MazeException {
		
		if (type.equals(MazeType.WITH_MAGIC_DOOR))
		{
			if (magicFactoryInstance == null)
			{
				synchronized (MazeSingletonFactory.class)
				{
					magicFactoryInstance = new MagicMazeSingletonFactory();
				}
			}
			return magicFactoryInstance;
		}
		else if (type.equals(MazeType.WITHOUT_MAGIC_DOOR))
		{
			if (normalFactoryInstance == null)
			{
				synchronized (MazeSingletonFactory.class)
				{
					normalFactoryInstance = new NormalMazeSingletonFactory();
				}
			}
			return normalFactoryInstance;
		}
		else
		{
			throw new MazeException("Invalid Maze Type.");
		}
		
			
	}

}
