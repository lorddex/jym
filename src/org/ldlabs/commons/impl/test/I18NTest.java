package org.ldlabs.commons.impl.test;

import org.junit.Assert;
import org.junit.Test;
import org.ldlabs.commons.I18N;

/**
 * 
 * @author Francesco Apollonio
 *
 */
public class I18NTest {

	/**
	 * Test the I18N. 
	 */
	@Test
	public void testGetString() {
		
		String string = I18N.getString("test1");
		
		Assert.assertEquals("test1", string);
	}

}
