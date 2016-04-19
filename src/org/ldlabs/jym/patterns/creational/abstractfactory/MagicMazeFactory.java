package org.ldlabs.jym.patterns.creational.abstractfactory;

import org.ldlabs.jym.maze.impl.DoorNeedingWord;
import org.ldlabs.jym.maze.impl.Maze;
import org.ldlabs.jym.maze.impl.Room;
import org.ldlabs.jym.maze.impl.Wall;
import org.ldlabs.jym.maze.shared.Direction;

/**
 * Package protected Magic maze factory.
 * 
 * @author Francesco Apollonio
 *
 */
class MagicMazeFactory implements MazeFactoryInterface {

	/**
	 * Package protected constructor.
	 */
	MagicMazeFactory()
	{
		super();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Maze createMaze() {
		Maze maze = new Maze();
		
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		
		DoorNeedingWord door1 = new DoorNeedingWord(room1, room2, "abracadabra");
		
		maze.addRoom(room1);
		maze.addRoom(room2);
		
		room1.setSide(Direction.NORTH, new Wall());
		room1.setSide(Direction.EAST, door1);
		room1.setSide(Direction.SOUTH, new Wall());
		room1.setSide(Direction.WEST, new Wall());
		
		room2.setSide(Direction.NORTH, new Wall());
		room2.setSide(Direction.EAST, new Wall());
		room2.setSide(Direction.SOUTH, new Wall());
		room2.setSide(Direction.WEST, door1);
		
		return maze;
	}

}
