package org.ldlabs.commons.impl.test;

import org.junit.Assert;
import org.junit.Test;
import org.ldlabs.commons.AccessException;
import org.ldlabs.commons.Configuration;
import org.ldlabs.commons.impl.FileConfiguration;

/**
 * 
 * @author Francesco Apollonio
 *
 */
public class ConfigurationTest {

	/**
	 * Test the loading of the preferences.
	 */
	@Test
	public void testConstructor() {
		try {
			new FileConfiguration("test.txt");
		} catch (AccessException e) {
			Assert.assertTrue("Exception catched: " + e.getMessage(), true);
		}
		
	}
	
	/**
	 * Test the getString.
	 */
	@Test
	public void testGetString() {
		Configuration config = null;
		try {
			config = new FileConfiguration("test_properties.txt");
		} catch (AccessException e) {
			Assert.fail("Exception catched: " + e.getMessage());
		}
		String number = config.getString("test.preference.number");
		String string = config.getString("test.preference.string");
		
		Assert.assertNotNull(number);
		Assert.assertNotNull(string);
		Assert.assertEquals("1", number);
		Assert.assertEquals("ABC", string);
	}

}
