package dev.PavelEA.GoS.servlet.utility;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class UserRepository {
    private Map<String, User> users = new HashMap<>();

    public void save(User user) {
        users.put(user.getUsername(), user);
    }

    public void delete(User user) {
        users.remove(user.getUsername());
    }

    public User fetchByUsername(String username) {
        return users.get(username);
    }

    public boolean isExists(String username) {
        return users.containsKey(username);
    }

    public Collection<User> getUsers() {
        return users.values();
    }
}
