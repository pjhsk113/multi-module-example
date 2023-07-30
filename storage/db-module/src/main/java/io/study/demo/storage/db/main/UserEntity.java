package io.study.demo.storage.db.main;

import jakarta.persistence.Entity;

@Entity
class UserEntity extends BaseEntity {
    private String name;

    protected UserEntity() { }

    public UserEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
