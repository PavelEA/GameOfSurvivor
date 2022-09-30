package dev.PavelEA.GoS.servlet.utility;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRepositoryTest {
    @Test
    void fetchByUsername() {
        String userName = "username";
        User expected = new User();
        expected.setUsername(userName);
        UserRepository userRepository = new UserRepository();
        userRepository.save(expected);
        Collection<User> users = userRepository.getUsers();
        expected = users.stream().toList().get(0);
        User actual = userRepository.fetchByUsername(userName);
        assertEquals(expected, actual);
    }
}

