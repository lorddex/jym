package org.ldlabs.jym.maze;

import org.ldlabs.jym.maze.shared.MazeException;

/**
 * This interface represent a collection of objects that implement {@link RoomInterface}.
 * 
 * @author Francesco Apollonio
 *
 */
public interface MazeInterface {

	/**
	 * Adds a Room to the maze.
	 * 
	 * @param room The Room that has to be added to the maze.
	 */
	public void addRoom(RoomInterface room);
	
	/**
	 * Gets the room from the maze identified by the {@code roomNo}.
	 * 
	 * @param roomNo The number of the Room that is requested.
	 *
	 * @param <T> Any implementation of the RoomInterface.
	 * 
	 * @throws MazeException if the searched roomNo is not part of the Maze.
	 * 
	 * @return The requested Room.
	 */
	public <T extends RoomInterface> T getRoomByNo(int roomNo) throws MazeException;
	
}
