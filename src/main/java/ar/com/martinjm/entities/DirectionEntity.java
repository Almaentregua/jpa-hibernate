package ar.com.martinjm.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Direction")
@Table(name = "direccion")
@Getter
@Setter
public class DirectionEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "calle")
    private String street;

    @Column(name = "numero")
    private Integer streetNumber;

    public DirectionEntity() {
    }
}
