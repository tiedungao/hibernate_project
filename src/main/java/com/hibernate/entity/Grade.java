package com.hibernate.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Grade implements Serializable {

    private Integer gid;
    private String gname;
    private String remakes;
    private Set<Student> studentSet = new HashSet<Student>();


    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getRemakes() {
        return remakes;
    }

    public void setRemakes(String remakes) {
        this.remakes = remakes;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Grade() {
    }

    public Grade(String gname, String remakes) {
        this.gname = gname;
        this.remakes = remakes;
    }
}
