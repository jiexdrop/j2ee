package jnvarzea.constraints;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Created on 10/02/17.
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {LastNameValidator.class})
public @interface LastName {
    String message() default "lastName incorrect : chain of 2 at 12 chars";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
