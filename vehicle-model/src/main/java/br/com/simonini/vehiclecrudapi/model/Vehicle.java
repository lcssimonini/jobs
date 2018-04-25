package br.com.simonini.vehiclecrudapi.model;

import br.com.simonini.vehiclecrudapi.model.listeners.VehicleEntityListeners;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@EntityListeners({VehicleEntityListeners.class})
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehicle_sequence")
    @SequenceGenerator(name = "vehicle_sequence", sequenceName = "vehicle_sequence", allocationSize = 1)
    private Long id;

    @NotBlank
    @Max(40)
    private String brand;

    @NotBlank
    @Max(50)
    private String model;

    @NotBlank
    @Max(30)
    private String color;

    @NotNull
    @Min(0)
    private Integer year;

    @NotNull
    @Min(0)
    private Double price;

    private String description;

    private Boolean isNew;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}
