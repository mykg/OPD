package com.example.login;

public class user {

    String id2;
    String name2;
    String aadhar2;
    String phn2;
    String add2;
    String mail2;
    String passwd2;

    public user(){ }

    public user(String id2,String name2, String aadhar2, String phn2, String add2, String passwd2, String mail2) {
        this.name2 = name2;
        this.aadhar2 = aadhar2;
        this.phn2 = phn2;
        this.add2 = add2;
        this.passwd2 = passwd2;
        this.mail2 = mail2;
    }

    public String getName2() {
        return name2;
    }

    public String getAadhar2() {
        return aadhar2;
    }

    public String getPhn2() {
        return phn2;
    }

    public String getAdd2() {
        return add2;
    }

    public String getId2() {
        return id2;
    }

    public String getMail2() {
        return mail2;
    }

    public String getPasswd2() {
        return passwd2;
    }
}
