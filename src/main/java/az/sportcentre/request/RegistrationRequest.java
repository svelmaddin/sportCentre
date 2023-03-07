package az.sportcentre.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
