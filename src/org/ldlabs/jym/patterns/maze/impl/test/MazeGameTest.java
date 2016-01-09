package org.ldlabs.jym.patterns.maze.impl.test;

import org.junit.Assert;
import org.junit.Test;
import org.ldlabs.jym.patterns.maze.impl.Maze;
import org.ldlabs.jym.patterns.maze.impl.MazeGame;

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
