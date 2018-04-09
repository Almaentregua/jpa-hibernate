package ar.com.martinjm.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Autor")
@Table(name = "autor")
@Getter
@Setter
public class AutorEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id_autor")
    private Integer autor_id;

    @Column(name = "nombre")
    private String name;

    @OneToMany(mappedBy = "autorEntity", fetch = FetchType.LAZY)
    private List<BookEntity> listBookEntities;
}
