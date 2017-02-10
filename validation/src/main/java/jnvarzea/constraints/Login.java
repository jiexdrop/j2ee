package jnvarzea.constraints;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Created on 10/02/17.
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {LoginValidator.class})
public @interface Login {
    String message() default "login incorrect : chain of 2 at 8 chars";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
