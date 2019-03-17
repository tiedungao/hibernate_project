package com.hibernate.entity;

import java.io.Serializable;

/**
 * @Auther: gaoti
 * @Date: 2018/11/12 11:59
 * @Description:
 */
public class Student implements Serializable {

    private Integer sid;
    private String sname;
    private String sex;
    private Integer gid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Student(){

    }

    public Student( String sname, String sex) {
        this.sname = sname;
        this.sex = sex;
    }
}
