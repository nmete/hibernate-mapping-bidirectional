package org.example.OTM_MTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Card {
    @Id
    int id;
    String name;
    @OneToMany(mappedBy="card")
    List<Items> iems;

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

    public List<Items> getIems() {
        return iems;
    }

    public void setIems(List<Items> iems) {
        this.iems = iems;
    }
}
