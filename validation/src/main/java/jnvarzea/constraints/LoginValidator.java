package jnvarzea.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created on 03/02/17.
 */
public class LoginValidator implements ConstraintValidator<Login, String> {
    private final static int MIN = 2;
    private final static int MAX = 8;

    public void initialize(final Login login) {

    }

    public boolean isValid(String login, ConstraintValidatorContext constraintValidatorContext) {
        if (login==null) {
            return false;
        }

        if(login.length() < MIN){
            return false;
        }

        if(login.length() > MAX){
            return false;
        }

        return true;
    }
}
