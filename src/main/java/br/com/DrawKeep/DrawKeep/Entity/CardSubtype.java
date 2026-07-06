package br.com.DrawKeep.DrawKeep.Entity;

import br.com.DrawKeep.DrawKeep.Enums.SubtypeCategory;
import jakarta.persistence.*;

@Entity
@Table(name="card_subtype")
public class CardSubtype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SubtypeCategory category;
}
