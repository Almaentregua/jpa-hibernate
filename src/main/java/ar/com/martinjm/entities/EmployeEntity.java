package ar.com.martinjm.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "Employe")
@Table(name = "EmployeEntity")
@Getter
@Setter
public class EmployeEntity implements Serializable {
    @Id
    @Column(name = "id")
    private Integer code;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellido")
    private String lastName;

    public EmployeEntity() {
    }
}
