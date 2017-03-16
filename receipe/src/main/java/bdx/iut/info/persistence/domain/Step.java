package bdx.iut.info.persistence.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import bdx.iut.info.constraints.*;

/**
 * Created by rgiot on 06/02/17.
 */
@Entity
@Table(name="step")
public class Step implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @isStep
    private String stepText;

    private String base64Image;

    // Automatically generated code

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStepText() {
        return stepText;
    }

    public void setStepText(String stepText) {
        this.stepText = stepText;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }


    @Override
    public String toString() {
        return stepText;
    }
}
