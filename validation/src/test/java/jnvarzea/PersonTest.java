package jnvarzea;

import jnvarzea.bean.Person;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.*;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created on 03/02/17.
 */
public class PersonTest {
    private static Validator validator;
    private Set<ConstraintViolation<Person>> violations;
    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    @Test
    public void testNOk0() {
        Person p2 = new Person();
        p2.setFirstName("21");
        p2.setLastName("a");
        p2.setEmail("21");
        p2.setLogin(null);
        violations = validator.validate(p2);
        assertEquals(4, violations.size());
    }


    @Test
    public void testNOk1(){
        Person p = new Person("Jean", "Francois", "Jade", "jeanfrancois@gmail.com", false);
        Set<ConstraintViolation<Person>> violations = validator.validate(p);
        assertEquals(0, violations.size());
    }

    @Test
    public void testNOk2(){
        Person p = new Person("Josh", "Francois", "", "joshfrancois@gmail.com", false);
        Set<ConstraintViolation<Person>> violations = validator.validate(p);
        assertEquals(1, violations.size());
    }

    @Test
    public void testNOkBadLastNameBadLogin(){
        Person p = new Person("Josh", "f", "", "joshfrancois@gmail.com", false);
        Set<ConstraintViolation<Person>> violations = validator.validate(p);
        assertEquals(2, violations.size());
    }

    @Test
    public void testNOkNoMailBadLastName(){
        Person p = new Person("Josh", "f", "BashExp", null , false);
        Set<ConstraintViolation<Person>> violations = validator.validate(p);
        assertEquals(2, violations.size());
    }

}