package com.sanver.learning.cucumbersample;

public class User {
    private String userName;
    private String password;

    String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
