package com.alma.methoda;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

@Entity
@Table(name= "status")
@EntityListeners({AuditingEntityListener.class})
public class Status {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "name_s", updatable = false)
        private String name_s;

        @Column(name = "label_s")
        private String label_s;

        public Status(){}

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName_s() {
                return name_s;
        }

        public void setName_s(String name_s) {
                this.name_s = name_s;
        }

        public String getLabel_s() {
                return label_s;
        }

        public void setLabel_s(String label_s) {
                this.label_s = label_s;
        }
}