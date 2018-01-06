package com.hsnthn.model;

import org.springframework.data.annotation.Id;

public class Proverb {

    @Id
    private String id;
    private String text;

    public Proverb() {
    }

    public Proverb(String text) {
        this.text = text;
    }

    //Getter Setter
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}