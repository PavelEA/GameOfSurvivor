package dev.PavelEA.GoS.servlet.utility.repository;

import dev.PavelEA.GoS.servlet.utility.model.User;

import static java.util.Objects.isNull;



public class UserServiceDB {
    UserRepositoryDB userRepository;

    public User createUser(String username, int attempts, int defeat, int victory) {
        User player = User.builder()
                .username(username)
                .attempts(attempts)
                .defeat(defeat)
                .victory(victory)
                .build();
        userRepository.save(player);
        return null;
    }
    public User getUser(){
        return null;
    }

//    public User updateUser(String username, int attempts, int defeat, int victory) {
//        User user;
//
//                userRepository.findById(id).orElse(null);
//        if (isNull(player)) {
//            return null;
//        }
//
//        boolean needUpdate = false;
//
//        if (!username.isEmpty()) {
//            user.setUsername(username);
//            needUpdate = true;
//        }
//        if (!StringUtils.isEmpty(title) && title.length() <= 30) {
//            player.setTitle(title);
//            needUpdate = true;
//        }
//        if (nonNull(race)) {
//            player.setRace(race);
//            needUpdate = true;
//        }
//        if (nonNull(profession)) {
//            player.setProfession(profession);
//            needUpdate = true;
//        }
//
//        if (nonNull(banned)) {
//            player.setBanned(banned);
//            needUpdate = true;
//        }
//
//        if (needUpdate) {
//            playerRepository.update(player);
//        }
//
//        return player;
//    }

    public User delete(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (isNull(user)) {
            return null;
        }
        userRepository.delete(user);
        return user;
    }
}

