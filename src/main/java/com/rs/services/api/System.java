package com.rs.services.api;

/**
 * Created by ravisharma on 7/23/2016.
 */
public class System {

    private long id;
    private String name;

    public System(long id , String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
