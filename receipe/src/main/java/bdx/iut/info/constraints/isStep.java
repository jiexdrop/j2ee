package bdx.iut.info.constraints;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jnvarzea on 08/03/17.
 */

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {IsStepValidator.class})

public @interface isStep{
    String message() default "isStep incorrect : chain of 5 at 500 chars";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}