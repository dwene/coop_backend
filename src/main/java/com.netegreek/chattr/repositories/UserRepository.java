package com.netegreek.chattr.repositories;

import com.netegreek.chattr.db.User;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * TODO: This needs to actually hook-up with the database.
 */
public class UserRepository {

    @Inject
    public UserRepository() {
    }

    private Map<UUID, User> userRepository = new HashMap<UUID, User>();

    public Optional<User> getById(UUID uuid) {
        if (this.userRepository.containsKey(uuid)) {
            return Optional.of(this.userRepository.get(uuid));
        } else {
            return Optional.empty();
        }
    }

    public Optional<User> getByFBID(Long id) {

        for (Map.Entry<UUID, User> user : userRepository.entrySet()) {
            if (user.getValue().getFacebookId().equals(id)) {
                return Optional.of(user.getValue());
            }
        }
        return Optional.empty();
    }

    public void save(User user) {
        this.userRepository.put(user.getId(), user);
    }
}
