ackage monsterboken.core.model;

public class Monster {

	private final String name;
	private final Habitat habitat;
	private final Rarity rarity;

	private Monster(String name, Habitat habitat, Rarity rarity) {
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

	public static Monster create(String name, Habitat habitat, Rarity rarity) {
		return new Monster(name, habitat, rarity);
	}
}
