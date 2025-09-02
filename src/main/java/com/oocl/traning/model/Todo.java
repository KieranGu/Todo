package com.oocl.traning.model;

import jakarta.persistence.*;

@Entity
@Table
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private Boolean complete;
    //把status改成enum


    public Todo(int id, String title, String complete) {
        this.id = id;
        this.title = title;
        if (complete == null || complete.isEmpty()) {
            this.complete = false;
        } else
        this.complete = false;
    }
    public Todo(String title, String complete) {
        this.title = title;
        this.complete = false;
    }
    public Todo(String title) {
        this.title = title;
        this.complete = false;
    }
    public Todo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }
}
