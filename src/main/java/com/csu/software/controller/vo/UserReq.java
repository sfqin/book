package com.csu.software.controller.vo;


public class UserReq {

    private String userAccount;
    private String password;
    private Byte role;
    private String userName;
    private String helloWord;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHelloWord() {
        return helloWord;
    }

    public void setHelloWord(String helloWord) {
        this.helloWord = helloWord;
    }

    @Override
    public String toString() {
        return "UserReq{" +
                "userAccount='" + userAccount + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", userName='" + userName + '\'' +
                ", helloWord='" + helloWord + '\'' +
                '}';
    }
}
