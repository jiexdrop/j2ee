package jnvarzea.bean;

import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created on 03/02/17.
 */
public class Project {
    private List<Person> teatchers;
    private List<Person> students;
    private List<Person> customers;
    private List<Document> myDocuments;

    @NotNull
    private String name;

    @Size(max=2000)
    private String description;

    @URL
    private String urlRepository;

    public Project(){

    }
}
