package org.academiadecodigo.bootcamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


@Entity
    @Table(name = "user") // model the database user table


    public class User {

        @Id // models the primary key of the entity
        private Integer id;

        private String name;
        private String email;

        @Transient // exclude field from the persistent state
        private String password;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Version
        private Integer version;

        @CreationTimestamp
        private Date creationTime;

        @UpdateTimestamp
        private Date updateTime;

        private String name;
        private String email;


        // getters and setters


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }






    }



