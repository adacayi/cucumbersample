package com.sanver.learning.cucumbersample;

@SuppressWarnings("unused")
class User {
    private String userName;
    private String password;

    String getUserName() {
        return userName;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    String getPassword() {
        return password;
    }

    void setPassword(String password) {
        this.password = password;
    }

    User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
