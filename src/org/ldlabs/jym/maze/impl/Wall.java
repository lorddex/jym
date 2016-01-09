package org.ldlabs.jym.maze.impl;

import org.ldlabs.jym.maze.MapSiteInterface;
import org.ldlabs.jym.maze.WallInterface;

/**
 * An implementation of the {@link WallInterface} interface.
 * 
 * @author Francesco Apollonio
 *
 */
public class Wall implements WallInterface {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void enter(MapSiteInterface siteFrom) {
		
		System.out.println("You slam your nose on a wall.");
		
	}


}
