package com.ctban.swallow.dto;

/**
 * @author GuoJie 2018/7/5 14:43
 */
public class UserDTO {

    private String userName;

    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
