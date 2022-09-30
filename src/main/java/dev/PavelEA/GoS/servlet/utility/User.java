package dev.PavelEA.GoS.servlet.utility;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
public class User implements Serializable, Comparable<User> {
    private String username;
    private int victory;
    private int defeat;
    private int attempts;

    @Override
    public int compareTo(User o) {
        return 0;
    }

}
