package org.ldlabs.jym.maze.impl;

import java.util.HashMap;
import java.util.Map;

import org.ldlabs.jym.maze.MapSiteInterface;
import org.ldlabs.jym.maze.RoomInterface;
import org.ldlabs.jym.maze.shared.Direction;

/**
 * A Room defined the key relationships between components in the maze. 
 * It maintains references to other {@link MapSiteInterface} objects and stores
 * a {@code roomNumber} that identifies the room.
 * 
 * @author Francesco Apollonio
 *
 */
public class Room implements RoomInterface {

	/**
	 * Identifier of the room.
	 */
	private Integer roomNumber = null;
	
	/**
	 * The sides of the Room.
	 */
	private Map<Direction, MapSiteInterface> sides;
	
	/**
	 * Construct a new Room identified by the {@code roomNo}.
	 * 
	 * @param roomNo The identifier of the Room.
	 * 
	 */
	public Room(int roomNo)
	{
		this.roomNumber = roomNo;
		this.sides = new HashMap<Direction, MapSiteInterface>();
	}
	
	/**
	 * Returns the {@code roomNumber}.
	 * 
	 * @return The roomNumber.
	 */
	public Integer getRoomNumber() {
		return roomNumber;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapSiteInterface getSide(Direction direction) {
		
		return sides.get(direction);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setSide(Direction direction,
			MapSiteInterface mapSite) {
		
		sides.put(direction, mapSite);
		
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void enter(MapSiteInterface siteFrom) {
		
		System.out.println("Entering the room " + this.roomNumber);
		
	}

}
