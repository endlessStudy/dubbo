package com.tearsmart.domain;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 * @author tear-smart
 * @date 2019-02-15
 */
public class User implements Serializable {
    private static final long serialVersionUID = -2668999087589887337L;
    private Long id;
    private String username;
    private String password;
    private Integer age;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
