package jp.co.mforce.sample.springpractice.entity;

import org.seasar.doma.*;

@Entity
public class Customer {

    @Id
    public String id;

    public String name;

    public String email;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
