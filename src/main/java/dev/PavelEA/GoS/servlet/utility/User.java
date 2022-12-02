package dev.PavelEA.GoS.servlet.utility;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable, Comparable<User> {
    @Id
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "victory")
    private int victory;
    @Column(name = "defeat")
    private int defeat;
    @Column(name = "attempts")
    private int attempts;

    @Override
    public int compareTo(User o) {
        return 0;
    }

}