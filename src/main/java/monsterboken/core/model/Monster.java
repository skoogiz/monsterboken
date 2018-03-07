package monsterboken.core.model;

import java.util.Optional;

public final class Monster{
	
	private final Optional<Long> id;
	private final String name;
	private final Habitat habitat;
	private final Rarity rarity;
	
	private Monster(Optional id, String name, Habitat habitat, Rarity rarity) {
		super();
		this.id = id;
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
