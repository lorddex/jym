package org.ldlabs.commons;

/**
 * When an error occurs while trying to access a resource.
 * 
 * @author Francesco Apollonio
 *
 */
public class AccessException extends Error {
	
	/**
	 * The generated serial version UID.
	 */
	private static final long serialVersionUID = 3143236279625825013L;

	/**
	 * Standard constructor.
	 */
	public AccessException()
	{
		super();
	}
	
	/**
	 * The constructor with a message.
	 * 
	 * @param message the message to set into the AccessException exception.
	 */
	public AccessException(String message)
	{
		super(message);
	}
	
	/**
	 * The constructor with a message.
	 * 
	 * @param cause The cause exception.
	 */
	public AccessException(Throwable cause)
	{
		super(cause);
	}
	
	/**
	 * The constructor with a message.
	 * 
	 * @param message the message to set into the AccessException exception.
	 * @param cause The cause exception.
	 */
	public AccessException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
