package org.ldlabs.jym.maze.impl;

import org.ldlabs.jym.maze.RoomInterface;

/**
 * A door that requires a word to be open.
 * 
 * @author Francesco Apollonio
 *
 */
public class DoorNeedingWord extends Door {

	/**
	 * The secret word to open the door.
	 */
	private String word = null;
	
	/**
	 *  The constructor for DoorNeedingSpell.
	 * 
	 * @param firstRoom The first room.
	 * @param secondRoom The second room.
	 */
	private DoorNeedingWord(RoomInterface firstRoom, RoomInterface secondRoom)
	{
		super(firstRoom, secondRoom);
	}
	
	/**
	 * The constructor for DoorNeedingSpell.
	 * 
	 * @param firstRoom The first room.
	 * @param secondRoom The second room.
	 * @param word the secret word.
	 */
	public DoorNeedingWord(RoomInterface firstRoom, RoomInterface secondRoom, String word) {
		super(firstRoom, secondRoom);
		this.word = word;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void openTheDoor()
	{
		System.out.println("The door doesn't unlock. It requires a secret word.");
	}
	
	/**
	 * The method to open the door with the secretWord.
	 * 
	 * @param secretWord The secretWord.
	 */
	public void openTheDoor(String secretWord)
	{
		if (secretWord.equals(this.word))
		{
			super.openTheDoor();
		}
	}
	
}
