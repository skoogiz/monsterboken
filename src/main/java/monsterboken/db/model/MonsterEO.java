/**
 * 
 */
package monsterboken.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import monsterboken.core.model.Mappable;
import monsterboken.core.model.Monster;
import monsterboken.core.model.Rarity;

@Entity
public class MonsterEO implements EntityObject, Mappable<Monster> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "MONSTER_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "HABITAT_ID")
    private HabitatEO habitat;

    @Enumerated(EnumType.STRING)
    @Column(name = "RARITY")
    private Rarity rarity;

    public static MonsterEO create(Monster monster) {
        MonsterEO eo = new MonsterEO();
        monster.getId().ifPresent(eo::setId);
        eo.setName(monster.getName());
        eo.setHabitat(HabitatEO.create(monster.getHabitat()));
        eo.setRarity(monster.getRarity());
        return eo;
    }

    @Override
    public Monster map() {
        return Monster.create(name, habitat.map(), rarity);
    }

    @Override
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

    public HabitatEO getHabitat() {
        return habitat;
    }

    public void setHabitat(HabitatEO habitat) {
        this.habitat = habitat;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

}
