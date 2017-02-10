package jnvarzea.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created on 10/02/17.
 */
public class LastNameValidator implements ConstraintValidator<LastName, String> {
    private final static int MIN = 2;
    private final static int MAX = 12;

    public void initialize(final LastName lastName) {

    }

    public boolean isValid(String lastName, ConstraintValidatorContext constraintValidatorContext) {
        if (lastName==null) {
            return false;
        }

        if(lastName.length() < MIN){
            return false;
        }

        if(lastName.length() > MAX){
            return false;
        }

        return true;
    }
}
