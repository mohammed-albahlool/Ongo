package com.example.logo;

import android.graphics.drawable.Drawable;

public class Person {

    String name , email ;
    int imagebutton ;

    public Person(String name, String email, int imagebutton) {
        this.name = name;
        this.email = email;
        this.imagebutton = imagebutton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImagebutton() {
        return imagebutton;
    }

    public void setImagebutton(int imagebutton) {
        this.imagebutton = imagebutton;
    }
}
