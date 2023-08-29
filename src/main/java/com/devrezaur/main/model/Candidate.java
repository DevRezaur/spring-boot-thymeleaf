package com.devrezaur.main.model;

public class Candidate {

    private Integer id;
    private String name;
    private String batch;

    public Candidate() {
    }

    public Candidate(Integer id, String name, String batch) {
        this.id = id;
        this.name = name;
        this.batch = batch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
