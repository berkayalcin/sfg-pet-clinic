package guru.springframework.sfgpetclinic.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    private String firstName;
    private String lastName;

}
