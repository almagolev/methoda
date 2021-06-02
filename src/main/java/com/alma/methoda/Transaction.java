package com.alma.methoda;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name= "transaction")
@EntityListeners({AuditingEntityListener.class})
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_t", updatable = false)
    private String name_t;

    @Column(name = "from_s")
    private String from_s;

    @Column(name = "to_s")
    private String to_s;

    public Transaction(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_t() {
        return name_t;
    }

    public void setName_t(String name_t) {
        this.name_t = name_t;
    }

    public String getFrom_s() {
        return from_s;
    }

    public void setFrom_s(String from_s) {
        this.from_s = from_s;
    }

    public String getTo_s() {
        return to_s;
    }

    public void setTo_s(String to_s) {
        this.to_s = to_s;
    }
}
