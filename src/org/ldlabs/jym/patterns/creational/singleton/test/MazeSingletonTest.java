package org.ldlabs.jym.patterns.creational.singleton.test;

import org.junit.Assert;
import org.junit.Test;
import org.ldlabs.jym.maze.impl.Door;
import org.ldlabs.jym.maze.impl.DoorNeedingWord;
import org.ldlabs.jym.maze.impl.Maze;
import org.ldlabs.jym.maze.shared.Direction;
import org.ldlabs.jym.maze.shared.MazeException;
import org.ldlabs.jym.patterns.creational.abstractfactory.MazeFactoryInterface;
import org.ldlabs.jym.patterns.creational.singleton.MazeSingletonFactory;
import org.ldlabs.jym.patterns.shared.MazeType;

/**
 * JUnit to test the MazeFactory.
 * 
 * @author Francesco Apollonio
 *
 */
public class MazeSingletonTest {

	/**
	 * Test creation of two different {@link Maze} type, using a factory.
	 */
	@Test
	public void test() {
		
		Maze maze = null;
		MazeFactoryInterface mazeFactory = null;
		MazeFactoryInterface mazeFactory2 = null;
		
		try {
			mazeFactory = MazeSingletonFactory.getMazeFactory(MazeType.WITH_MAGIC_DOOR);
			maze = mazeFactory.createMaze();
			Assert.assertNotNull(maze);
			Assert.assertNotNull(maze.getRoomByNo(1));
			Assert.assertNotNull(maze.getRoomByNo(1).getSide(Direction.EAST));
			Assert.assertTrue(maze.getRoomByNo(1).getSide(Direction.EAST) instanceof DoorNeedingWord);
			mazeFactory2 = MazeSingletonFactory.getMazeFactory(MazeType.WITH_MAGIC_DOOR);
			Assert.assertTrue(mazeFactory == mazeFactory2);
		} catch (MazeException e) {
			Assert.fail("Exception catched: " + e.getMessage());
		}
		
		try {
			mazeFactory = MazeSingletonFactory.getMazeFactory(MazeType.WITHOUT_MAGIC_DOOR);
			maze = mazeFactory.createMaze();
			Assert.assertNotNull(maze);
			Assert.assertNotNull(maze.getRoomByNo(1));
			Assert.assertNotNull(maze.getRoomByNo(1).getSide(Direction.EAST));
			Assert.assertTrue(maze.getRoomByNo(1).getSide(Direction.EAST) instanceof Door);
			Assert.assertFalse(maze.getRoomByNo(1).getSide(Direction.EAST) instanceof DoorNeedingWord);
			mazeFactory2 = MazeSingletonFactory.getMazeFactory(MazeType.WITHOUT_MAGIC_DOOR);
			Assert.assertTrue(mazeFactory == mazeFactory2);
		} catch (MazeException e) {
			Assert.fail("Exception catched: " + e.getMessage());
		}
		
	}

}
