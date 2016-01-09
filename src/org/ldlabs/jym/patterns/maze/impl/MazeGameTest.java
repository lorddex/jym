package org.ldlabs.jym.patterns.maze.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test unit for MazeGame.
 * 
 * @author Francesco Apollonio
 *
 */
public class MazeGameTest {

	/**
	 * Tests the createMaze method.
	 */
	@Test
	public void testCreateMaze() {
		MazeGame mazeGame = new MazeGame();
		Maze maze = mazeGame.createMaze();
		Assert.assertNotNull(maze);
	}

}
