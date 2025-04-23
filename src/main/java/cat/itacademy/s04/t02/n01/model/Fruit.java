package cat.itacademy.s04.t02.n01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quilsQuantity;

    public Fruit() {
    }

    public Fruit(String name, int quilsQuantity) {
        this.name = name;
        this.quilsQuantity = quilsQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuilsQuantity() {
        return quilsQuantity;
    }

    public void setQuilsQuantity(int quilsQuantity) {
        this.quilsQuantity = quilsQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
