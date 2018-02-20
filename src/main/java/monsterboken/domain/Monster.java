package monsterboken.domain;

public class Monster {

    private String name;

    private Habitat habitat;

    private Rarity rarity;

    public Monster(String name, Habitat habitat, Rarity rarity) {
        this.name = name;
        this.habitat = habitat;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public Rarity getRarity() {
        return rarity;
    }
}
