package org.ldlabs.jym.maze.impl.test;

import org.junit.Assert;
import org.junit.Test;
import org.ldlabs.jym.maze.impl.Maze;
import org.ldlabs.jym.maze.impl.MazeGame;

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
