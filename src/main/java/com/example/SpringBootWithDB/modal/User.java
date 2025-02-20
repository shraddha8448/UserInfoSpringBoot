package com.example.SpringBootWithDB.modal;

import jakarta.persistence.*;

@Entity
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    private String fName;
    private String lName;

    public String getfName() {

        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {

        return lName;
    }

    public void setlName(String lName) {

        this.lName = lName;
    }


}
