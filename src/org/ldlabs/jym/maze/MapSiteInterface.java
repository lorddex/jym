package org.ldlabs.jym.maze;

/**
 * It is the common interface for all the components of the maze.
 * 
 * @author Francesco Apollonio
 *
 */
public interface MapSiteInterface {
	
	/**
	 * Operation to enter into the current site.
	 * 
	 * @param siteFrom the place where the movement starts from.
	 */
	public void enter(MapSiteInterface siteFrom);

}
