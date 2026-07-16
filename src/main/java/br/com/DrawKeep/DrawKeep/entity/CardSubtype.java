package br.com.DrawKeep.DrawKeep.entity;

import br.com.DrawKeep.DrawKeep.entity.enums.SubtypeCategory;
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

    public CardSubtype() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubtypeCategory getCategory() {
        return category;
    }

    public void setCategory(SubtypeCategory category) {
        this.category = category;
    }
}
