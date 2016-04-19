package org.ldlabs.commons.impl;

import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.ldlabs.commons.AccessException;
import org.ldlabs.commons.Configuration;

/**
 * Configuration implementation that works with a simple, text-based, preferences file.
 * 
 * @author Francesco Apollonio
 *
 */
public class FileConfiguration implements Configuration {

	
	/**
	 * The configuration object.
	 */
	private org.apache.commons.configuration2.Configuration configuration = null;

	/**
	 * The default constructor.
	 * 
	 * @param filename the name of the file that contains the preferences.
	 * @throws AccessException If an error occurs while trying to access the preferences file.
	 */
	public FileConfiguration(String filename) throws AccessException
	{
		initConfiguration(filename);
	}

	/**
	 * Initializes the configuration opening the config file.
	 * 
	 * @param filename the file name that contains the preferences.
	 * 
	 * @throws AccessException If an error occurs while trying to access the configuration.
	 */
	private void initConfiguration(String filename) throws AccessException {
		Parameters params = new Parameters();
		FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
		    new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
		    .configure(params.properties()
		        .setFileName(filename));
		try
		{
			configuration = builder.getConfiguration();
		    
		}
		catch(ConfigurationException cex)
		{
			throw new AccessException("Error while accessing the configuration.", cex);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getString(String propertyName) {
		return configuration.getString(propertyName);
	}

}
