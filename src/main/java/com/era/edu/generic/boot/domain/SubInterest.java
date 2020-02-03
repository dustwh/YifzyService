package com.era.edu.generic.boot.domain;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="sub_interest")
public class SubInterest implements Serializable{
    private static final long serialVersionUID = 3L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer siId;
    private String text;

    public SubInterest() {

    }
    public SubInterest(String text) {
        this.text = text;
    }

    public Integer getSiId() {
        return siId;
    }

    public void setSiId(Integer siId) {
        this.siId = siId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
