package org.ldlabs.jym.maze;

import org.ldlabs.jym.maze.shared.Direction;

/**
 * A Room defined the key relationships between components in the maze. 
 * It maintains references to other {@link MapSiteInterface} objects and stores
 * a {@code roomNumber} that identifies the room.
 * 
 * @author Francesco Apollonio
 * 
 *
 */
public interface RoomInterface extends MapSiteInterface {

	/**
	 * Returns the {@code roomNumber}.
	 * 
	 * @return The roomNumber.
	 */
	public Integer getRoomNumber();

	/**
	 * Gets the {@link MapSiteInterface} on the given {@link Direction}.
	 * 
	 * @param direction The direction of the {@link MapSiteInterface} that is required.
	 * 
	 * @return Them MapSite.
	 */
	public MapSiteInterface getSide(Direction direction);
	
	/**
	 * Sets the given {@code mapSite} on the given {@code direction}.
	 * 
	 * @param direction The direction.
	 * 
	 * @param mapSite The mapSite.
	 */
	public void setSide(Direction direction, MapSiteInterface mapSite);
	
}
