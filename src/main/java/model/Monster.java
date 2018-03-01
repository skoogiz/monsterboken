package model;

public final class Monster {
	
	private final String name;
	private final Habitat habitat;
	private final Rarity rarity;
	
	public Monster(String name, Habitat habitat, Rarity rarity) {
		super();
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
