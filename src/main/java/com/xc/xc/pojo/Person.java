package com.xc.xc.pojo;

import java.io.Serializable;

public class Person implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private int age;
    //等级
    private String rank;
    //所在部门
    private String department;

    public Person() {
        super();
    }

    public Person(Integer id, String name, String sex, int age, String rank, String department) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.rank = rank;
        this.department = department;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", rank='" + rank + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

}
