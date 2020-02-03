package com.era.edu.generic.boot.domain;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="enn_question")
public class EnnQuestion implements Serializable{
    private static final long serialVersionUID = 3L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ennId;
    private String textA;
    private String textB;

    public EnnQuestion() {

    }

    public Integer getEnnId() {
        return ennId;
    }

    public void setEnnId(Integer ennId) {
        this.ennId = ennId;
    }

    public String getTextA() {
        return textA;
    }

    public void setTextA(String textA) {
        this.textA = textA;
    }

    public String getTextB() {
        return textB;
    }

    public void setTextB(String textB) {
        this.textB = textB;
    }
}
