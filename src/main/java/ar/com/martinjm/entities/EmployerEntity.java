package ar.com.martinjm.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Employe")
@Table(name = "empleado")
@Getter
@Setter
public class EmployerEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer code;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellido")
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_direccion")
    private DirectionEntity directionEntity;

    public EmployerEntity() {
    }
}
