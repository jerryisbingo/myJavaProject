package com.cb.pojo;

import java.io.Serializable;

/**
 * @Description：
 * @Date 2017-12-6 09:47
 * @Author 陈斌
 */
public class User implements Serializable {
    private Long id;
    private String code;
    private String name;
    private Integer age;

    public User() {
    }

    public User(Long id, String code, String name, Integer age) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
