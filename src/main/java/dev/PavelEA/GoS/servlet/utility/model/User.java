package dev.PavelEA.GoS.servlet.utility.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Builder @NoArgsConstructor @AllArgsConstructor
@Setter @ToString @Getter
@Entity
@Table(name = "users")
public class User implements Serializable, Comparable<User> {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "victory")
    private int victory;
    @Column(name = "defeat")
    private int defeat;
    @Column(name = "attempts", nullable = false)
    private int attempts;

    @Override
    public int compareTo(User o) {
        return 0;
    }

}