package hey.car.user.user.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true, length = 191)
    private String username;

    @Enumerated(EnumType.STRING)
    private UserType type;

    private String email;

    private String phone;

    private Instant createdAt;

    private Instant updatedAt;


}
