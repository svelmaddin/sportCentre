package az.sportcentre.model.gym;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String country;
    private String city;
    private String metroStation;
    private String street;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="hall_id")
    private SportHall sportHall;
}
