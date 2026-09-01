package com.coreJava.pack10_Oops.encapsulation;

public class PrivateData {
    String name;
    int age;

    private String email;
    private String mobile;

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

//    ! using "this" keyword
    public void setEmail(String email) {
        this.email = email;
    }

//    ! without using "this" keyword
    public void setMobile(String mobile, PrivateData pd) {
        pd.mobile = mobile;
    }


}
