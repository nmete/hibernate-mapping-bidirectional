package org.example.onetoonebi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
    @Id
    int id;
    String name;
    String address;
  //  @OneToOne(mappedBy = "adhar")
    @OneToOne
    Adhar adhar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Adhar getAdhar() {
        return adhar;
    }

    public void setAdhar(Adhar adhar) {
        this.adhar = adhar;
    }
}
