package com.sp.tech.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sp.tech.model.Author;

public class AuthorValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Author.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
	   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name","required.Name", "Name is required!");	
		Author author =(Author)target;
	}

}
