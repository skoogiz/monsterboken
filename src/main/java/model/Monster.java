package model;

public final class Monster {
	
	private final String name;
	private static Habitat habitat;
	private static Rarity rarity;
	
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
