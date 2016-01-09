package org.ldlabs.jym.patterns.maze.impl;

import org.ldlabs.jym.patterns.maze.DoorInterface;
import org.ldlabs.jym.patterns.maze.RoomInterface;
import org.ldlabs.jym.patterns.maze.shared.MazeException;

/**
 * An implementation of the {@link DoorInterface} interface.
 * 
 * @author Francesco Apollonio
 *
 */
public class Door implements DoorInterface {

	/**
	 * The first room connected by the Door.
	 */
	private RoomInterface firstRoom = null;
	
	/**
	 * The second room connected by the Door.
	 */
	private RoomInterface secondRoom = null;
	
	/**
	 * If the door is open or not (DEFAULT: closed).
	 */
	Boolean isOpen = Boolean.FALSE;
	
	/**
	 * A constructor for a Door with the two RoomInterfaces.
	 * @param firstRoom the firstRoom.
	 * @param secondRoom the secondRoom.
	 */
	public Door(RoomInterface firstRoom, RoomInterface secondRoom)
	{
		this.firstRoom = firstRoom;
		this.secondRoom = secondRoom;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomInterface otherSideFrom(RoomInterface room) throws MazeException {
		
		if (room.getRoomNumber().equals(firstRoom.getRoomNumber()))
		{
			return secondRoom;
		}
		else if (room.getRoomNumber().equals(secondRoom.getRoomNumber()))
		{
			return firstRoom;
		}
		else
		{
			throw new MazeException("The Room is not bound by this door.");
		}
		
	}

	/**
	 * @return the firstRoom
	 */
	public RoomInterface getFirstRoom() {
		return firstRoom;
	}

	/**
	 * @param firstRoom the firstRoom to set
	 */
	public void setFirstRoom(RoomInterface firstRoom) {
		this.firstRoom = firstRoom;
	}

	/**
	 * @return the secondRoom
	 */
	public RoomInterface getSecondRoom() {
		return secondRoom;
	}

	/**
	 * @param secondRoom the secondRoom to set
	 */
	public void setSecondRoom(RoomInterface secondRoom) {
		this.secondRoom = secondRoom;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}

}
