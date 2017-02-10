package jnvarzea.bean;

import jnvarzea.bean.Person;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created on 03/02/17.
 */
public class Document {
    private String title;
    private String content;
    private Date creationDate;
    private Date lastModification;

    @NotNull
    private Person creator;

    private Person lastModifier;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModification() {
        return lastModification;
    }

    public void setLastModification(Date lastModification) {
        this.lastModification = lastModification;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public Person getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(Person lastModifier) {
        this.lastModifier = lastModifier;
    }
}
