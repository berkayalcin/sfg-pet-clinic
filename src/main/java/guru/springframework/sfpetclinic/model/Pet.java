package guru.springframework.sfpetclinic.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
