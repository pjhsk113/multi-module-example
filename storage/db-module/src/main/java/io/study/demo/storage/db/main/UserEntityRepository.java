package io.study.demo.storage.db.main;

import io.study.demo.domain.user.User;
import io.study.demo.domain.user.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
class UserEntityRepository implements UserRepository {
    private final UserJpaRepository userJpaRepository;

    public UserEntityRepository(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public Long add(String name) {
        UserEntity userEntity = new UserEntity(name);
        return userJpaRepository.save(userEntity).getId();
    }

    @Override
    public Optional<User> read(Long id) {
        UserEntity userEntity = userJpaRepository.findById(id).orElse(null);
        if (userEntity == null) {
            return Optional.empty();
        }
        return Optional.of(new User(userEntity.getId(), userEntity.getName()));
    }
}
