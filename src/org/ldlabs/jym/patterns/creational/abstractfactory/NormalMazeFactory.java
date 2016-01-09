package org.ldlabs.jym.patterns.creational.abstractfactory;

import org.ldlabs.jym.maze.impl.Door;
import org.ldlabs.jym.maze.impl.Maze;
import org.ldlabs.jym.maze.impl.Room;
import org.ldlabs.jym.maze.impl.Wall;
import org.ldlabs.jym.maze.shared.Direction;

/**
 * Package protected Normal Maze Factory.
 * 
 * @author Francesco Apollonio
 *
 */
class NormalMazeFactory extends MazeFactory {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Maze createMaze() {
		Maze maze = new Maze();
		
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		
		Door door1 = new Door(room1, room2);
		
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
