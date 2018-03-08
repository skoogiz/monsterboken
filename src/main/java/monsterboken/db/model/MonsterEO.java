package monsterboken.db.model;

import java.util.Optional;

import monsterboken.core.model.Rarity;

public class MonsterEO {
	
	private Optional<Long> id;
	private String name;
	private HabitatEO habitat;
	private Rarity rarity;
	
	public MonsterEO() {
		
	}
	
	public MonsterEO(Long id, String name, HabitatEO habitat, Rarity rarity) {
		this.id = Optional.of(id);
		this.name = name;
		this.habitat = habitat;
		this.rarity = rarity;
	}
}
