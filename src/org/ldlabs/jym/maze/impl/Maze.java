package org.ldlabs.jym.maze.impl;

import java.util.ArrayList;
import java.util.List;

import org.ldlabs.jym.maze.MazeInterface;
import org.ldlabs.jym.maze.RoomInterface;
import org.ldlabs.jym.maze.shared.MazeException;

/**
 * An implementation of the {@link MazeInterface}.
 * 
 * @author Francesco Apollonio
 *
 */
public class Maze implements MazeInterface {

	/**
	 * The rooms of the Maze.
	 */
	private List<RoomInterface> rooms = null;
	
	/**
	 * Construct a new Maze.
	 */
	public Maze()
	{
		rooms = new ArrayList<>();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addRoom(RoomInterface room) {
	
		this.rooms.add(room);
		
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T extends RoomInterface> T getRoomByNo(
			int roomNo) throws MazeException {
		
		
		for (RoomInterface room : this.rooms)
		{
			if (room.getRoomNumber().equals(roomNo))
			{
				return (T) room;
			}
		}
		
		throw new MazeException("The Room is not part of this Maze.");
		
	}

}
