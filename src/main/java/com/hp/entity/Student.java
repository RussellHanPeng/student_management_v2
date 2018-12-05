package com.hp.entity;

import com.hp.entity.basic.BasicEntity;

public class Student extends BasicEntity{

    //学号
    private Integer sno;

    private String name;

    //性别（1-男 2-女）
    private Integer gender;

    private Integer age;

    private String sdept;


    public Student() {
    }

    public Student(Integer sno, String name, Integer gender, Integer age, String sdept) {
        this.sno = sno;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.sdept = sdept;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", sdept='" + sdept + '\'' +
                ", id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
