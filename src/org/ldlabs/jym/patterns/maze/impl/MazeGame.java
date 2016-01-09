package org.ldlabs.jym.patterns.maze.impl;

import org.ldlabs.jym.patterns.maze.shared.Direction;

/**
 * Creates a Maze.
 *
 * @author Francesco Apollonio
 *
 */
public class MazeGame {

	/**
	 * Return a Maze of two Rooms.
	 * 
	 * @return a new Maze.
	 * 
	 */
	public Maze createMaze()
	{
		
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
