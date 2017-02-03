package bean;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created on 03/02/17.
 */
public class Person {
    @Pattern(regexp = "[a-zA-Z]*",message = "first name error")
    private String firstName;
    @Pattern(regexp = "[a-zA-Z]{2,12}",message = "first name error")
    private String lastName;

    public Person() {
    }

    private String login;

    @NotNull
    @Email(message = "incorrect format")
    private String email;gi
    private Boolean isStudent;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getStudent() {
        return isStudent;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStudent(Boolean student) {
        isStudent = student;
    }
}
