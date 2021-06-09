package util;

import org.apache.commons.validator.routines.EmailValidator;

public class HelperClass {
	
public static boolean validEmail(String emailId){
	if (EmailValidator.getInstance().isValid(emailId))
		return true;
	else
		return false;

}

}
