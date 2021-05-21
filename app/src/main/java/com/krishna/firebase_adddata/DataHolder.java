package com.krishna.firebase_adddata;

public class DataHolder {

    String Name,Email,Mobile;

    public DataHolder(String name, String email, String mobile) {
        Name = name;
        Email = email;
        Mobile = mobile;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }
}
