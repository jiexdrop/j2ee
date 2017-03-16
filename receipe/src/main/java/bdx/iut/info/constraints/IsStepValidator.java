package bdx.iut.info.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by jnvarzea on 08/03/17.
 */
public class IsStepValidator implements ConstraintValidator<isStep, String> {
    private final static int MIN = 5;
    private final static int MAX = 500;
    @Override
    public void initialize(isStep isStep) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s==null) {
            return false;
        }

        if(s.length() < MIN){
            return false;
        }

        if(s.length() > MAX){
            return false;
        }

        return true;
    }
}
