package com.example.logo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "works")
public class Work {

    @PrimaryKey(autoGenerate = true)
    private int id ;

    @ColumnInfo(name = "firstname")
    private String firstname ;
    @ColumnInfo(name = "lastname")
    private String lastname ;
    @ColumnInfo(name = "email")
    private String email ;
    @ColumnInfo(name = "phone")
    private int phone ;
    @ColumnInfo(name = "about")
    private String about ;


    public Work(int id, String firstname, String lastname, String email, int phone, String about) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
