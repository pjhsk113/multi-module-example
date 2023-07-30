package user;

import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
public class UserReader {
    private final UserRepository userRepository;

    public UserReader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User read(Long id) {
        return userRepository.read(id)
                .orElseThrow(() -> new NoSuchElementException());
    }
}
