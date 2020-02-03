package com.era.edu.generic.boot.domain;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="hol_question")
public class HolQuestion implements Serializable{
    private static final long serialVersionUID = 3L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer holId;
    private String text;
    private String mark1;
    private String mark2;

    public HolQuestion() {

    }
    public Integer getHolId() {
        return holId;
    }

    public void setHolId(Integer holId) {
        this.holId = holId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMark1() {
        return mark1;
    }

    public void setMark1(String mark1) {
        this.mark1 = mark1;
    }

    public String getMark2() {
        return mark2;
    }

    public void setMark2(String mark2) {
        this.mark2 = mark2;
    }
}
