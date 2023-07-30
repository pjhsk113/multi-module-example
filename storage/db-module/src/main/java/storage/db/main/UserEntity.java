package storage.db.main;

import jakarta.persistence.Entity;

@Entity
class UserEntity extends BaseEntity {
    private String name;

    protected UserEntity() { }
}
