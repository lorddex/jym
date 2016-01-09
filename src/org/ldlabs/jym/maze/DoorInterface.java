package org.ldlabs.jym.maze;

import org.ldlabs.jym.maze.shared.MazeException;

/**
 * A Door that interconnect two {@link RoomInterface}s.
 * 
 * @author Francesco Apollonio
 *
 */
public interface DoorInterface extends MapSiteInterface {
	
	/**
	 * Returns the other {@link RoomInterface} on the other side of the Door.
	 * 
	 * @param room The Room where who is coming is in.
	 * 
	 * @return a Room.
	 * @throws MazeException thrown if the given room is not one of the connected by this Door.
	 */
	public RoomInterface otherSideFrom(RoomInterface room) throws MazeException;
	
	/**
	 * To open the door.
	 */
	public void openTheDoor();
	
	/**
	 * To close the door.
	 */
	public void closeTheDoor();
}
