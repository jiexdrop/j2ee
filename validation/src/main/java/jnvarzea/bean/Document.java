package jnvarzea.bean;

import jnvarzea.bean.Person;

import java.util.Date;

/**
 * Created on 03/02/17.
 */
public class Document {
    String title;
    String content;
    Date creationDate;
    Date lastModification;

    Person creator;
    //Can be null
    Person lastModifier;
}
