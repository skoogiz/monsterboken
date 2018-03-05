package monsterboken.core.model;

import java.util.Optional;

public class Monster {

	private final Optional<Long> id;
	private final String name;
	private final Habitat habitat;
	private final Rarity rarity;

	private Monster(Optional<Long> id, String name, Habitat habitat, Rarity rarity) {
		super();
		this.id = id;
		this.name = name;
		this.habitat = habitat;
		this.rarity = rarity;
	}

	public Optional<Long> getId() {
		return id;
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

	public static Monster create(Long id, String name, Habitat habitat, Rarity rarity) {
		return new Monster(Optional.of(id), name, habitat, rarity);
	}

	public static Monster create(String name, Habitat habitat, Rarity rarity) {
		return new Monster(Optional.empty(), name, habitat, rarity);
	}
}
