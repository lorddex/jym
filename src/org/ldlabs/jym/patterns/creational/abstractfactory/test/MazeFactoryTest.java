package org.ldlabs.jym.patterns.creational.abstractfactory.test;

import org.junit.Assert;
import org.junit.Test;
import org.ldlabs.jym.maze.impl.Door;
import org.ldlabs.jym.maze.impl.DoorNeedingWord;
import org.ldlabs.jym.maze.impl.Maze;
import org.ldlabs.jym.maze.shared.Direction;
import org.ldlabs.jym.maze.shared.MazeException;
import org.ldlabs.jym.patterns.creational.abstractfactory.MazeFactory;
import org.ldlabs.jym.patterns.shared.MazeType;

/**
 * JUnit to test the MazeFactory.
 * 
 * @author Francesco Apollonio
 *
 */
public class MazeFactoryTest {

	/**
	 * Test creation of two different {@link Maze} type, using a factory.
	 */
	@Test
	public void test() {
		
		Maze maze = null;
		
		try {
			maze = MazeFactory.getMazeFactory(MazeType.WITH_MAGIC_DOOR).createMaze();
			Assert.assertNotNull(maze);
			Assert.assertNotNull(maze.getRoomByNo(1));
			Assert.assertNotNull(maze.getRoomByNo(1).getSide(Direction.EAST));
			Assert.assertTrue(maze.getRoomByNo(1).getSide(Direction.EAST) instanceof DoorNeedingWord);
		} catch (MazeException e) {
			Assert.fail("Exception catched: " + e.getMessage());
		}
		
		try {
			maze = MazeFactory.getMazeFactory(MazeType.WITHOUT_MAGIC_DOOR).createMaze();
			Assert.assertNotNull(maze);
			Assert.assertNotNull(maze.getRoomByNo(1));
			Assert.assertNotNull(maze.getRoomByNo(1).getSide(Direction.EAST));
			Assert.assertTrue(maze.getRoomByNo(1).getSide(Direction.EAST) instanceof Door);
			Assert.assertFalse(maze.getRoomByNo(1).getSide(Direction.EAST) instanceof DoorNeedingWord);
		} catch (MazeException e) {
			Assert.fail("Exception catched: " + e.getMessage());
		}
		
	}

}
