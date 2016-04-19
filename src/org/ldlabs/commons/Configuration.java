package org.ldlabs.commons;

/**
 * The Configuration interface to access configuration preferences.
 * 
 * @author Francesco Apollonio
 *
 */
public interface Configuration {
	
	/**
	 * Returns the property value if found.
	 * 
	 * @param propertyName The property name to get from the property file.
	 * @return The String value of the property.
	 */
	public String getString(String propertyName);

}
