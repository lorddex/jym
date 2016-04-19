package org.ldlabs.jym.patterns.behavioral.chainofresponsibility;

/**
 * This is a single handler of a chain.
 * 
 * @author Francesco Apollonio
 *
 */
public interface ChainHandler {

	/**
	 * Method to access the next element of the chain.
	 * 
	 * @return The next element of a chain.
	 */
	public ChainHandler getNext();
	
	/**
	 * Method that handles the given request and calls the next
	 * handler when finished.
	 * 
	 * @param request The ChainRequest to handle.
	 */
	public void handleRequest(ChainRequest request);
	
}
