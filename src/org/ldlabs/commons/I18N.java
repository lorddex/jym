package org.ldlabs.commons;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 * Interface to access I18N utility and methods.
 * 
 * @author Francesco Apollonio
 *
 */
public class I18N {

	/**
	 * This is the identifier that could be used into a string to indicate where a parameter must be used.
	 */
	private static final String PARAM_IDENTIFIER = "%s";

	/**
	 * TODO
	 */
	private static String RESOURCE_BUNDLE_NAME = "jsync";
	
	/**
	 * Gets the internationalized string searching it with its 
	 * identifier {@code name}.
	 * 
	 * @param name	The internationalized string identifier.
	 * @param params Optional parameters used to customize the internationalized string.
	 * 
	 * @return The internationalized string.
	 */
	public static String getString(String name, Object... params) {
		
//		if (resource == null)
//		{
		ResourceBundle resource = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, Locale.getDefault(), I18N.class.getClassLoader());
//		}
		
		String string = resource.getString(name);
		
		if (params != null)
		{
			for(Object parm: params)
			{
				if (!string.contains(PARAM_IDENTIFIER))
				{
					break;
				}
				string = string.replaceFirst(PARAM_IDENTIFIER, parm.toString());
			}
		}
		
		return string;
		
	}

}
